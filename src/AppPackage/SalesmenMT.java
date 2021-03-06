/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

/**
 *
 * @author BLACKOUT
 */
public class SalesmenMT extends javax.swing.JFrame {

    /**
     * Creates new form SalesmenMT
     */
    public SalesmenMT() {
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

        signOutButton = new javax.swing.JButton();
        helloLabel = new javax.swing.JLabel();
        stockDetailsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salesmen");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signOutButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        signOutButton.setText("Sign Out");
        signOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 127, -1));

        helloLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        helloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helloLabel.setText("Salesmen Mount Lavinia");
        getContentPane().add(helloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 530, 30));

        stockDetailsButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        stockDetailsButton.setText("Stock Details");
        stockDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockDetailsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stockDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        homeButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        homeButton.setText("GME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 10, 10));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        WelcomeMain obj1 = new WelcomeMain();
        obj1.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void stockDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockDetailsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockDetailsButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        WelcomeMain obj = new WelcomeMain();
        obj.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SalesmenMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesmenMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesmenMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesmenMT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesmenMT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helloLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton signOutButton;
    private javax.swing.JButton stockDetailsButton;
    // End of variables declaration//GEN-END:variables
}
