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
public class StockDetails extends javax.swing.JFrame {

    /**
     * Creates new form StockDetails
     */
    public StockDetails() {
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

        stockTransitLabel = new javax.swing.JLabel();
        stockMountLaviniaLabel = new javax.swing.JLabel();
        stockWellawattaLabel = new javax.swing.JLabel();
        stockWarehouseLabel = new javax.swing.JLabel();
        stockDetailsLabel = new javax.swing.JLabel();
        hireButton = new javax.swing.JButton();
        purchaseStockButton = new javax.swing.JButton();
        stockDetailsButton = new javax.swing.JButton();
        transferStockButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        signOutButton = new javax.swing.JButton();
        stockWellawattaScrollPane = new javax.swing.JScrollPane();
        stockWarehouseScrollPane = new javax.swing.JScrollPane();
        stockTransitScrollPane = new javax.swing.JScrollPane();
        stockMountLaviniaScrollPane = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stockTransitLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        stockTransitLabel.setText("Stock in Transit");
        getContentPane().add(stockTransitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        stockMountLaviniaLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        stockMountLaviniaLabel.setText("Stock in Mount Lavinia");
        getContentPane().add(stockMountLaviniaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        stockWellawattaLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        stockWellawattaLabel.setText("Stock in Wellawatta");
        getContentPane().add(stockWellawattaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        stockWarehouseLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        stockWarehouseLabel.setText("Stock in Warehouse");
        getContentPane().add(stockWarehouseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        stockDetailsLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 30)); // NOI18N
        stockDetailsLabel.setText("Stock Details");
        getContentPane().add(stockDetailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        hireButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        hireButton.setText("Hire");
        getContentPane().add(hireButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        purchaseStockButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        purchaseStockButton.setText("Purchase");
        purchaseStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseStockButtonActionPerformed(evt);
            }
        });
        getContentPane().add(purchaseStockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        stockDetailsButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        stockDetailsButton.setText("Stock Details");
        stockDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockDetailsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stockDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        transferStockButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        transferStockButton.setText("Transfer Stock");
        transferStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferStockButtonActionPerformed(evt);
            }
        });
        getContentPane().add(transferStockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        homeButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        homeButton.setText("GME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        signOutButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        signOutButton.setText("Sign Out");
        signOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 0, 127, -1));
        getContentPane().add(stockWellawattaScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 370, 180));
        getContentPane().add(stockWarehouseScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 370, 180));
        getContentPane().add(stockTransitScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 370, 180));
        getContentPane().add(stockMountLaviniaScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 370, 180));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 10, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseStockButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseStockButtonActionPerformed

    private void stockDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockDetailsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockDetailsButtonActionPerformed

    private void transferStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferStockButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferStockButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        WelcomeMain obj1 = new WelcomeMain();
        obj1.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        WelcomeMain obj1 = new WelcomeMain();
        obj1.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_signOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StockDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hireButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton purchaseStockButton;
    private javax.swing.JButton signOutButton;
    private javax.swing.JButton stockDetailsButton;
    private javax.swing.JLabel stockDetailsLabel;
    private javax.swing.JLabel stockMountLaviniaLabel;
    private javax.swing.JScrollPane stockMountLaviniaScrollPane;
    private javax.swing.JLabel stockTransitLabel;
    private javax.swing.JScrollPane stockTransitScrollPane;
    private javax.swing.JLabel stockWarehouseLabel;
    private javax.swing.JScrollPane stockWarehouseScrollPane;
    private javax.swing.JLabel stockWellawattaLabel;
    private javax.swing.JScrollPane stockWellawattaScrollPane;
    private javax.swing.JButton transferStockButton;
    // End of variables declaration//GEN-END:variables
}
