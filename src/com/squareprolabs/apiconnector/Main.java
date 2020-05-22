package com.squareprolabs.apiconnector;

import com.google.gson.Gson;
import com.squareprolabs.apiconnector.ApiConnector;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Chathura on 11/15/2019.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ApiConnector.BASE_URL="http://localhost:9090/api";
            Test test=new Test();
            test.setName("aaaaa");
            String post = ApiConnector.performRequest(test,"/user/saveuser","POST");
            System.out.println("post = " + post);
            //Test test1 = new Gson().fromJson(post, Test.class);
            //System.out.println(test1.getName());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
