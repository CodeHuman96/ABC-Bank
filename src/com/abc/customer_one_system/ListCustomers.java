/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class ListCustomers extends javax.swing.JFrame {

    boolean isEmpty = false;

    Boolean dataFlag[] = CustomerSearch.dataFlag;
    String name = CustomerSearch.name.toLowerCase();
    String dob = CustomerSearch.dob;
    String accountNo = CustomerSearch.accountNo;
    String mobileNo = CustomerSearch.mobile;
    String PAN = CustomerSearch.PAN.toLowerCase();
    String email = CustomerSearch.emailID.toLowerCase();
    int customerID = CustomerSearch.customerID;

    /**
     * Creates new form ListCustomers
     *
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public ListCustomers() throws ClassNotFoundException, SQLException {
        initComponents();
        Connection connect = ConnectionClass.getConnected();
        Statement statement = connect.createStatement();
        String query[] = new String[8];
        query[0] = "select * from ("
                + "select * from customer";
        query[1] = "select * from customer where lower(name)='" + name + "'";
        query[2] = "select * from customer where customer_id=" + customerID + " ";
        query[3] = "select * from customer where date_of_birth="
                + "(SELECT TO_DATE('" + dob + "', 'DD/MM/YYYY') FROM dual)";
        query[4] = "select * from customer where preferred_acc_1=" + accountNo + " or preferred_acc_2=" + accountNo + "";
        query[5] = "select * from customer where lower(email_id)='" + email + "' ";
        query[6] = "select * from customer where pan='" + PAN + "' ";
        query[7] = "select * from customer where mobile_num='" + mobileNo + "' ";
        String add = " intersect ";
        for (int i = 0; i < 7; i++) {
            if (dataFlag[i]) {
                query[0] += add + query[i + 1];
            }
        }
        query[0] += ") order by name";
        ResultSet resultData = statement.executeQuery(query[0]);
        displayData(resultData);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        lblListOfCustomers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerData = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer List");

        lblListOfCustomers.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblListOfCustomers.setText("List of Customers");

        tblCustomerData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Customer ID", "Date Of Birth", "Email ID", "PAN No", "Contact No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomerData);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblMsg.setText("  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(224, 224, 224))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblListOfCustomers)
                        .addGap(223, 223, 223))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListOfCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMsg)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerSearch obj = new CustomerSearch();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCustomerData.getModel();
        if (tblCustomerData.getSelectedRow() == -1) {
            if (tblCustomerData.getRowCount() == 0) {
                lblMsg.setText("Table is empty");
            } else {
                lblMsg.setText("Select a row");
            }
        } else if (tblCustomerData.getSelectedColumnCount() > 1) {
            lblMsg.setText("Select only one row");
        } else {
            try {
                int custID;
                custID = (int) model.getValueAt(tblCustomerData.getSelectedRow(), 1);
                CustomerDetails obj = new CustomerDetails(custID);
                obj.setVisible(true);
                this.setVisible(false);
            } catch (ClassNotFoundException | SQLException ex) {
                lblMsg.setText("Connection issue");
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListCustomers().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ListCustomers.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListOfCustomers;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTable tblCustomerData;
    // End of variables declaration//GEN-END:variables
    private void displayData(ResultSet resultData) throws SQLException {
        while (resultData.next()) {
            String lclName = resultData.getString("NAME");
            int custID = resultData.getInt(1);
            String lclDOB = resultData.getString("DATE_OF_BIRTH");
            lclDOB = lclDOB.substring(0, 10);
            String lclEmail = resultData.getString("EMAIL_ID");
            String pan = resultData.getString("PAN");
            String lblMobile = resultData.getString("MOBILE_NUM");
            DefaultTableModel modelData = (DefaultTableModel) tblCustomerData.getModel();
            modelData.addRow(new Object[]{lclName, custID, lclDOB, lclEmail, pan, lblMobile});
        }
    }
}
