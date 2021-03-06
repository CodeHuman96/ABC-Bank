/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CustomerSelfServiceSystem;
import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class ListOfBillers extends javax.swing.JFrame {

    /**
     * Creates new form ListOfBillers
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public ListOfBillers() throws ClassNotFoundException, SQLException {
        initComponents();
        //BillPaymentLogin login=new BillPaymentLogin(); 
        Connection connect = ConnectionClass.getConnected();
        String customer_id=BillPaymentLogin.cust_id;
        //System.out.println("cust_id"+customer_id+"cust_name"+BillPaymentLogin.cust_name);
        String statement = "select b.biller_name,biller_address,biller_category from biller b join customer c on b.customer_id=c.customer_id where c.customer_id=?";
        PreparedStatement stmt = connect.prepareStatement(statement);
        stmt.setString(1,customer_id);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next())
        {
        String name=rs.getString(1);
        String address=rs.getString(2);
        String category=rs.getString(3);
        DefaultTableModel model;
        model = (DefaultTableModel) tblBillers.getModel();
        model.addRow(new Object[]{false,name,address,category });
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
        tblBillers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ListOfBillers");

        tblBillers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Biller Name", "Address", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBillers.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblBillers);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("List Of Billers");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(247, 247, 247)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnUpdate)
                        .addGap(53, 53, 53)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnBack))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       BillPaymentMenu bill=new BillPaymentMenu();
       bill.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddNewBiller newBiller=new AddNewBiller();
        newBiller.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblBillers.getModel();
        //System.out.println(tblBillers.getSelectedRow());
        int flag=0,c=0;
        int index=0;
        for(int i=0;i<model.getRowCount();i++)
        {
            if((Boolean)model.getValueAt(i,0) && flag<1)
            { flag++; index=i;}//tblBillers.getSelectedRow();}
            if((Boolean)model.getValueAt(i,0) )
            { c++;}           
            //System.out.println(model.getValueAt(i,0));
            //System.out.println(index);
            //if(index!=0) index=index-1;
        }
        //System.out.println(flag);
        //System.out.println(index);
        if(c==0) lblMsg.setText("Select atleat one row");
        else if(c>1) lblMsg.setText("Select only one row");
        else
        {
            try 
            {
                String name=(String)model.getValueAt(index,1);
                String acNo=getBillerAc(name);
                String add=(String)model.getValueAt(index,2);  
                //System.out.println("name="+name+" acNo="+acNo+" add="+add);
                ModifyBillerInfo info=new ModifyBillerInfo(name,acNo,add);
                info.setVisible(true);
                this.setVisible(false);
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    private String getBillerAc(String name) throws ClassNotFoundException, SQLException
    {
        Connection connect = ConnectionClass.getConnected();
        String customer_id=BillPaymentLogin.cust_id;
        //System.out.println("cust_id"+customer_id+"cust_name"+BillPaymentLogin.cust_name);
        String statement = "select biller_acc_no from biller b join customer c on b.customer_id=c.customer_id where c.customer_id=? and b.biller_name=?";
        PreparedStatement stmt = connect.prepareStatement(statement);
        stmt.setString(1,customer_id);
        stmt.setString(2,name);
        ResultSet rs = stmt.executeQuery();
        String acNo="";
        while(rs.next())
        {
        acNo=rs.getString(1);
        }
        return acNo;
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
            java.util.logging.Logger.getLogger(ListOfBillers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfBillers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfBillers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfBillers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListOfBillers().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ListOfBillers.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTable tblBillers;
    // End of variables declaration//GEN-END:variables
}
