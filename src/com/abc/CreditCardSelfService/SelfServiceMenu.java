/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CreditCardSelfService;

import com.abc.CustomerSelfServiceSystem.CustomerLogin;
import com.abc.customer_one_system.Login;

/**
 *
 * @author test
 */
public class SelfServiceMenu extends javax.swing.JFrame {

    /**
     * Creates new form SelfServiceMenu
     */
    public SelfServiceMenu() {
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

        lblTitle2 = new javax.swing.JLabel();
        btnRedeem = new javax.swing.JButton();
        btnAddon = new javax.swing.JButton();
        btnDispTrans = new javax.swing.JButton();
        btnIncreaseLimit = new javax.swing.JButton();
        btnViewStatus = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnReward = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitle2.setText("Credit card self-service menu ");

        btnRedeem.setText("Redeem reward points");
        btnRedeem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemActionPerformed(evt);
            }
        });

        btnAddon.setText("Add-on card request");
        btnAddon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddonActionPerformed(evt);
            }
        });

        btnDispTrans.setText("Disputed transaction");

        btnIncreaseLimit.setText("Request increase in credit limit");

        btnViewStatus.setText("view request status");
        btnViewStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStatusActionPerformed(evt);
            }
        });

        btnSignOut.setText("Sign out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        lblWelcome.setText("Welcome xxx");

        btnReward.setText("Reward Catalog");
        btnReward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRewardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(lblWelcome)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRedeem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSignOut))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReward)
                            .addComponent(btnDispTrans)
                            .addComponent(btnAddon)
                            .addComponent(btnIncreaseLimit)
                            .addComponent(btnViewStatus))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle2)
                    .addComponent(lblWelcome))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRedeem)
                    .addComponent(btnSignOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddon)
                .addGap(12, 12, 12)
                .addComponent(btnDispTrans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIncreaseLimit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReward)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddonActionPerformed

    private void btnRedeemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemActionPerformed
        // TODO add your handling code here:
        RedeemRewardPoints rrp=new RedeemRewardPoints();
        rrp.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_btnRedeemActionPerformed

    private void btnViewStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStatusActionPerformed
        // TODO add your handling code here:
        ViewRequestStatus vrs=new ViewRequestStatus();
        vrs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewStatusActionPerformed

    private void btnRewardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRewardActionPerformed
        // TODO add your handling code here:
        RewardCatalog rc=new RewardCatalog();
        rc.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_btnRewardActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        // TODO add your handling code here:
        CustomerLogin l=new CustomerLogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSignOutActionPerformed

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
            java.util.logging.Logger.getLogger(SelfServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelfServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelfServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelfServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelfServiceMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddon;
    private javax.swing.JButton btnDispTrans;
    private javax.swing.JButton btnIncreaseLimit;
    private javax.swing.JButton btnRedeem;
    private javax.swing.JButton btnReward;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnViewStatus;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
