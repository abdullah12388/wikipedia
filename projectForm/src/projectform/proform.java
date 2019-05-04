package projectform;

import java.awt.*;
import javax.swing.*;
import Wikipedia.*;

public class proform extends javax.swing.JFrame {

    public proform() {
        initComponents();
        this.setSize(800, 470);
        lbl.setSize(800, 470);
        this.setLocationRelativeTo(null);
    }
    public static String check = "";
    public static user us = new user();
    public static admin ad = new admin();
    public static manager m = new manager();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_log_in = new javax.swing.JButton();
        pass = new javax.swing.JTextField();
        e_mail = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Log in");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 40, 160, 60);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("G - Mail:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 150, 110, 50);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");
        jLabel4.setPreferredSize(new java.awt.Dimension(137, 29));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 150, 150, 50);

        btn_log_in.setBackground(new java.awt.Color(0, 0, 0));
        btn_log_in.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_log_in.setForeground(new java.awt.Color(255, 255, 255));
        btn_log_in.setText("Log in");
        btn_log_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log_inActionPerformed(evt);
            }
        });
        getContentPane().add(btn_log_in);
        btn_log_in.setBounds(350, 310, 100, 40);

        pass.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(410, 210, 320, 40);

        e_mail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        e_mail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        e_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_mailActionPerformed(evt);
            }
        });
        getContentPane().add(e_mail);
        e_mail.setBounds(70, 210, 320, 40);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectform/loginbackground.jpg"))); // NOI18N
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 800, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void btn_log_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log_inActionPerformed
        // TODO add your handling code here:
        if (check.equals("admin")) {
            ad.setPath("Stuff Data\\admin.txt");
            ad.setEmail(e_mail.getText());
            ad.setPassword(pass.getText());
            if (ad.sign_in()) {
                new proformadmin().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "you are not a admin");
            }
        }else if(check.equals("user")){
            us.setPath("Stuff Data\\user.txt");
            us.setEmail(e_mail.getText());
            us.setPassword(pass.getText());
            if(us.sign_in()){
                new proformwiki().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "you are not a user");
            }
        }else if(check.equals("manager")){
            m.setPath("Stuff Data\\manager.txt");
            m.setEmail(e_mail.getText());
            m.setPassword(pass.getText());
            if(m.sign_in()){
                new proformmanager().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "you are not a manager");
            }
        }
    }//GEN-LAST:event_btn_log_inActionPerformed

    private void e_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_mailActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_log_in;
    private javax.swing.JTextField e_mail;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl;
    private javax.swing.JTextField pass;
    // End of variables declaration//GEN-END:variables
}
