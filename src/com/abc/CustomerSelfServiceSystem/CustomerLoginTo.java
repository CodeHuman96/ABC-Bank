/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CustomerSelfServiceSystem;

import com.abc.CreditCardSelfService.SelfServiceMenu;

/**
 *
 * @author shivasai
 */
public class CustomerLoginTo extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLoginTo
     */
    public CustomerLoginTo() {
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

        customServiceMenuBt = new javax.swing.JButton();
        creditCardServiceMenuBt = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        billPaymentBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customServiceMenuBt.setText("Customer Service menu");
        customServiceMenuBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customServiceMenuBtActionPerformed(evt);
            }
        });

        creditCardServiceMenuBt.setText("Credit Card Self-Service Menu");
        creditCardServiceMenuBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditCardServiceMenuBtActionPerformed(evt);
            }
        });

        header.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        header.setText("Choose The Service");

        billPaymentBt.setText("BillPayment Service Menu");
        billPaymentBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billPaymentBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customServiceMenuBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creditCardServiceMenuBt, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billPaymentBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(header)
                .addGap(53, 53, 53)
                .addComponent(customServiceMenuBt)
                .addGap(38, 38, 38)
                .addComponent(creditCardServiceMenuBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(billPaymentBt)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customServiceMenuBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customServiceMenuBtActionPerformed
        CustomerServiceMenu obj = new CustomerServiceMenu();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_customServiceMenuBtActionPerformed

    private void creditCardServiceMenuBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditCardServiceMenuBtActionPerformed
       
        SelfServiceMenu obj=new SelfServiceMenu();
        obj.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_creditCardServiceMenuBtActionPerformed

    private void billPaymentBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billPaymentBtActionPerformed
        BillPaymentMenu obj=new BillPaymentMenu();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_billPaymentBtActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLoginTo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginTo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginTo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLoginTo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLoginTo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billPaymentBt;
    private javax.swing.JButton creditCardServiceMenuBt;
    private javax.swing.JButton customServiceMenuBt;
    private javax.swing.JLabel header;
    // End of variables declaration//GEN-END:variables
}
