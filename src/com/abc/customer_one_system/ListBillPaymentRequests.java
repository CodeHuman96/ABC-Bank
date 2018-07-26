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
import java.time.LocalDate;
import javax.swing.JTable;
import java.time.temporal.ChronoUnit;
import javax.swing.table.TableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */


//trying it 

class MyDefaultTableModel extends DefaultTableModel {
    private boolean[][] editable_cells; // 2d array to represent rows and columns
     MyDefaultTableModel()
    {   super();
    
    }
   /* private MyDefaultTableModel(int rows, int cols) { // constructor
        super(rows, cols);
        this.editable_cells = new boolean[rows][cols];
    }*/

    @Override
    public boolean isCellEditable(int row, int column) { // custom isCellEditable function
       // return this.editable_cells[row][column];
       switch(row){             
           case 4:  // select the cell you want make it not editable 
             return false;  
         default: return true;}  
         
    }}

    
    
   /* public void setCellEditable(int row, int col, boolean value) {
        this.editable_cells[row][col] = value; // set cell true/false
        this.fireTableCellUpdated(row, col);
    }*/
    


public class ListBillPaymentRequests extends javax.swing.JFrame {

 
    

    /**
     * Creates new form ListBillPaymentRequests
     */
    public ListBillPaymentRequests() throws ClassNotFoundException, SQLException {
        initComponents();
        Connection con=ConnectionClass.getConnected();
        Statement st=con.createStatement();
        String query="select * from make_payment";
        ResultSet rs=st.executeQuery(query);
        
        LocalDate today=LocalDate.now();
       
        
        while(rs.next())
            
        {  
       
           
            LocalDate deadline=rs.getDate("payment_due_date").toLocalDate();
            //System.out.println(rs.getDate("payment_due_date"));
           
           final long days = ChronoUnit.DAYS.between(today,deadline);
             if ((days<=1) && rs.getString("payment_status").equalsIgnoreCase("pending"))//||rs.getString("payment_status").equals("pending"))
            { //System.out.println(days);
          
             
                
                String query2="select * from account where account_number="+rs.getString("account_number");
               
                
                Statement st2=con.createStatement();
                ResultSet rs2=st2.executeQuery(query2);
                //method 3
               /* DefaultTableModel model=new DefaultTableModel(){public boolean isCellEditable(int row,int column)
                {
                    switch(row){             
                            case 1:  // select the cell you want make it not editable 
                                return true;  
                            default: 
                                return false;}  
                }};
                //tblCustBillPayment=new JTable(mod);
                //DefaultTableModel model=(DefaultTableModel) tblCustBillPayment.getModel();
                model=(DefaultTableModel) tblCustBillPayment.getModel();
                 
                  */  

        //DefaultTableModel model=(DefaultTableModel) tblCustBillPayment.getModel();
               
                 
                 
                 
                 
                
                 
                 
                 //default method
                 DefaultTableModel model=(DefaultTableModel) tblCustBillPayment.getModel();
                 
                 //method 2
                /* DefaultTableModel model=(DefaultTableModel) tblCustBillPayment.getModel();
                 tblCustBillPayment=new JTable(model){
                 public boolean isCellEditable(int rowIndex, int mColIndex) {
                     if (rowIndex==1 && mColIndex==3)
                     {return true;}
                     else
                     {return false;}
                    }
                 };*/
                
                
                //method 3: table disappears(need param data and columnNames)
                /*DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {

                @Override
                    public boolean isCellEditable(int row, int column) {
                    //Only the third column
                        return column == 3;
                     }
                        };

                   tblCustBillPayment.setModel(tableModel);
                 DefaultTableModel model=(DefaultTableModel) tblCustBillPayment.getModel();*/
                 
                 //implementing extended class
                  //System.out.println("grt");
                /* MyDefaultTableModel model=new MyDefaultTableModel();
                 tblCustBillPayment=new JTable(model);*/
                 
                 //next one
           /*  tblCustBillPayment = new JTable (model){public boolean isCellEditable(int row,int column)  
        {switch(row){             
           case 4:  // select the cell you want make it not editable 
             return false;  
         default: return true;}  
        }}; */
             
               
                 
                 
             
               
                
                while (rs2.next()){
                
               
                String query3="select * from customer where customer_id='"+rs2.getString("customer_id")+"'";
                Statement st3=con.createStatement();
                ResultSet rs3=st3.executeQuery(query3);//Balance
                
                while (rs3.next()){
                
                
                    
                //model.addRow(new Object[]{rs.getString("biller_id"),rs3.getString("name"),6,rs.getString("account_number"),rs2.getFloat("balance"),rs.getFloat("bill_amount"),"pay",null,"reject"});
                if (rs2.getFloat("balance")>rs.getFloat("bill_amount"))  
                {model.addRow(new Object[]{rs.getString("bill_no"),rs3.getString("name"),6,rs.getString("account_number"),rs2.getFloat("balance"),rs.getFloat("bill_amount"),true,false,false});}
                  
                  else
                {model.addRow(new Object[]{rs.getString("bill_no"),rs3.getString("name"),6,rs.getString("account_number"),rs2.getFloat("balance"),rs.getFloat("bill_amount"),false,true,true});}
                    //System.out.println("added");
                
                 //System.out.println(model.isCellEditable(2,15));
                // System.out.println(model.isCellEditable(1,3));
                 // System.out.println(model.isCellEditable(4,6));
                  
                  
                }
                
        
            }
        
        }
        
       
    }
    }
    
    
    //trying it new
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustBillPayment = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("List of Customer Bill Payment Requests");

        tblCustBillPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill  ID", "Customer Name", "Customer Request", "Account Number", "Account Balance", "Bill Amount", "Pay", "Force Pay", "Reject"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustBillPayment.setColumnSelectionAllowed(true);
        tblCustBillPayment.setGridColor(new java.awt.Color(48, 19, 19));
        tblCustBillPayment.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tblCustBillPaymentComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustBillPayment);
        tblCustBillPayment.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(92, 92, 92)
                .addComponent(btnBack)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSubmit)
                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BackOfficeMenu obj=new BackOfficeMenu();
        obj.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        System.out.println(tblCustBillPayment.getRowCount());
        int count=0;
        
        for (int i=0;i<tblCustBillPayment.getRowCount();i++){
            
        if (((Boolean)tblCustBillPayment.getModel().getValueAt(i,7)).booleanValue()==false &&((Boolean)tblCustBillPayment.getModel().getValueAt(i,8)).booleanValue()==false  &&((Boolean)tblCustBillPayment.getModel().getValueAt(i,6)).booleanValue()==false)
        {lblError.setText("Either select Force pay or Reject! ");
        //System.out.println("Anamoly case");
        i=i--;
        continue;
        }
        
        else if (((Boolean)tblCustBillPayment.getModel().getValueAt(i,7))==true &&((Boolean)tblCustBillPayment.getModel().getValueAt(i,8))==true)
        {lblError.setText("Select either Force pay or Reject! ");
        i=i--;
        continue;
        }
        
        else
        {   count++;
            
        }
     
       
       }
        Connection con;
        //lblError.setText("Successfully submitted!");
        if (count==tblCustBillPayment.getRowCount()){
        for (int i=0;i<tblCustBillPayment.getRowCount();i++)
        {     lblError.setText("Successfully submitted!"); 
            try {
                con = ConnectionClass.getConnected();
                 Statement st=con.createStatement();
                 
                 String query="";
                 int result=0;
                 ResultSet rs=null;
                 float closing_balance=0.00f;
                 
                 if (((Boolean)tblCustBillPayment.getModel().getValueAt(i,6))==true)
                 {query="update make_payment set payment_status='paid' where bill_no="+tblCustBillPayment.getValueAt(i,0);
                result=st.executeUpdate(query);
               if (result>0)
                {
                //System.out.println("set paid");
                
                query="update account set balance=balance-(select bill_amount from make_payment where bill_no="+ tblCustBillPayment.getValueAt(i,0)+ ") where account_number="+tblCustBillPayment.getValueAt(i,3)  ;
                result=st.executeUpdate(query);
                query="select balance from account where account_number="+tblCustBillPayment.getValueAt(i,3)  ;
                rs=st.executeQuery(query);
                while (rs.next()){
                closing_balance= rs.getFloat(1);}
                
                
                
                int billno=Integer.parseInt(tblCustBillPayment.getValueAt(i,0).toString());
                String query1="select b.biller_acc_no from make_payment m join biller b on m.biller_id=b.biller_id where m.bill_no="+billno;
                rs=st.executeQuery(query1); 
                while (rs.next())
                {query="insert into transaction_(transaction_type,transaction_time,amount,receiver_acc_no,account_number,closing_balance) values('0',CURRENT_TIMESTAMP,"+tblCustBillPayment.getValueAt(i,5)+",'"+rs.getString(1)+"','"+tblCustBillPayment.getValueAt(i,3)+"',"+closing_balance+")";
                result=st.executeUpdate(query);}
                }
                 }
                
                else if (((Boolean)tblCustBillPayment.getModel().getValueAt(i,7))==true)
                { query="update make_payment set payment_status='Force Paid' where bill_no="+tblCustBillPayment.getValueAt(i,0);
                 result=st.executeUpdate(query);
                 if (result>0)
                {
                //System.out.println("set force paid");
                
                query="update account set balance=balance-(select bill_amount from make_payment where bill_no="+ tblCustBillPayment.getValueAt(i,0)+ ") where account_number="+tblCustBillPayment.getValueAt(i,3)  ;
                result=st.executeUpdate(query);
                query="select balance from account where account_number="+tblCustBillPayment.getValueAt(i,3)  ;
                rs=st.executeQuery(query);
                while (rs.next()){
                closing_balance= rs.getFloat(1);}
                
                int billno=Integer.parseInt(tblCustBillPayment.getValueAt(i,0).toString());
                String query1="select b.biller_acc_no from make_payment m join biller b on m.biller_id=b.biller_id where m.bill_no="+billno;
                rs=st.executeQuery(query1); 
                while (rs.next())
                {   
                    query="insert into transaction_(transaction_type,transaction_time,amount,receiver_acc_no,account_number,closing_balance) values('0',CURRENT_TIMESTAMP,"+tblCustBillPayment.getValueAt(i,5)+",'"+rs.getString(1)+"','"+tblCustBillPayment.getValueAt(i,3)+"',"+closing_balance+")";
                result=st.executeUpdate(query);}
                
                
                }
                
                }
                 
                else if(((Boolean)tblCustBillPayment.getModel().getValueAt(i,8))==true)
                 {query="update make_payment set payment_status='Rejected' where bill_no="+tblCustBillPayment.getValueAt(i,0);
                   result=st.executeUpdate(query);
                   {
                //System.out.println("set rejected");
                }      
                         
                } 
            }
             catch (ClassNotFoundException ex) {
                Logger.getLogger(ListBillPaymentRequests.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ListBillPaymentRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }
        }
   
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void tblCustBillPaymentComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblCustBillPaymentComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCustBillPaymentComponentHidden

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
            java.util.logging.Logger.getLogger(ListBillPaymentRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListBillPaymentRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListBillPaymentRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListBillPaymentRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListBillPaymentRequests().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ListBillPaymentRequests.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JTable tblCustBillPayment;
    // End of variables declaration//GEN-END:variables
}
