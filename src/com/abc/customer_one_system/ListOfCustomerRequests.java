/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;

/**
 *
 * @author test
 */
public class ListOfCustomerRequests extends javax.swing.JFrame {

    /**
     * Creates new form ListOfCustomerRequest
     */
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request Type", "Account Number", "Account Type", "Customer Name", "Request Date", "Status"
            }
        ));
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitleListOfCustReq)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblReqTypeListOfCustReq, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(lblStatusListOfCustReq, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbStatusListOfCustReq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbRequestTypeListOfCustReq, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void btnSubmitListOfCustReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitListOfCustReqActionPerformed
        // TODO add your handling code here:
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