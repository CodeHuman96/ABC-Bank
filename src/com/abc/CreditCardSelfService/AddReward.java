/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CreditCardSelfService;

import com.abc.JDBCConnection.ConnectionClass;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author test
 */
public class AddReward extends javax.swing.JFrame {

    /**
     * Creates new form AddReward
     */
    JFileChooser fileChooser;
    JPanel pobj, innerPanel;

    public AddReward() throws Exception {
        initComponents();
        setSize(1000, 1000);
        //setLocation(1500, 1500);
        //   setVisible(true);
        setLayout(new BorderLayout());
        /* String Pdesc=lblProductDesc.getText();
        Integer PtsNeed=Integer.parseInt(lblPtsNeeded.getText());*/
    }

    /*  private void SaveImage(String imagePath) throws FileNotFoundException, IOException {
        try {
            byte[] rawBytes = null;
            FileInputStream fis = null;

            if (imagePath.equals("No File Uploaded")) {
                ClassLoader cl = this.getClass().getClassLoader();
                URL resouces = cl.getResource("resources/blank-image.png");
                imagePath = resouces.getFile();
            }

            File fileObj = new File(imagePath);
            fis = new FileInputStream(fileObj);
            

             Connection con=ConnectionClass.getConnected(); 
            
            PreparedStatement st = con.prepareStatement("insert into product values(prod_seq.nextval,?,?,?)");
           int pts = Integer.parseInt(lblPtsNeeded.getText());
            st.setString(1, lblProdDesc.getText());
            //st.setInt(3,100);
           // lblPtsNeeded.setText("100");
           st.setInt(3, pts);
             
            //st.setBinaryStream(4, fis);
            int imageLength = Integer.parseInt(String.valueOf(fileObj.length()));
            
            Blob blob = con.createBlob();


            rawBytes = new byte[imageLength];
            fis.read(rawBytes, 0, imageLength);
            //st.setBinaryStream(4, (InputStream) fis, imageLength);
            //st.setBytes(3, rawBytes);
            
            blob.setBytes(2, rawBytes);
            st.setBlob(2, blob);
         
            
            int count = st.executeUpdate();
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Data Saved Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error Saving Data");
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblProductDescLHS = new javax.swing.JLabel();
        lblPtsNeededLHS = new javax.swing.JLabel();
        lblPtsNeeded = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        lblProdDesc = new javax.swing.JTextField();
        lblPtsneeded = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Add a New Reward");

        lblProductDescLHS.setText("Product Description");

        lblPtsNeededLHS.setText("Points needed per unit");

        lblPtsNeeded.setText("     ");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(224, 31, 31));
        jLabel8.setText("*");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(223, 20, 20));
        jLabel9.setText("*");

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

        lblStatus.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(228, 27, 27));

        lblProdDesc.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPtsNeededLHS)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProductDescLHS)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(lblPtsNeeded, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPtsneeded, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnSubmit)
                .addGap(79, 79, 79)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductDescLHS)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(7, 7, 7)
                .addComponent(lblPtsNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPtsNeededLHS)
                    .addComponent(lblPtsneeded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnBack))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        RewardCatalog rc;
       
        try {
            rc = new RewardCatalog();
            rc.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddReward.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddReward.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnBackActionPerformed
     /*JFileChooser chooser;
        FileNameExtensionFilter filter;
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(image);
        filter = new FileNameExtensionFilter("jpeg, gif and png files", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
 
        int i = chooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            image = chooser.getSelectedFile();
            btnUpload.setText(image.getAbsolutePath());
            try {
                BufferedImage originalImage = ImageIO.read(image);
                int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
 
                BufferedImage resizeImageJpg = resizeImage(originalImage, type);
                photo = new ImageIcon(toImage(resizeImageJpg));
 
                //converting buffered image to byte array
                raster = resizeImageJpg.getRaster();
                data = (DataBufferByte) raster.getDataBuffer();
 
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
 
 
            //jPanel2.removeAll();
            label = new JLabel("", photo, JLabel.CENTER);
           // jPanel2.add(label);
 
            repaint();
            chooser.setCurrentDirectory(image);
        }
 
    }
    public Image toImage(BufferedImage bufferedImage) {
        return Toolkit.getDefaultToolkit().createImage(bufferedImage.getSource());*/


 /*fileChooser = new JFileChooser("/home/", FileSystemView.getFileSystemView());
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "tif", "gif", "bmp"));
            int returnVal = fileChooser.showOpenDialog(pobj);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String fileName = fileChooser.getSelectedFile().getName();
                String extension = fileName.substring(fileName.lastIndexOf("."));
                if (extension.equalsIgnoreCase(".jpg") || extension.equalsIgnoreCase(".png")
                        || extension.equalsIgnoreCase(".bmp") || extension.equalsIgnoreCase(".tif")
                        || extension.equalsIgnoreCase(".gif")) {
                    lblStatus.setText(fileChooser.getSelectedFile().getPath());
                } else {
                    JOptionPane.showMessageDialog(this, "Kindly Select Image File Only",
"Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                lblStatus.setText("No File Uploaded");
            }*/
    //}
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        // try {

        // TODO add your handling code here:
        /*Connection connect;
             try {
             connect = ConnectionClass.getConnected();
             String sql="insert into product values(prod_seq.nextval,?,?,?)";
             PreparedStatement st=connect.prepareStatement(sql);
             
             st.setString(2,lblProdDesc.getText());
             st.setInt(4,Integer.parseInt(lblPtsNeeded.getText()));
             byte[] extractBytes = data.getData();
             st.setBytes(3, extractBytes);
             int s = st.executeUpdate();
             if (s > 0) {
             lblStatus.setText("Uploaded successfully !");
             
             //JOptionPane.showMessageDialog(rootPane, "Uploaded successfully !");
             } else {
             lblStatus.setText("unsucessfull to upload image.");
             }
             connect.close();
             st.close();
             } // catch if found any exception during rum time.
             
             
             
             catch (ClassNotFoundException ex) {
             Logger.getLogger(AddReward.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
             Logger.getLogger(AddReward.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             }
             private static BufferedImage resizeImage(BufferedImage originalImage, int type) {
             BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
             //Graphics2D g = resizedImage.createGraphics();
             //g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
             //g.dispose();
             
             return resizedImage;*/
        Connection connect;
        try {
            connect = ConnectionClass.getConnected();
            Statement st = connect.createStatement();
            if(lblProdDesc.getText().trim().equals("")||lblPtsneeded.getText().trim().equals(""))
                lblStatus.setText("Fields can't be Empty");
            else{   
            String sql = "insert into product(product_id,product_desc,points_reqd)values(prod_seq.nextval,'" + lblProdDesc.getText().trim() + "','" + lblPtsneeded.getText().trim() + "')";

            System.out.println(lblPtsneeded.getText());

            int r = st.executeUpdate(sql);
            if (r > 0) {
                lblStatus.setText("Details added successfully");
                lblProdDesc.setText("");
                lblPtsneeded.setText("");
            } else {
                lblStatus.setText("Error in inserting values");
            }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddReward.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddReward.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*SaveImage(lblStatus.getText());
         }catch (IOException ex) {
             Logger.getLogger(AddReward.class.getName()).log(Level.SEVERE, null, ex);
         }*/

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
            java.util.logging.Logger.getLogger(AddReward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddReward().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AddReward.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lblProdDesc;
    private javax.swing.JLabel lblProductDescLHS;
    private javax.swing.JLabel lblPtsNeeded;
    private javax.swing.JLabel lblPtsNeededLHS;
    private javax.swing.JTextField lblPtsneeded;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables

    /*private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
