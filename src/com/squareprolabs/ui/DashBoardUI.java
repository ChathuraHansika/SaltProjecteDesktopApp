/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.squareprolabs.ui;

import java.awt.CardLayout;
import javax.swing.JFrame;

/**
 *
 * @author Chathura
 */
public class DashBoardUI extends javax.swing.JFrame {

    /**
     * Creates new form DashBoardUI
     */
    public DashBoardUI() {
        initComponents();
        this.setResizable(false);
        loadImages();
    }
    
    public void loadImages(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addProductBttn = new javax.swing.JLabel();
        customersBttn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        suppliersBttn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userBttn = new javax.swing.JLabel();
        userLab = new javax.swing.JLabel();
        currentStocksBttn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salesReportBttn = new javax.swing.JLabel();
        salesReportLab = new javax.swing.JLabel();
        purchaseBttn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setEnabled(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(1560, 899));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navPanel.setBackground(new java.awt.Color(255, 255, 255));
        navPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255)));
        navPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Products");

        addProductBttn.setToolTipText("Products");
        addProductBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductBttnMouseClicked(evt);
            }
        });

        customersBttn.setToolTipText("Customers");
        customersBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersBttnMouseClicked(evt);
            }
        });

        jLabel3.setText("Customers");

        suppliersBttn.setToolTipText("Suppliers");
        suppliersBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliersBttnMouseClicked(evt);
            }
        });

        jLabel5.setText("Suppliers");

        userBttn.setToolTipText("Users");
        userBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userBttnMouseClicked(evt);
            }
        });

        userLab.setText("Users");

        currentStocksBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentStocksBttnMouseClicked(evt);
            }
        });

        jLabel4.setText("Current Stocks");

        salesReportBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesReportBttnMouseClicked(evt);
            }
        });

        salesReportLab.setText("Sales");

        purchaseBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseBttnMouseClicked(evt);
            }
        });

        jLabel7.setText("Purchase");

        jLabel1.setText("Home");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(suppliersBttn))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addProductBttn))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(navPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(userLab))
                            .addComponent(userBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(customersBttn))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(purchaseBttn)
                            .addComponent(jLabel7)))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(currentStocksBttn))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(navPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(salesReportLab))
                            .addComponent(salesReportBttn)))
                    .addGroup(navPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suppliersBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(addProductBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(purchaseBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(customersBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(currentStocksBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(salesReportBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesReportLab)
                .addGap(18, 18, 18)
                .addComponent(userBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLab)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        mainPanel.add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 0, 740, 606));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, 606, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProductBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductBttnMouseClicked
//        addProductsPage();
    }//GEN-LAST:event_addProductBttnMouseClicked

    private void customersBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersBttnMouseClicked
//        addCustomersPage();
    }//GEN-LAST:event_customersBttnMouseClicked

    private void suppliersBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliersBttnMouseClicked
//        addSuppliersPage();
    }//GEN-LAST:event_suppliersBttnMouseClicked

    private void userBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBttnMouseClicked
        /* setContentPane(new Users().mainPanel);
        remove(mainPanel);
        revalidate();
        repaint(); */
//        addUsersPage();
    }//GEN-LAST:event_userBttnMouseClicked

    private void currentStocksBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentStocksBttnMouseClicked
//        addCurrentStocksPage();
    }//GEN-LAST:event_currentStocksBttnMouseClicked

    private void salesReportBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesReportBttnMouseClicked
//        addSalesReportPage();
    }//GEN-LAST:event_salesReportBttnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
//        new Dashboard(userSelect,username);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void purchaseBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseBttnMouseClicked
//        addPurchasePage();
    }//GEN-LAST:event_purchaseBttnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashBoardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoardUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addProductBttn;
    private javax.swing.JLabel currentStocksBttn;
    private javax.swing.JLabel customersBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JLabel purchaseBttn;
    private javax.swing.JLabel salesReportBttn;
    private javax.swing.JLabel salesReportLab;
    private javax.swing.JLabel suppliersBttn;
    private javax.swing.JLabel userBttn;
    private javax.swing.JLabel userLab;
    // End of variables declaration//GEN-END:variables
}
