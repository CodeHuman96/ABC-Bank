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

/**
 *
 * @author test
 */
public class ListOfQueries extends javax.swing.JFrame {

    /**
     * Creates new form ListOfQueries
     */
    public ListOfQueries() {
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

        lblStatusListCq = new javax.swing.JLabel();
        cmbStatusListOfCustQueries = new javax.swing.JComboBox<>();
        btnSubmitListCq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListOfCustQueries = new javax.swing.JTable();
        btnBackListCq = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lblStatusListCq.setText("Status");

        cmbStatusListOfCustQueries.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Rejected", "Processed" }));
        cmbStatusListOfCustQueries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusListOfCustQueriesActionPerformed(evt);
            }
        });

        btnSubmitListCq.setText("Submit");
        btnSubmitListCq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitListCqActionPerformed(evt);
            }
        });

        tblListOfCustQueries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Query Number", "Customer name", "Customer Query", "Query Respone", "Status"
            }
        ));
        tblListOfCustQueries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListOfCustQueriesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListOfCustQueries);
        if (tblListOfCustQueries.getColumnModel().getColumnCount() > 0) {
            tblListOfCustQueries.getColumnModel().getColumn(0).setResizable(false);
            tblListOfCustQueries.getColumnModel().getColumn(1).setResizable(false);
        }

        btnBackListCq.setText("Back");
        btnBackListCq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackListCqActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitle.setText("List of Customer Queries");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnBackListCq, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblStatusListCq, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbStatusListOfCustQueries, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnSubmitListCq, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(241, 241, 241))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusListCq, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatusListOfCustQueries, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmitListCq))
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnBackListCq)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbStatusListOfCustQueriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusListOfCustQueriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusListOfCustQueriesActionPerformed

    private void btnBackListCqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackListCqActionPerformed
        this.setVisible(false);
        BackOfficeMenu backofficemenu = new BackOfficeMenu();
        backofficemenu.setVisible(true);
    }//GEN-LAST:event_btnBackListCqActionPerformed

    private void btnSubmitListCqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitListCqActionPerformed
        
        
        try {
            String status = (String)cmbStatusListOfCustQueries.getSelectedItem();
            
            
            Connection con = ConnectionClass.getConnected();
        
            Statement stmt = con.createStatement();
            
            String query ="select q.csr_id, c.name, q.query, q.query_response,cr.csr_status from customer_query q join customer_service_request cr on q.csr_id=cr.csr_id join account a on cr.account_number=a.account_number join customer c on a.customer_id=c.customer_id where cr.csr_status='"+status+"'"; 
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                int q_no = rs.getInt(1);
                String c_name = rs.getString(2);
                String quer = rs.getString(3);
                String query_res = rs.getString(4);
                String csr_status = rs.getString(5);
                
                DefaultTableModel model = (DefaultTableModel) tblListOfCustQueries.getModel();
                model.addRow(new Object[]{q_no, c_name, quer, query_res,csr_status});
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListOfQueries.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListOfQueries.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnSubmitListCqActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
     /* this.setVisible(false);
      QueryResponse qr = new QueryResponse();
      qr.setVisible(true);
      DefaultTableModel model = (DefaultTableModel) tblListOfCustQueries.getModel();
      qr.getCustomerName(model.getValueAt(tblListOfCustQueries.getSelectedRow(),0).toString());
    */    
    }//GEN-LAST:event_formMouseClicked

    private void tblListOfCustQueriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListOfCustQueriesMouseClicked
        this.setVisible(false);
      QueryResponse qr = new QueryResponse();
      qr.setVisible(true);
      DefaultTableModel model = (DefaultTableModel) tblListOfCustQueries.getModel();
    //  qr.getCustomerName(model.getValueAt(tblListOfCustQueries.getSelectedRow(),0).toString());
   
    }//GEN-LAST:event_tblListOfCustQueriesMouseClicked
     public String getCustomerName(String name)
     {
         return name;
     }
     public String getQueryRevDate(String date)
     {
         return date;
     }
     public String getQuery(String query)
     {
         return query;
     }
      QueryResponse qr = new QueryResponse();
     public void setCustomerName(String name)
     {
         qr.lbltxCustNameCsr7.setText(name);
     }
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
            java.util.logging.Logger.getLogger(ListOfQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfQueries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackListCq;
    private javax.swing.JButton btnSubmitListCq;
    private javax.swing.JComboBox<String> cmbStatusListOfCustQueries;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatusListCq;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblListOfCustQueries;
    // End of variables declaration//GEN-END:variables
}
