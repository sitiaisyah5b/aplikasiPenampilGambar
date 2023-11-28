import java.awt.CardLayout;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aisyah
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel = new javax.swing.JPanel();
        lblAnimeBiru = new javax.swing.JLabel();
        lblAnimeMerah = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        btnCookies = new javax.swing.JButton();
        btnPancong = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagePanel.setLayout(new java.awt.CardLayout());

        lblAnimeBiru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pancong.png"))); // NOI18N
        imagePanel.add(lblAnimeBiru, "0");

        lblAnimeMerah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cookies.png"))); // NOI18N
        imagePanel.add(lblAnimeMerah, "1");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        btnCookies.setText("Cookies");
        btnCookies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCookiesActionPerformed(evt);
            }
        });
        buttonPanel.add(btnCookies);

        btnPancong.setText("Pancong");
        btnPancong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPancongActionPerformed(evt);
            }
        });
        buttonPanel.add(btnPancong);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        buttonPanel.add(btnExit);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCookiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCookiesActionPerformed
        CardLayout layoutGambar = (CardLayout) (imagePanel.getLayout());
        layoutGambar.show(imagePanel, "1");
    }//GEN-LAST:event_btnCookiesActionPerformed

    private void btnPancongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPancongActionPerformed
        CardLayout layoutGambar = (CardLayout) (imagePanel.getLayout());
        layoutGambar.show(imagePanel, "0");
    }//GEN-LAST:event_btnPancongActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCookies;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPancong;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lblAnimeBiru;
    private javax.swing.JLabel lblAnimeMerah;
    // End of variables declaration//GEN-END:variables
}
