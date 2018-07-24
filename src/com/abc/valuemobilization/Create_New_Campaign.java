/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.valuemobilization;

import com.abc.JDBCConnection.ConnectionClass;
import com.abc.customer_one_system.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author test
 */
public class Create_New_Campaign extends javax.swing.JFrame {

    /**
     * Creates new form Create_New_Campaign
     */
    public Create_New_Campaign() {
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

        lblNewC = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblCTitle = new javax.swing.JLabel();
        lblAvgBal = new javax.swing.JLabel();
        lblAgeRel = new javax.swing.JLabel();
        lblProf = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        txtCTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        txtAvgBal = new javax.swing.JTextField();
        txtAgeRel = new javax.swing.JTextField();
        txtProf = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblCid = new javax.swing.JLabel();
        txtCid = new javax.swing.JTextField();
        lblIdMsg = new javax.swing.JLabel();
        lblTitleMsg = new javax.swing.JLabel();
        lblDescMsg = new javax.swing.JLabel();
        lblDateMsg = new javax.swing.JLabel();
        lblCriteria = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNewC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNewC.setText("Create New Campaign");

        lblDesc.setText("*Campaign Description:");

        lblCTitle.setText("*Campaign Title:");

        lblAvgBal.setText("Average Balance >:");

        lblAgeRel.setText("Age of Relationship >:");

        lblProf.setText("Profession :");

        lblFrom.setText("*Valid From :");

        lblTo.setText("*Valid To :");

        lblSubTitle.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblSubTitle.setText("Campaign Criteria");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        txtAvgBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvgBalActionPerformed(evt);
            }
        });

        txtAgeRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeRelActionPerformed(evt);
            }
        });

        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });

        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

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

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblCid.setText("*Campaign Id:");

        txtCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNewC)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDesc)
                                    .addComponent(lblCTitle)
                                    .addComponent(lblProf)
                                    .addComponent(lblAvgBal)
                                    .addComponent(lblAgeRel)
                                    .addComponent(lblTo)
                                    .addComponent(lblSubTitle)
                                    .addComponent(lblCid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addGap(89, 89, 89)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(btnReset)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBack)
                                        .addGap(33, 33, 33))
                                    .addComponent(lblDescMsg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(txtCid, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTitleMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(txtFrom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAgeRel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAvgBal, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCriteria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFrom)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblNewC)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCid)
                        .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCTitle)
                        .addComponent(txtCTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDesc)
                        .addGap(49, 49, 49)))
                .addComponent(lblSubTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvgBal)
                    .addComponent(txtAvgBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgeRel)
                    .addComponent(txtAgeRel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProf)
                    .addComponent(txtProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(lblDateMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFrom)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTo)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnSubmit)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeRelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeRelActionPerformed

    private void txtCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidActionPerformed

    private void txtAvgBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvgBalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvgBalActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Campaign_Management cm = new Campaign_Management();
        cm.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtCid.setText("");
        txtCTitle.setText("");
        txtDesc.setText("");
        txtAgeRel.setText("");
        txtAvgBal.setText("");
        txtProf.setText("");
        txtFrom.setText("");
        txtTo.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        MatchFormats match = new MatchFormats();
        boolean flag = true;
        
        Date fromDate = null, toDate = null;
            try {
            fromDate = new SimpleDateFormat("dd/MM/yyyy").parse(txtFrom.getText());
            
            toDate = new SimpleDateFormat("dd/MM/yyyy").parse(txtTo.getText());
            } catch (ParseException ex) {
                Logger.getLogger(Create_New_Campaign.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            LocalDate date=LocalDate.now();

        if (txtCid.getText().equals("")) {
            lblIdMsg.setText("Required Field");
            flag &= false;
        }

        if (txtCTitle.getText().equals("")) {
            lblTitleMsg.setText("Required Field");
            flag &= false;
        }

        if (txtDesc.getText().equals("")) {
            lblDescMsg.setText("Required Field");
            flag &= false;
        }

        if (txtAvgBal.getText().equals("") && txtAgeRel.getText().equals("") && txtProf.getText().equals("")) {
            lblCriteria.setText("Enter atleast one criteria");
        }

        if (txtFrom.getText().equals("") || txtTo.getText().equals("")) {
            lblDateMsg.setText("Please Enter Both Dates");
            flag &= false;
        } else if (!match.matchDOB(txtFrom.getText()) || !match.matchDOB(txtFrom.getText())) {
            lblDateMsg.setText("Invalid date format");
            flag &= false;
        }
        
        else if(!match.verifyDuration(txtFrom.getText(),txtTo.getText()))
        {
            lblDateMsg.setText("Valid From should be less than Valid To");
            flag &= false;
        }
        /*else if(!match.matchDOB(txtFrom.getText()) || !match.matchDOB(txtFrom.getText()))
                {
                    lblDateMsg.setText("Invalid date format");
            flag &= false;
                }*/
        try {
            
            String Cid = txtCid.getText();
            String CTitle = txtCTitle.getText();
            String Desc = txtDesc.getText();
            String fDate = txtFrom.getText();
            String tDate = txtTo.getText();
            int EmpId=Login.EmpId;
            EmpId=11000000;
            int age = Integer.parseInt(txtAgeRel.getText());
            double balance = Double.parseDouble(txtAvgBal.getText());
            String profession = txtProf.getText();
            
            
            
            if (flag) {
                Connection con = ConnectionClass.getConnected();
                Statement s = con.createStatement();
                String q1 = "insert into CAMPAIGN values('" + Cid + "','" + CTitle + "','" + Desc + "','" +fDate+ "','"+tDate+" ',"+EmpId+")";
                String q2 = "insert into CAMPAIGN_CRITERIA values(" + age + "," + balance + ",'" + profession + "','"+ Cid+"')";
                int result1 = s.executeUpdate(q1);
                int result2 = s.executeUpdate(q2);

                if (result1 > 0 && result2 > 0) {
                    lblStatus.setText("Campaign Created");
                } else {
                    lblStatus.setText("Creation failed! Please try again!!");
                }

            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Create_New_Campaign.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Create_New_Campaign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_New_Campaign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_New_Campaign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_New_Campaign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_New_Campaign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgeRel;
    private javax.swing.JLabel lblAvgBal;
    private javax.swing.JLabel lblCTitle;
    private javax.swing.JLabel lblCid;
    private javax.swing.JLabel lblCriteria;
    private javax.swing.JLabel lblDateMsg;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblDescMsg;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblIdMsg;
    private javax.swing.JLabel lblNewC;
    private javax.swing.JLabel lblProf;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitleMsg;
    private javax.swing.JLabel lblTo;
    private javax.swing.JTextField txtAgeRel;
    private javax.swing.JTextField txtAvgBal;
    private javax.swing.JTextField txtCTitle;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtProf;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
