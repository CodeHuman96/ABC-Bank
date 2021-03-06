/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CustomerSelfServiceSystem;

import com.abc.JDBCConnection.ConnectionClass;
import java.util.Enumeration;
import java.util.Iterator;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author test
 */
public class ChequeBookRequest extends javax.swing.JFrame {

    /**
     * Creates new form ChequeBookRequest
     */
    public ChequeBookRequest() {
        initComponents();
        lblName.setText(CustomerServiceMenu.name);
        Iterator itr=CustomerServiceMenu.acc.iterator();
        while(itr.hasNext())
        {
            String s=(String)itr.next();
            cmbAccountNo.addItem(s);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblChequeBookRequest = new javax.swing.JLabel();
        lblNameField = new javax.swing.JLabel();
        lblAccountNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        cmbAccountNo = new javax.swing.JComboBox<>();
        lblNoOfChequeLeaves = new javax.swing.JLabel();
        rad20 = new javax.swing.JRadioButton();
        rad50 = new javax.swing.JRadioButton();
        rad100 = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHEQUE BOOK REQUEST");

        lblChequeBookRequest.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblChequeBookRequest.setText("Cheque Book Request");

        lblNameField.setText("Name:");

        lblAccountNo.setText("Account No:");

        cmbAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccountNoActionPerformed(evt);
            }
        });

        lblNoOfChequeLeaves.setText("No. of Cheque Leaves :");

        buttonGroup1.add(rad20);
        rad20.setText("20");

        buttonGroup1.add(rad50);
        rad50.setText("50");

        buttonGroup1.add(rad100);
        rad100.setText("100");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMsg.setForeground(new java.awt.Color(239, 37, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNameField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAccountNo)
                                        .addGap(77, 77, 77)
                                        .addComponent(cmbAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnSubmit)
                                            .addComponent(lblNoOfChequeLeaves))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBack)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rad20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rad50)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rad100)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblChequeBookRequest)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblChequeBookRequest)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameField))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNo)
                    .addComponent(cmbAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoOfChequeLeaves)
                    .addComponent(rad20)
                    .addComponent(rad50)
                    .addComponent(rad100))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack))
                .addGap(62, 62, 62)
                .addComponent(lblMsg)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    private void cmbAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAccountNoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       ServiceRequest obj=new ServiceRequest();
       obj.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
      String str=getSelectedButtonText(buttonGroup1);
        if(cmbAccountNo.getSelectedIndex()==-1 || str==null)
        {
            lblMsg.setText("All fields are neccessary");
        }
        else
        {
            try{
                Connection connect=ConnectionClass.getConnected();
                String query1="select CSR_ID_SEQ.nextval from dual";
                PreparedStatement stmt1=connect.prepareStatement(query1);
                ResultSet rs=stmt1.executeQuery(query1);
                rs.next();
                int r1=rs.getInt(1);
                String query2="insert into customer_service_request (csr_id,csr_type,csr_date,account_number)values ("+r1+",1,CURRENT_TIMESTAMP,'"+cmbAccountNo.getSelectedItem()+"')";
                PreparedStatement stmt2=connect.prepareStatement(query2);
                int r=stmt2.executeUpdate(query2);
                if(r>0)
                    JOptionPane.showMessageDialog(null, "Request Added Successfully");
               
                String query3="insert into cheque_book_request(no_of_leaves,csr_id) values("+str+","+r1+")";
                PreparedStatement stmt3=connect.prepareStatement(query3);
                stmt3.executeUpdate(query3);
            }
            catch(ClassNotFoundException|SQLException e)
            {
                e.printStackTrace();
            }
        }
      
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(ChequeBookRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChequeBookRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChequeBookRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChequeBookRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChequeBookRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbAccountNo;
    private javax.swing.JLabel lblAccountNo;
    private javax.swing.JLabel lblChequeBookRequest;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameField;
    private javax.swing.JLabel lblNoOfChequeLeaves;
    private javax.swing.JRadioButton rad100;
    private javax.swing.JRadioButton rad20;
    private javax.swing.JRadioButton rad50;
    // End of variables declaration//GEN-END:variables
}
