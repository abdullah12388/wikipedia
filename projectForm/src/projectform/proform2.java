package projectform;

import Wikipedia.*;
import javax.swing.JOptionPane;

public class proform2 extends javax.swing.JFrame {

    public proform2() {
        initComponents();
        this.setSize(800, 821);
        lbl.setSize(800, 821);
        this.setLocationRelativeTo(null);
    }
    public user ur = new user();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_first_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_e_mail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_last_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        btn_premium = new javax.swing.JButton();
        tf_password = new javax.swing.JTextField();
        btn_free = new javax.swing.JButton();
        tf_birthday = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_mob = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign UP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 336, 74);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 152, 129, 44);

        tf_first_name.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tf_first_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_first_nameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_first_name);
        tf_first_name.setBounds(260, 140, 400, 60);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("G-Mail :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 306, 100, 44);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 230, 124, 44);

        tf_e_mail.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tf_e_mail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_e_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_e_mailActionPerformed(evt);
            }
        });
        getContentPane().add(tf_e_mail);
        tf_e_mail.setBounds(260, 300, 400, 57);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birthday :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 380, 106, 44);

        tf_last_name.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tf_last_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_last_nameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_last_name);
        tf_last_name.setBounds(260, 220, 400, 60);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 460, 112, 44);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment Type :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 620, 161, 28);

        btn_submit.setBackground(new java.awt.Color(0, 0, 0));
        btn_submit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit);
        btn_submit.setBounds(370, 690, 127, 50);

        btn_premium.setBackground(new java.awt.Color(0, 0, 0));
        btn_premium.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_premium.setForeground(new java.awt.Color(255, 255, 255));
        btn_premium.setText("Premium");
        btn_premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_premiumActionPerformed(evt);
            }
        });
        getContentPane().add(btn_premium);
        btn_premium.setBounds(500, 610, 158, 50);

        tf_password.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tf_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(tf_password);
        tf_password.setBounds(260, 460, 400, 57);

        btn_free.setBackground(new java.awt.Color(0, 0, 0));
        btn_free.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_free.setForeground(new java.awt.Color(255, 255, 255));
        btn_free.setText("Free");
        btn_free.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_freeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_free);
        btn_free.setBounds(260, 610, 127, 50);

        tf_birthday.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tf_birthday.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_birthdayActionPerformed(evt);
            }
        });
        getContentPane().add(tf_birthday);
        tf_birthday.setBounds(260, 380, 400, 57);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 540, 87, 44);

        tf_mob.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        tf_mob.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mobActionPerformed(evt);
            }
        });
        getContentPane().add(tf_mob);
        tf_mob.setBounds(260, 530, 400, 60);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectform/signupbackground.jpg"))); // NOI18N
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 800, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_last_nameActionPerformed

    private void tf_e_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_e_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_e_mailActionPerformed

    private void tf_first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_first_nameActionPerformed

    private void tf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passwordActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        String s1 = tf_first_name.getText();
        String s2 = tf_last_name.getText();
        String s3 = tf_password.getText();
        boolean x, y, z;
        x = false;
        y = false;
        z = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '0' || s1.charAt(i) == '1' || s1.charAt(i) == '2' || s1.charAt(i) == '3' || s1.charAt(i) == '4' || s1.charAt(i) == '5' || s1.charAt(i) == '6' || s1.charAt(i) == '7' || s1.charAt(i) == '8' || s1.charAt(i) == '9') {
                JOptionPane.showMessageDialog(null, "You can't enter a number in First Name!");
                x = true;
            }
        }

        for (int j = 0; j < s2.length(); j++) {
            if (s2.charAt(j) == '0' || s2.charAt(j) == '1' || s2.charAt(j) == '2' || s2.charAt(j) == '3' || s2.charAt(j) == '4' || s2.charAt(j) == '5' || s2.charAt(j) == '6' || s2.charAt(j) == '7' || s2.charAt(j) == '8' || s2.charAt(j) == '9') {
                JOptionPane.showMessageDialog(null, "You can't enter a number in Last Name!");
                y = true;
            }
        }
        if (tf_password.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "You password is less than 8 character");
            z = true;
        }

        if (x == true || y == true || z == true) {
            JOptionPane.showMessageDialog(null, "You can't sign up handel your erorr");
        } else {
            ur.setFn(tf_first_name.getText());
            ur.setLn(tf_last_name.getText());
            ur.setEmail(tf_e_mail.getText());
            ur.setBirthday(tf_birthday.getText());
            ur.setPassword(tf_password.getText());
            ur.setMob(tf_mob.getText());
            ur.signUp();
            new proform().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_freeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_freeActionPerformed
        // TODO add your handling code here:
        payment p = new payment();
        p.setCheck_f_p("free");
        ur.setBill_type("free");
        p.Check_Free_premium();
    }//GEN-LAST:event_btn_freeActionPerformed

    private void btn_premiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_premiumActionPerformed
        // TODO add your handling code here:
        new proform3().setVisible(true);
        ur.setBill_type("premium");
    }//GEN-LAST:event_btn_premiumActionPerformed

    private void tf_birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_birthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_birthdayActionPerformed

    private void tf_mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_mobActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(proform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proform2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_free;
    private javax.swing.JButton btn_premium;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl;
    private javax.swing.JTextField tf_birthday;
    private javax.swing.JTextField tf_e_mail;
    private javax.swing.JTextField tf_first_name;
    private javax.swing.JTextField tf_last_name;
    private javax.swing.JTextField tf_mob;
    private javax.swing.JTextField tf_password;
    // End of variables declaration//GEN-END:variables
}
