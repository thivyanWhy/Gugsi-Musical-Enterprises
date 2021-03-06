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
public class WelcomeMain extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeMain
     */
    public WelcomeMain() {
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

        staffLoginButton = new javax.swing.JButton();
        customerLoginButton = new javax.swing.JButton();
        quoteLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox();
        sortComboBox = new javax.swing.JComboBox();
        priceSlider = new javax.swing.JSlider();
        homeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to GME");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffLoginButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        staffLoginButton.setText("Staff Login");
        staffLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(staffLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 0, 127, -1));

        customerLoginButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        customerLoginButton.setText("Customer Login");
        customerLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(customerLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 127, -1));

        quoteLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        quoteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quoteLabel.setText("\"One good thing about music, when it hits you, you feel no pain.\" - Bob Marley");
        quoteLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(quoteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, -1));

        titleLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 40)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Gugsi Musical Enterprises");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 830, -1));

        categoryComboBox.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acoustic guitars", "Electric guitars", "Amplifiers", "Picks" }));
        categoryComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(categoryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        sortComboBox.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ratings", "Name(A - Z)", "Price (Low > High)", "Price (High > Low)" }));
        sortComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(sortComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        priceSlider.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        priceSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(priceSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        homeButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        homeButton.setText("GME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 10, 10));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel12.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel12);

        jLabel16.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel16);

        jLabel17.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel17);

        jLabel15.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel15);

        jLabel14.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel14);

        jLabel18.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel18);

        jLabel19.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel19);

        jLabel20.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel20);

        jLabel21.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel21);

        jLabel13.setText("jLabel12");
        jScrollPane1.setViewportView(jLabel13);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 840, 410));

        setSize(new java.awt.Dimension(836, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void categoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryComboBoxActionPerformed

    private void staffLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffLoginButtonActionPerformed
       StaffLogin obj = new StaffLogin();
       obj.setVisible(true);
            this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_staffLoginButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        WelcomeMain obj = new WelcomeMain();
        obj.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void customerLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerLoginButtonActionPerformed
        CustomerLogin obj = new CustomerLogin();
        obj.setVisible(true);
            this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_customerLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox categoryComboBox;
    private javax.swing.JButton customerLoginButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider priceSlider;
    private javax.swing.JLabel quoteLabel;
    private javax.swing.JComboBox sortComboBox;
    private javax.swing.JButton staffLoginButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
