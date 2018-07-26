/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
//import java.sql.Statement;
//import static javax.management.remote.JMXConnectorFactory.connect;

/**
 *
 * @author test
 */
public class ListOfCustomerRequests extends javax.swing.JFrame {

    /**
     * Creates new form ListOfCustomerRequest
     */
    public static int requestTypeVal = 0;
    public static String requestStatus, requestType;
    public static int csr_id;

    public void statusCheck(int type, String status) throws Exception {
        //  ConnectionClass concls = new ConnectionClass();
        Connection con = ConnectionClass.getConnected();
        Statement stmt = con.createStatement();
        //pstmt.setInt(1,type);
        // pstmt.setString(2,status);
        String query = "select cr.csr_type,cr.account_number,c.name,a.acc_type,cr.csr_date,cr.csr_status from customer_service_request cr join account a on cr.account_number = a.account_number join customer c on a.customer_id = c.customer_id where cr.csr_type=" + type + " and cr.csr_status='" + status + "'";

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            int typeVal = rs.getInt(1);
            String reqType = "";
            switch (type) {
                case 1:
                    reqType = "Cheque Book";
                    break;
                case 3:
                    reqType = "Lost/Stolen Card";
                    break;
                case 5:
                    reqType = "Disputed Transaction";
                    break;
                case 6:
                    reqType = "Redeem";
                    break;

            }
            int acNo = rs.getInt(2);
            String acType = rs.getString(3);
            String custName = rs.getString(4);
            Date reqDate = rs.getDate(5);
            String rStatus = rs.getString(6);
            DefaultTableModel model = (DefaultTableModel) tblListOfCustReq.getModel();
            model.addRow(new Object[]{reqType, acNo, acType, custName, reqDate, rStatus});
            //String x=model.getValueAt(tblListOfCustReq.getSelectedRow(),1).toString();
        }
        // tblListOfCustReq.setModel(model);

    }

    public ListOfCustomerRequests() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleListOfCustReq = new javax.swing.JLabel();
        lblReqTypeListOfCustReq = new javax.swing.JLabel();
        cmbRequestTypeListOfCustReq = new javax.swing.JComboBox<>();
        cmbStatusListOfCustReq = new javax.swing.JComboBox<>();
        lblStatusListOfCustReq = new javax.swing.JLabel();
        btnSubmitListOfCustReq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListOfCustReq = new javax.swing.JTable();
        btnBackListOfCustReq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitleListOfCustReq.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitleListOfCustReq.setText("List of Customer Requests");

        lblReqTypeListOfCustReq.setText("Request Type");

        cmbRequestTypeListOfCustReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cheque Book", "Disputed Transaction", "Lost/Stolen Card", "Redeem" }));
        cmbRequestTypeListOfCustReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRequestTypeListOfCustReqActionPerformed(evt);
            }
        });

        cmbStatusListOfCustReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Rejected", "Processed" }));
        cmbStatusListOfCustReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusListOfCustReqActionPerformed(evt);
            }
        });

        lblStatusListOfCustReq.setText("Status");

        btnSubmitListOfCustReq.setText("Submit");
        btnSubmitListOfCustReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitListOfCustReqActionPerformed(evt);
            }
        });

        tblListOfCustReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Account Number", "Account Type", "Customer Name", "Request Date", "Status"
            }
        ));
        tblListOfCustReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListOfCustReqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListOfCustReq);

        btnBackListOfCustReq.setText("Back");
        btnBackListOfCustReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackListOfCustReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(150, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStatusListOfCustReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblReqTypeListOfCustReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbStatusListOfCustReq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbRequestTypeListOfCustReq, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitleListOfCustReq)
                                .addGap(26, 26, 26)))
                        .addGap(79, 79, 79)
                        .addComponent(btnSubmitListOfCustReq, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackListOfCustReq, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleListOfCustReq, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReqTypeListOfCustReq)
                    .addComponent(cmbRequestTypeListOfCustReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStatusListOfCustReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusListOfCustReq)
                    .addComponent(btnSubmitListOfCustReq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnBackListOfCustReq)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* public String getAccountNumber(){
         return tblListOfCustReq.getValueAt(tblListOfCustReq.getSelectedRow(), 0).toString();

    }*/

    private void btnSubmitListOfCustReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitListOfCustReqActionPerformed
        int type;
        //String type=(String)cmbRequestTypeListOfCustReq.getSelectedItem();
        String status = (String) cmbStatusListOfCustReq.getSelectedItem();

        if (cmbRequestTypeListOfCustReq.getSelectedItem() == "Cheque Book") {
            try {
                type = 1;
                statusCheck(type, status);
            } catch (Exception ex) {
                Logger.getLogger(ListOfCustomerRequests.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (cmbRequestTypeListOfCustReq.getSelectedItem() == "Disputed Transaction") {
            try {
                type = 5;
                statusCheck(type, status);
            } catch (Exception ex) {
                Logger.getLogger(ListOfCustomerRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (cmbRequestTypeListOfCustReq.getSelectedItem() == "Lost/Stolen Card") {
            try {
                type = 3;
                statusCheck(type, status);

            } catch (Exception ex) {
                Logger.getLogger(ListOfCustomerRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (cmbRequestTypeListOfCustReq.getSelectedItem() == "Redeem") {
            try {
                type = 6;
                statusCheck(type, status);
            } catch (Exception ex) {
                Logger.getLogger(ListOfCustomerRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnSubmitListOfCustReqActionPerformed

    private void cmbRequestTypeListOfCustReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRequestTypeListOfCustReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRequestTypeListOfCustReqActionPerformed

    private void cmbStatusListOfCustReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusListOfCustReqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusListOfCustReqActionPerformed

    private void btnBackListOfCustReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackListOfCustReqActionPerformed
        this.setVisible(false);
        BackOfficeMenu backofficemenu = new BackOfficeMenu();
        backofficemenu.setVisible(true);
    }//GEN-LAST:event_btnBackListOfCustReqActionPerformed

    private void tblListOfCustReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListOfCustReqMouseClicked

        DefaultTableModel model = (DefaultTableModel) tblListOfCustReq.getModel();

        requestType = model.getValueAt(tblListOfCustReq.getSelectedRow(), 0).toString();
        requestStatus = model.getValueAt(tblListOfCustReq.getSelectedRow(), 5).toString();

        if (requestType.equals("Cheque Book")) {
            try {
                requestTypeVal = 1;
                this.setVisible(false);
                ChequebookRequest cbr = new ChequebookRequest(requestTypeVal, requestStatus);
                cbr.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(ListOfCustomerRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
<<<<<<< HEAD
=======

>>>>>>> 55c9634e602235820ab6132f407beb6a0bbdd9f2
        }
        if (requestType.equals("Disputed Transaction")) {
            requestTypeVal = 5;
            this.setVisible(false);
            DisputedTransaction dt = new DisputedTransaction();
            dt.setVisible(true);
        }
        if (requestType.equals("Lost/Stolen Card")) {

<<<<<<< HEAD
=======

>>>>>>> 55c9634e602235820ab6132f407beb6a0bbdd9f2
            }
            if(requestType.equals("Disputed Transaction"))
            {
                requestTypeVal=5;
                this.setVisible(false);
                DisputedTransaction dt = new DisputedTransaction();
                dt.setVisible(true);
            }

            if(requestType.equals("Lost/Stolen Card"))
            {
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 59400ab67396f27b4a64b28ab9083eb573fbcb65

            else if(cmbRequestTypeListOfCustReq.getSelectedItem()=="Lost/stolen Card")
            {   
                this.setVisible(false);
                LostOrStolenCard lst;



>>>>>>> 55c9634e602235820ab6132f407beb6a0bbdd9f2
            try {
                requestTypeVal = 3;
                this.setVisible(false);
                LostOrStolenCard lst = new LostOrStolenCard(requestTypeVal, requestStatus);
                lst.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(ListOfCustomerRequests.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (requestType.equals("Redeem")) {
            requestTypeVal = 6;
            //this.setVisible(false);

        }


    }//GEN-LAST:event_tblListOfCustReqMouseClicked

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
            java.util.logging.Logger.getLogger(ListOfCustomerRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfCustomerRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfCustomerRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfCustomerRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfCustomerRequests().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackListOfCustReq;
    private javax.swing.JButton btnSubmitListOfCustReq;
    private javax.swing.JComboBox<String> cmbRequestTypeListOfCustReq;
    private javax.swing.JComboBox<String> cmbStatusListOfCustReq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReqTypeListOfCustReq;
    private javax.swing.JLabel lblStatusListOfCustReq;
    private javax.swing.JLabel lblTitleListOfCustReq;
    private javax.swing.JTable tblListOfCustReq;
    // End of variables declaration//GEN-END:variables
}
