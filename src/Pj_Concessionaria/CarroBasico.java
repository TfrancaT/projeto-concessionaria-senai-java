/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pj_Concessionaria;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Tales
 */
public class CarroBasico extends javax.swing.JFrame {
    
    private final TelaInicial telaInicial;

    /**
     * Creates new form CarroBasico
     */
    public CarroBasico(TelaInicial telaInicial) {
        initComponents();
        this.telaInicial = telaInicial;
        exibirImagem();
    }

    private CarroBasico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        
    private void exibirImagem(){
        ImageIcon originalPegeout = new ImageIcon("src/Imagens/pegeoutDoisZeroOito.png");
        Image imagePegeout = originalPegeout.getImage().getScaledInstance(lblBasicOne.getWidth(), lblBasicOne.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImagePegeout = new ImageIcon(imagePegeout);
        lblBasicOne.setIcon(newImagePegeout);
        
        ImageIcon originalCQuatro = new ImageIcon("src/Imagens/citroenC4.png");
        Image imageCQuatro = originalCQuatro.getImage().getScaledInstance(lblBasicTwo.getWidth(), lblBasicTwo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImageCQuatro = new ImageIcon(imageCQuatro);
        lblBasicTwo.setIcon(newImageCQuatro);
        
        ImageIcon originalClassic = new ImageIcon("src/Imagens/corsaClassic.png");
        Image imageClassic = originalClassic.getImage().getScaledInstance(lblBasicThree.getWidth(), lblBasicThree.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImageClassic = new ImageIcon(imageClassic);
        lblBasicThree.setIcon(newImageClassic);
        
        ImageIcon originalCivic = new ImageIcon("src/Imagens/hondaCivic.png");
        Image imageCivic = originalCivic.getImage().getScaledInstance(lblBasicFour.getWidth(), lblBasicFour.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImageCivic = new ImageIcon(imageCivic);
        lblBasicFour.setIcon(newImageCivic);
        
        ImageIcon originalGol = new ImageIcon("src/Imagens/volkswagenGol.png");
        Image imageGol = originalGol.getImage().getScaledInstance(lblBasicFive.getWidth(), lblBasicFive.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImageGol = new ImageIcon(imageGol);
        lblBasicFive.setIcon(newImageGol);
        
        ImageIcon originalLogan = new ImageIcon("src/Imagens/renaultLogan.png");
        Image imageLogan = originalLogan.getImage().getScaledInstance(lblBasicSix.getWidth(), lblBasicSix.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImageLogan = new ImageIcon(imageLogan);
        lblBasicSix.setIcon(newImageLogan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblBasicThree = new javax.swing.JLabel();
        lblBasicOne = new javax.swing.JLabel();
        lblBasicFour = new javax.swing.JLabel();
        lblBasicTwo = new javax.swing.JLabel();
        lblBasicFive = new javax.swing.JLabel();
        lblBasicSix = new javax.swing.JLabel();
        btnC4 = new javax.swing.JButton();
        btnPegeout = new javax.swing.JButton();
        btnClassic = new javax.swing.JButton();
        btnCivic = new javax.swing.JButton();
        btnGol = new javax.swing.JButton();
        btnLogan = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnC4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnC4.setText("Eu quero um Pegeout");
        btnC4.setActionCommand("Eu quero um C4");
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });

        btnPegeout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPegeout.setText("Eu quero um C4");
        btnPegeout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegeoutActionPerformed(evt);
            }
        });

        btnClassic.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnClassic.setText("Eu quero um Classic");
        btnClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassicActionPerformed(evt);
            }
        });

        btnCivic.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCivic.setText("Eu quero um Civic");
        btnCivic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCivicActionPerformed(evt);
            }
        });

        btnGol.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnGol.setText("Eu quero um Gol");
        btnGol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolActionPerformed(evt);
            }
        });

        btnLogan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLogan.setText("Eu quero um Logan");
        btnLogan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblBasicOne, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblBasicTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPegeout))
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblBasicThree, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClassic))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBasicFour, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCivic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblBasicFive, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGol))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBasicSix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBasicThree, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBasicTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBasicOne, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPegeout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClassic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBasicFive, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBasicFour, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBasicSix, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCivic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnPegeoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegeoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPegeoutActionPerformed

    private void btnClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClassicActionPerformed

    private void btnCivicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCivicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCivicActionPerformed

    private void btnGolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGolActionPerformed

    private void btnLoganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoganActionPerformed

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
            java.util.logging.Logger.getLogger(CarroBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarroBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarroBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarroBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarroBasico().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnCivic;
    private javax.swing.JButton btnClassic;
    private javax.swing.JButton btnGol;
    private javax.swing.JButton btnLogan;
    private javax.swing.JButton btnPegeout;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblBasicFive;
    private javax.swing.JLabel lblBasicFour;
    private javax.swing.JLabel lblBasicOne;
    private javax.swing.JLabel lblBasicSix;
    private javax.swing.JLabel lblBasicThree;
    private javax.swing.JLabel lblBasicTwo;
    // End of variables declaration//GEN-END:variables
}
