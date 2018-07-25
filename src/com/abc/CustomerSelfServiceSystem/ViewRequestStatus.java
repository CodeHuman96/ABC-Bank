/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.CustomerSelfServiceSystem;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class ViewRequestStatus extends javax.swing.JFrame {

    /** Creates new form ViewRequestStatus */
    public ViewRequestStatus() {
        initComponents();
        lblName.setText(CustomerServiceMenu.name);
        Iterator itr=CustomerServiceMenu.acc.iterator();
        while(itr.hasNext())
        {
            String s=(String)itr.next();
            cmbAccountNo.addItem(s);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewRequestStatus = new javax.swing.JLabel();
        lblNameField = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRequestType = new javax.swing.JLabel();
        cmbRequestType = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestStatus = new javax.swing.JTable();
        lblAccountNo = new javax.swing.JLabel();
        cmbAccountNo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblViewRequestStatus.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblViewRequestStatus.setText("View Request Status");

        lblNameField.setText("Name:");

        lblRequestType.setText("Request Type:");

        cmbRequestType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Cheque Book", "Lost/Stolen Card", "Disputed Transaction", "Redemption Request", "Query Request" }));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tblRequestStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Request Type", "Request Detail", "Response", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRequestStatus);

        lblAccountNo.setText("Account No:");

        cmbAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccountNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRequestType)
                            .addComponent(lblNameField)
                            .addComponent(lblAccountNo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbRequestType, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(btnSubmit)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(lblViewRequestStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewRequestStatus)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(lblNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNo)
                    .addComponent(cmbAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestType)
                    .addComponent(cmbRequestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void retriveData(int a)
    {
        System.out.print(a);
        if(a==0)
        {
            String req_detail=new String();
        try{
        Connection connect=ConnectionClass.getConnected();
        String query1="select csr_date,csr_type,csr_response,csr_status from customer_service_request where account_number='"+cmbAccountNo.getSelectedItem()+"' order by csr_date desc";
        PreparedStatement stmt=connect.prepareStatement(query1);
        ResultSet rs1=stmt.executeQuery(query1);
        while(rs1.next())
        {
            Date d=rs1.getDate(1);
            int csr_type=rs1.getInt(2);
            String csr_response=rs1.getString(3);
            String csr_status=rs1.getString(4);
            switch (csr_type) {
                case 1:
                    req_detail="Cheque Book Request";
                    break;
                case 3:
                    req_detail="Lost Stolen";
                    break;
                case 5:
                    req_detail="Disputed Transaction";
                    break;
                case 6:
                    req_detail="Reedemption Request";
                    break;
                default:
                    req_detail="Query Request";
                    break;
            }
            
            DefaultTableModel model = (DefaultTableModel) tblRequestStatus.getModel();
            model.addRow(new Object[]{d,csr_type,req_detail,csr_response,csr_status}); 
        }
        }
        catch(ClassNotFoundException|SQLException e)
        {
            e.printStackTrace();
        }
        }
        else
        {
        String req_detail=new String();
        switch (a) {
            case 1:
                req_detail="Cheque Book Request";
                break;
            case 3:
                req_detail="Lost/Stolen Card";
                break;
            case 5:
                req_detail="Disputed Transaction";
                break;
            case 6:
                req_detail="Reedemption Request";
                break;
            default:
                req_detail="Query Request";
                break;
        }
        try{
        Connection connect=ConnectionClass.getConnected();
        String query1="select csr_date,csr_type,csr_response,csr_status from customer_service_request where csr_type="+a+" and account_number='"+cmbAccountNo.getSelectedItem()+"' order by csr_date desc";
        PreparedStatement stmt=connect.prepareStatement(query1);
        ResultSet rs1=stmt.executeQuery(query1);
        while(rs1.next())
        {
            Date d=rs1.getDate(1);
            int csr_type=rs1.getInt(2);
            String csr_response=rs1.getString(3);
            String csr_status=rs1.getString(4);
            
            DefaultTableModel model = (DefaultTableModel) tblRequestStatus.getModel();
            model.addRow(new Object[]{d,csr_type,req_detail,csr_response,csr_status});
            
        }
        }
        catch(ClassNotFoundException|SQLException e)
        {
            e.printStackTrace();
        }
    }
    }
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        DefaultTableModel model=(DefaultTableModel) tblRequestStatus.getModel();
        model.setRowCount(0);
        switch (cmbRequestType.getSelectedIndex()) {
            case 0:
                retriveData(0);
                break;
            case 1:
                retriveData(1);
                break;
            case 2:
                retriveData(3);
                break;
            case 3:
                retriveData(5);
                break;
            case 4:
                retriveData(6);
                break;
            case 5:
                retriveData(7);
                break;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cmbAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAccountNoActionPerformed
   
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
            java.util.logging.Logger.getLogger(ViewRequestStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRequestStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRequestStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRequestStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRequestStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbAccountNo;
    private javax.swing.JComboBox<String> cmbRequestType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccountNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameField;
    private javax.swing.JLabel lblRequestType;
    private javax.swing.JLabel lblViewRequestStatus;
    private javax.swing.JTable tblRequestStatus;
    // End of variables declaration//GEN-END:variables

}
