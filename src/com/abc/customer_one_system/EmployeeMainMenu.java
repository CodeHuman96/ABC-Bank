/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;

import com.abc.CreditCardSelfService.ModifyReward;
import com.abc.CreditCardSelfService.RewardCatalog;

/**
 *
 * @author test
 */
public class EmployeeMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeMainMenu
     */
    public EmployeeMainMenu() {
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

        lblEmpMainMenu = new javax.swing.JLabel();
        btnCustOneMain = new javax.swing.JButton();
        btnBackOfficeMain = new javax.swing.JButton();
        btnCampainMain = new javax.swing.JButton();
        btnRewardManagement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmpMainMenu.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblEmpMainMenu.setText("Main Menu");

        btnCustOneMain.setText("Customer One");
        btnCustOneMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustOneMainActionPerformed(evt);
            }
        });

        btnBackOfficeMain.setText("Back Office");
        btnBackOfficeMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackOfficeMainActionPerformed(evt);
            }
        });

        btnCampainMain.setText("Campaign Management");
        btnCampainMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampainMainActionPerformed(evt);
            }
        });

        btnRewardManagement.setText("Reward Catalog");
        btnRewardManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRewardManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblEmpMainMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnCampainMain))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnBackOfficeMain))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnCustOneMain))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnRewardManagement)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpMainMenu)
                .addGap(49, 49, 49)
                .addComponent(btnCustOneMain)
                .addGap(33, 33, 33)
                .addComponent(btnBackOfficeMain)
                .addGap(28, 28, 28)
                .addComponent(btnCampainMain)
                .addGap(28, 28, 28)
                .addComponent(btnRewardManagement)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackOfficeMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackOfficeMainActionPerformed
<<<<<<< HEAD
=======
<<<<<<< HEAD

        BackOfficeMenu backofficemenu = new BackOfficeMenu();
        backofficemenu.setVisible(true);

        BackOfficeMenu obj=new BackOfficeMenu();
        obj.setVisible(true);
        this.setVisible(false);

=======
<<<<<<< HEAD
=======

>>>>>>> 2e3cbd174c1e36782f198c4f6ae893a2aa90c485
        BackOfficeMenu backofficemenu = new BackOfficeMenu();
        backofficemenu.setVisible(true);
>>>>>>> 7b8b5312292118446a061a59355c70305a4fbcec
        BackOfficeMenu obj=new BackOfficeMenu();
        obj.setVisible(true);
        this.setVisible(false);
>>>>>>> bc8fc541952f19ca807216f35b334dba09dccdfc
    }//GEN-LAST:event_btnBackOfficeMainActionPerformed

    private void btnCampainMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampainMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCampainMainActionPerformed

    private void btnCustOneMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustOneMainActionPerformed
        MainMenu obj=new MainMenu();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCustOneMainActionPerformed

    private void btnRewardManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRewardManagementActionPerformed
        RewardCatalog obj1=new RewardCatalog();
        obj1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRewardManagementActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackOfficeMain;
    private javax.swing.JButton btnCampainMain;
    private javax.swing.JButton btnCustOneMain;
    private javax.swing.JButton btnRewardManagement;
    private javax.swing.JLabel lblEmpMainMenu;
    // End of variables declaration//GEN-END:variables
}
