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
public class Hire extends javax.swing.JFrame {

    /**
     * Creates new form Hire
     */
    public Hire() {
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
        hireButton = new javax.swing.JButton();
        stockDetailsButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        purchaseStockButton = new javax.swing.JButton();
        transferStockButton = new javax.swing.JButton();
        employeeHireLabel = new javax.swing.JLabel();
        employeePhoneNoLabel = new javax.swing.JLabel();
        employeeIDLabel = new javax.swing.JLabel();
        employeeNameLabel = new javax.swing.JLabel();
        employeeNICLabel = new javax.swing.JLabel();
        employeeDOBLabel = new javax.swing.JLabel();
        employeeTitleLabel = new javax.swing.JLabel();
        employeeBranchLabel = new javax.swing.JLabel();
        employeeGenderLabel = new javax.swing.JLabel();
        employeeNameTextField = new javax.swing.JTextField();
        employeeNICTextField = new javax.swing.JTextField();
        employeeDOBTextField = new javax.swing.JTextField();
        employeePhoneNoTextField = new javax.swing.JTextField();
        employeeIDTextField = new javax.swing.JTextField();
        employeeGenderComboBox = new javax.swing.JComboBox();
        employeeBranchComboBox = new javax.swing.JComboBox();
        employeeTitleComboBox = new javax.swing.JComboBox();
        discardHireButton = new javax.swing.JButton();
        submitHireButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hire Employee");
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
        getContentPane().add(signOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 0, 127, -1));

        hireButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        hireButton.setText("Hire");
        getContentPane().add(hireButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        stockDetailsButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        stockDetailsButton.setText("Stock Details");
        stockDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockDetailsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stockDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        homeButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        homeButton.setText("GME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 10, 10));

        purchaseStockButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        purchaseStockButton.setText("Purchase");
        purchaseStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseStockButtonActionPerformed(evt);
            }
        });
        getContentPane().add(purchaseStockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        transferStockButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 13)); // NOI18N
        transferStockButton.setText("Transfer Stock");
        transferStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferStockButtonActionPerformed(evt);
            }
        });
        getContentPane().add(transferStockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        employeeHireLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 30)); // NOI18N
        employeeHireLabel.setText("Employee Details");
        getContentPane().add(employeeHireLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        employeePhoneNoLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeePhoneNoLabel.setText("Employee Phone No");
        getContentPane().add(employeePhoneNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        employeeIDLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeIDLabel.setText("Employee ID");
        getContentPane().add(employeeIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        employeeNameLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeNameLabel.setText("Employee Name");
        getContentPane().add(employeeNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        employeeNICLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeNICLabel.setText("Employee NIC");
        getContentPane().add(employeeNICLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        employeeDOBLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeDOBLabel.setText("Employee Date of Birth");
        getContentPane().add(employeeDOBLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        employeeTitleLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeTitleLabel.setText("Employee Job Title");
        getContentPane().add(employeeTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        employeeBranchLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeBranchLabel.setText("Employee Branch");
        getContentPane().add(employeeBranchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        employeeGenderLabel.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeGenderLabel.setText("Employee Gender");
        getContentPane().add(employeeGenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        employeeNameTextField.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        getContentPane().add(employeeNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 320, -1));

        employeeNICTextField.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        getContentPane().add(employeeNICTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 320, -1));

        employeeDOBTextField.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeDOBTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeDOBTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(employeeDOBTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 320, -1));

        employeePhoneNoTextField.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        getContentPane().add(employeePhoneNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 320, -1));

        employeeIDTextField.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(employeeIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 320, -1));

        employeeGenderComboBox.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "Transgender", "Other" }));
        employeeGenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeGenderComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(employeeGenderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 337, 160, 30));

        employeeBranchComboBox.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeBranchComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wellawatta", "Mount Lavinia", "Warehouse" }));
        getContentPane().add(employeeBranchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        employeeTitleComboBox.setFont(new java.awt.Font("Nanum Myeongjo", 0, 20)); // NOI18N
        employeeTitleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Salesman", "General Labor" }));
        getContentPane().add(employeeTitleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        discardHireButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 15)); // NOI18N
        discardHireButton.setText("Discard");
        getContentPane().add(discardHireButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, -1, -1));

        submitHireButton.setFont(new java.awt.Font("Nanum Myeongjo", 0, 15)); // NOI18N
        submitHireButton.setText("Submit");
        submitHireButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitHireButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitHireButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, -1, -1));

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
        WelcomeMain obj1 = new WelcomeMain();
        obj1.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void purchaseStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseStockButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseStockButtonActionPerformed

    private void transferStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferStockButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferStockButtonActionPerformed

    private void employeeDOBTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeDOBTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeDOBTextFieldActionPerformed

    private void employeeIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIDTextFieldActionPerformed

    private void employeeGenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeGenderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeGenderComboBoxActionPerformed

    private void submitHireButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitHireButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitHireButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Hire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton discardHireButton;
    private javax.swing.JComboBox employeeBranchComboBox;
    private javax.swing.JLabel employeeBranchLabel;
    private javax.swing.JLabel employeeDOBLabel;
    private javax.swing.JTextField employeeDOBTextField;
    private javax.swing.JComboBox employeeGenderComboBox;
    private javax.swing.JLabel employeeGenderLabel;
    private javax.swing.JLabel employeeHireLabel;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JTextField employeeIDTextField;
    private javax.swing.JLabel employeeNICLabel;
    private javax.swing.JTextField employeeNICTextField;
    private javax.swing.JLabel employeeNameLabel;
    private javax.swing.JTextField employeeNameTextField;
    private javax.swing.JLabel employeePhoneNoLabel;
    private javax.swing.JTextField employeePhoneNoTextField;
    private javax.swing.JComboBox employeeTitleComboBox;
    private javax.swing.JLabel employeeTitleLabel;
    private javax.swing.JButton hireButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton purchaseStockButton;
    private javax.swing.JButton signOutButton;
    private javax.swing.JButton stockDetailsButton;
    private javax.swing.JButton submitHireButton;
    private javax.swing.JButton transferStockButton;
    // End of variables declaration//GEN-END:variables
}
