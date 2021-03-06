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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class DeDuplication extends javax.swing.JFrame {

    /**
     * Creates new form DeDuplication
     *
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public DeDuplication() throws ClassNotFoundException, SQLException {
        this.accountNumbers = new ArrayList<>();
        initComponents();
        Connection connect = ConnectionClass.getConnected();
        Statement statement = connect.createStatement();
        String query = "select * from UnmappedData order by accountholder,pan";
        ResultSet resultData = statement.executeQuery(query);
        DefaultTableModel modelData = (DefaultTableModel) tblDeDuplicate.getModel();
        while (resultData.next()) {
            long accountNo = resultData.getLong("accountnumber");
            String name = resultData.getString("accountholder");
            String DOB = resultData.getString("dateofbirth");
            String pan = resultData.getString("pan");
            String address = resultData.getString("address");
            String contactNo = resultData.getString("phonenumber");
            String status = resultData.getString("status");
            String city = resultData.getString("city");
            String pin = resultData.getString("pin");
            modelData.addRow(new Object[]{false, accountNo, name, address, city, pin, contactNo, DOB, status, pan});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeDuplicate = new javax.swing.JTable();
        lblDeDuplicate = new javax.swing.JLabel();
        btnDeDuplicate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("De Duplication ");

        tblDeDuplicate.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        tblDeDuplicate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Check", "Account No", "Name", "Address", "City", "Pin Code", "Contact No", "DOB", "Status", "PAN No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeDuplicate.setToolTipText("");
        jScrollPane1.setViewportView(tblDeDuplicate);

        lblDeDuplicate.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblDeDuplicate.setText("De-Duplication");

        btnDeDuplicate.setText("De-Duplicate");
        btnDeDuplicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeDuplicateActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMsg.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(lblDeDuplicate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 185, Short.MAX_VALUE)
                        .addComponent(btnDeDuplicate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeDuplicate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeDuplicate)
                    .addComponent(btnRefresh)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lblMsg)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    List<Long> accountNumbers;
    private void btnDeDuplicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeDuplicateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDeDuplicate.getModel();
        if (tblDeDuplicate.getSelectedRow() == -1) {
            if (tblDeDuplicate.getRowCount() == 0) {
                lblMsg.setText("Table is empty");
            } else {
                lblMsg.setText("Select atleat one row");
            }
        } else {
            try {
                lblMsg.setText("");
                for (int itr = 0; itr < tblDeDuplicate.getRowCount(); itr++) {
                    if ((boolean) tblDeDuplicate.getValueAt(itr, 0) == true) {
                        Long l = (Long) tblDeDuplicate.getValueAt(itr, 1);
                        accountNumbers.add(l);
                    }
                }
                AddCustomers obj = new AddCustomers(accountNumbers);
                obj.setVisible(true);
                this.setVisible(false);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DeDuplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeDuplicateActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDeDuplicate.getModel();
        int noRows = tblDeDuplicate.getRowCount();
        for (int iterator = 0; iterator < noRows; iterator++) {
            model.setValueAt(false, iterator, 0);
        }
        lblMsg.setText("");


    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            MainMenu obj = new MainMenu();
            obj.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DeDuplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeDuplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new DeDuplication().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DeDuplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeDuplicate;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeDuplicate;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTable tblDeDuplicate;
    // End of variables declaration//GEN-END:variables
}
