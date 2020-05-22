package com.squareprolabs.apiconnector;

import com.google.gson.Gson;
//import org.apache.http.Header;
//import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.message.BasicHeader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;

/**
 * @author gayan_s
 */
public class ApiConnector {

    public static int TIME_OUT = 10000;
    public static String BASE_URL = "";

    private static final String REQUEST_METHOD_GET = "GET";
    private static final String REQUEST_METHOD_POST = "POST";
    private static final String REQUEST_METHOD_PATCH = "PATCH";
    private static final String REQUEST_METHOD_DELETE = "DELETE";


    private static final String API_CONTENT_TYPE = "application/json";

    public static CloseableHttpClient getHttpClientConnection() throws Exception {
        System.out.println("building a closeable http client connection...");
        CloseableHttpClient httpclient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig
                        .custom()
                        .setConnectTimeout(TIME_OUT)
                        .setConnectionRequestTimeout(TIME_OUT)
                        .setSocketTimeout(TIME_OUT)
                        .build()).build();
        System.out.println("successfully build a http client connection...");
        return httpclient;
    }

    public static String performRequest(Object txnObject, String url, String requestMethod) throws IOException {

        Gson gson = null;

        //exchanging methods
        HttpPost apiPost = null;
        HttpGet apiGet = null;
        HttpPatch apiPatch = null;

        //response
        HttpResponse response = null;
        CloseableHttpClient httpClient = null;

        String responseString = null;
        try {
            httpClient = getHttpClientConnection();
            gson = new Gson();
            final String URL = BASE_URL + url;
            System.out.println("connecting to -> " + BASE_URL);
            switch (requestMethod) {
                case REQUEST_METHOD_GET:
                    apiGet = new HttpGet(URL);

                    apiGet.setHeaders(setHeaders());
                    
                    System.out.println("sending to API [GET] -> "+ url);
                    response = httpClient.execute(apiGet);
                    responseString = createResponse(response);
                    break;

                case REQUEST_METHOD_POST:
                    apiPost = new HttpPost(URL);
                    apiPost.setHeaders(setHeaders());
                    apiPost.setEntity(new StringEntity(gson.toJson(txnObject)));

                    System.out.println("Sending to API [POST] ( {"+url+"} ) -> , Body : {"+gson.toJson(txnObject)+"}");

                    response = httpClient.execute(apiPost);
                    responseString = createResponse(response);
                    break;

                case REQUEST_METHOD_PATCH:
                    apiPatch = new HttpPatch(URL);
                    apiPatch.setHeaders(setHeaders());
                    apiPatch.setEntity(new StringEntity(gson.toJson(txnObject)));

                    System.out.println("Sending to API [PATCH] ( {"+url+"} )  -> {"+gson.toJson(txnObject)+"}");

                    response = httpClient.execute(apiPatch);
                    responseString = createResponse(response);
                    break;


                default:
                    System.out.println("HTTP method.!");
                    break;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("[ T24 ] - Releasing HttpClient Connections...");
            if (httpClient != null) {
                httpClient.close();
            }
            if (response != null) {
                response = null;
            }
            if (apiGet != null) {
                apiGet.releaseConnection();
                apiGet = null;
            }
            if (apiPost != null) {
                apiPost.releaseConnection();
                apiPost = null;
            }
            if (apiPost != null) {
                apiPost.releaseConnection();
                apiPost = null;
            }
            System.out.println("Successfully released HttpClient Connections!");

        }
        return responseString;
    }


    private static String createResponse(HttpResponse response) throws Exception {
        String result = "";
        if (response != null) {
            //read response

            BufferedReader br = null;
            InputStreamReader inp = null;
            InputStream ins = null;
            try {
                ins = response.getEntity().getContent();
                inp = new InputStreamReader(ins);
                br = new BufferedReader(inp);
                result = br.lines().collect(Collectors.joining(System.lineSeparator()));
                if (result != null && !result.isEmpty()) {
                    System.out.println("Successfully recieved the Response From API");
                    //map json
                    String errorDescr = "";
                    int statusCode = response.getStatusLine().getStatusCode();
                    if (statusCode == 200) {
                        System.out.println("Success Response From NDB (T24-Teminos) - "+ response.getStatusLine().getStatusCode());
                    } else {
                        System.out.println("Failed Response From NDB (T24-Teminos) - " + response.getStatusLine().getStatusCode());
                    }
                } else {
                    System.out.println("Empty response -> "+ result);
                }

            } catch (Exception e) {
                System.out.println("Execption Occured while creating response");
                throw e;
            } finally {
                if (br != null) {
                    br.close();
                }
                if (inp != null) {
                    inp.close();
                }
                if (ins != null) {
                    ins.close();
                }
                System.out.println("Released Connections successfully!");
            }
        } else {
            System.out.println("Invalid Response From API - null response detected!");
        }
        return result;
    }

    private static Header[] setHeaders() {
        Header[] headers = new Header[1];
        headers[0] = new BasicHeader("content-type", API_CONTENT_TYPE);
        return headers;
    }


}
