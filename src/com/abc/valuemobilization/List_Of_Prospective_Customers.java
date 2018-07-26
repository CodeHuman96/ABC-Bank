/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.valuemobilization;
//import com.abc.*;
import com.abc.JDBCConnection.ConnectionClass;
import com.abc.customer_one_system.Login;
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
public class List_Of_Prospective_Customers extends javax.swing.JFrame {

    /**
     * Creates new form List_Of_Prospective_Customers
     */
    public List_Of_Prospective_Customers()throws SQLException, ClassNotFoundException {
        initComponents();
        int EmpId=Login.EmpId;
         EmpId=11000000;
        String Name="";
        String Mobile="";
        
        Connection con = ConnectionClass.getConnected();
        Statement s = con.createStatement();
        String q="Select * from PROSPECTIVE_CUSTOMERS p join CAMPAIGN c on p.CAMPAIGN_ID=c.CAMPAIGN_ID where p.EMPLOYEE_ID="+EmpId;
        String q2="Select * from PROSPECTIVE_CUSTOMERS p join CUSTOMER c on p.CUSTOMER_ID=c.CUSTOMER_ID where p.EMPLOYEE_ID="+EmpId;
        ResultSet rs= s.executeQuery(q);
        while(rs.next())
        {
            
        String CTitle=rs.getString(6);
        
        String Status=rs.getString(1);
        int Cust_Id=rs.getInt(2);
        String c_id=Integer.toString(Cust_Id);
        DefaultTableModel model;
        model = (DefaultTableModel) tblProspects.getModel();
        Statement s2 = con.createStatement();
        ResultSet rs2=s2.executeQuery(q2);
        while(rs2.next())
        {
            Name=rs2.getString(6);
            Mobile=rs2.getString(8);
             
        }
        int c=0;
        for(int i=0; i<model.getRowCount(); i++)
        {
           
            if(tblProspects.getValueAt(i,0).toString().equals(CTitle) && tblProspects.getValueAt(i,1).toString().equals(c_id))
            {
                c++;
               
            }
        }
       
        if(c==0)
        model.addRow(new Object[]{CTitle,Cust_Id,Name,Mobile,Status });
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
        tblProspects = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProspects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campaign Title", "Prospect Id", "Prospect Name", "Contact Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProspects);

        lblTitle.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitle.setText("List Of Prospective Customers");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Status");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login l=new Login();
        l.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        try 
        {
            
            DefaultTableModel model;
            model = (DefaultTableModel) tblProspects.getModel();
            
            if (tblProspects.getSelectedRow() == -1) {
            if (tblProspects.getRowCount() == 0) {
                lblStatus.setText("Table is empty");
            } else {
                lblStatus.setText("Select a row");
            }
        } else if (tblProspects.getSelectedColumnCount() > 1) {
            lblStatus.setText("Select only one row");
        } else {
            
            String CTitle=(String)model.getValueAt(tblProspects.getSelectedRow(),0);
            int id=(int)model.getValueAt(tblProspects.getSelectedRow(),1);
            String Name=(String)model.getValueAt(tblProspects.getSelectedRow(),2);
            String Mobile=(String)model.getValueAt(tblProspects.getSelectedRow(),3);
            String Id=Integer.toString(id);
            Update_Campaign obj=new Update_Campaign(CTitle,Id,Name, Mobile);
            obj.setVisible(true);
            this.setVisible(false);
        }
            
            
            
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            ex.printStackTrace();
        } 
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(List_Of_Prospective_Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Of_Prospective_Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Of_Prospective_Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Of_Prospective_Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new List_Of_Prospective_Customers().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                } 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProspects;
    // End of variables declaration//GEN-END:variables
}
