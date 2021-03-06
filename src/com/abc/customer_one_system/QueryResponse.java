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
import com.abc.JDBCConnection.ConnectionClass;
import com.abc.customer_one_system.ListOfQueries;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
public class QueryResponse extends javax.swing.JFrame {

    /**
     * Creates new form QueryResponse
     */
    public QueryResponse() throws Exception
    {
        initComponents();
      //System.out.println(ListOfQueries.customerName);
        //lbltxCustNameCsr7.setText(ListOfQueries.customerName);
        //lbltxQueryRecvOnCsr7.setText(ListOfQueries.queryRevDate);
   
        
    }
  //  public QueryResponse(String queryNumber, String customerName, String customerQuery, String queryResponse, String queryStatus, String queryRevDate)
    public QueryResponse(int queryNumber)throws Exception
    {
        initComponents();
       // lbltxCustNameCsr7.setText(customerName);
        Connection con = ConnectionClass.getConnected();
        Statement stmt = con.createStatement();
        String query = "select  c.name, cr.csr_date, q.query, cr.csr_status, cr.csr_response from customer_query q join customer_service_request cr on q.csr_id=cr.csr_id join account a on cr.account_number=a.account_number join customer c on a.customer_id=c.customer_id where cr.csr_id='"+queryNumber+"'"; 
        
        ResultSet rs = stmt.executeQuery(query);
        
        while(rs.next())
        {
            String customerName = rs.getString(1);
            String queryRevDate = rs.getDate(2).toString();
            String quer = rs.getString(3);
            String queryStatus = rs.getString(4);
            String queryRes = rs.getString(5);
            //ListOfCustomerRequests.csr
            
            lbltxCustNameCsr7.setText(customerName);
            lbltxQueryRecvOnCsr7.setText(queryRevDate);
            lbltxQueryCsr7.setText(quer);
            cmbStatusCsr7.setSelectedItem(queryStatus);
            txtareaResponseCsr7.setText(queryRes);
            
            
            
        }
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleCsr7 = new javax.swing.JLabel();
        lblCustNameCsr7 = new javax.swing.JLabel();
        lbltxCustNameCsr7 = new javax.swing.JLabel();
        lblQueyRecvOnCsr7 = new javax.swing.JLabel();
        lbltxQueryRecvOnCsr7 = new javax.swing.JLabel();
        lblQueryCsr7 = new javax.swing.JLabel();
        lbltxQueryCsr7 = new javax.swing.JLabel();
        lblStatusCsr7 = new javax.swing.JLabel();
        cmbStatusCsr7 = new javax.swing.JComboBox<>();
        lblResponseCsr7 = new javax.swing.JLabel();
        textareaResponseCsr7 = new javax.swing.JScrollPane();
        txtareaResponseCsr7 = new javax.swing.JTextArea();
        btnSubmitCsr7 = new javax.swing.JButton();
        btnRefreshCsr7 = new javax.swing.JButton();
        btnBackCsr7 = new javax.swing.JButton();
        lblStarCsr7 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitleCsr7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitleCsr7.setText("Query Response");

        lblCustNameCsr7.setText("Customer Name");

        lblQueyRecvOnCsr7.setText("Query Received On");

        lblQueryCsr7.setText("Query");

        lblStatusCsr7.setText("Status");

        cmbStatusCsr7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Rejected", "Processed", " " }));

        lblResponseCsr7.setText("Response");

        txtareaResponseCsr7.setColumns(20);
        txtareaResponseCsr7.setRows(5);
        textareaResponseCsr7.setViewportView(txtareaResponseCsr7);

        btnSubmitCsr7.setText("Submit");
        btnSubmitCsr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitCsr7ActionPerformed(evt);
            }
        });

        btnRefreshCsr7.setText("Refresh");
        btnRefreshCsr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshCsr7ActionPerformed(evt);
            }
        });

        btnBackCsr7.setText("Back");
        btnBackCsr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCsr7ActionPerformed(evt);
            }
        });

        lblStarCsr7.setForeground(new java.awt.Color(242, 9, 9));
        lblStarCsr7.setText("*");

        lblMessage.setForeground(new java.awt.Color(239, 37, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(lblTitleCsr7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmitCsr7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblQueyRecvOnCsr7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCustNameCsr7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblQueryCsr7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblStatusCsr7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStarCsr7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResponseCsr7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnRefreshCsr7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(btnBackCsr7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textareaResponseCsr7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbStatusCsr7, javax.swing.GroupLayout.Alignment.LEADING, 0, 272, Short.MAX_VALUE)
                                .addComponent(lbltxCustNameCsr7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltxQueryRecvOnCsr7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltxQueryCsr7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleCsr7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustNameCsr7)
                    .addComponent(lbltxCustNameCsr7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQueyRecvOnCsr7)
                    .addComponent(lbltxQueryRecvOnCsr7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQueryCsr7)
                    .addComponent(lbltxQueryCsr7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusCsr7)
                    .addComponent(cmbStatusCsr7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResponseCsr7)
                            .addComponent(lblStarCsr7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(textareaResponseCsr7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitCsr7)
                    .addComponent(btnRefreshCsr7)
                    .addComponent(btnBackCsr7)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshCsr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshCsr7ActionPerformed
       /* lbltxCustNameCsr7.setText("");
        lbltxQueryCsr7.setText("");
        lbltxQueryRecvOnCsr7.setText("");*/
       
        txtareaResponseCsr7.setText("");
        
    }//GEN-LAST:event_btnRefreshCsr7ActionPerformed

    private void btnBackCsr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCsr7ActionPerformed
        this.setVisible(false);
        ListOfQueries listofqueries = new ListOfQueries();
        listofqueries.setVisible(true);
    }//GEN-LAST:event_btnBackCsr7ActionPerformed

    private void btnSubmitCsr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitCsr7ActionPerformed
            if(cmbStatusCsr7.getSelectedItem().equals("Rejected") &&  txtareaResponseCsr7.getText().equals(""))
            {
                lblMessage.setText("Please Provide a Response!");
            }
            else        
            {
                try {
                    int update=0;
                    int success=0;
                    Connection con = ConnectionClass.getConnected();
                    Statement stmt = con.createStatement();
                     Statement stmt1 = con.createStatement();
                                        System.out.println(success);
 
                    String query = "update customer_service_request set csr_status='"+(String) cmbStatusCsr7.getSelectedItem()+"',csr_response='"+(String)txtareaResponseCsr7.getText()+"'where csr_id="+ListOfQueries.queryNumber;
                    success= stmt.executeUpdate(query);
                    String query1 = "update customer_query set response_time = CURRENT_TIMESTAMP where csr_id="+ListOfQueries.queryNumber;
                    update=stmt1.executeUpdate(query1);
                    
                    
                    if(success==1 && update==1 )
                    {
                        JOptionPane.showMessageDialog(null, "Updated Successfully");
                    }
                       

                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error in Updating!\n Try Again!");
                    }
                    System.out.println(success);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(QueryResponse.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(QueryResponse.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btnSubmitCsr7ActionPerformed

    
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
            java.util.logging.Logger.getLogger(QueryResponse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryResponse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryResponse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryResponse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QueryResponse().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(QueryResponse.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCsr7;
    private javax.swing.JButton btnRefreshCsr7;
    private javax.swing.JButton btnSubmitCsr7;
    private javax.swing.JComboBox<String> cmbStatusCsr7;
    private javax.swing.JLabel lblCustNameCsr7;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblQueryCsr7;
    private javax.swing.JLabel lblQueyRecvOnCsr7;
    private javax.swing.JLabel lblResponseCsr7;
    private javax.swing.JLabel lblStarCsr7;
    private javax.swing.JLabel lblStatusCsr7;
    private javax.swing.JLabel lblTitleCsr7;
    private javax.swing.JLabel lbltxCustNameCsr7;
    private javax.swing.JLabel lbltxQueryCsr7;
    private javax.swing.JLabel lbltxQueryRecvOnCsr7;
    private javax.swing.JScrollPane textareaResponseCsr7;
    private javax.swing.JTextArea txtareaResponseCsr7;
    // End of variables declaration//GEN-END:variable
}
