package projectform;

import Wikipedia.*;
import java.io.*;
import javax.swing.*;

public class proformmanager extends javax.swing.JFrame {

    public proformmanager() {
        initComponents();
        this.setSize(1150, 720);
        this.setLocationRelativeTo(null);
    }

    proform pf = new proform();
    String part;
    String e;
    String manager_new;
    String manager_comment;
    String arr2[];
    Article ar = new Article();
    manager man = new manager();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cb_articles = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_show_articles = new javax.swing.JTextArea();
        btn_comment = new javax.swing.JButton();
        tf_comment = new javax.swing.JTextField();
        btn_chat = new javax.swing.JButton();
        btn_show_articles = new javax.swing.JButton();
        btn_sign_out = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manager");

        cb_articles.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cb_articles.setMaximumRowCount(18);
        cb_articles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cb_articles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_articlesActionPerformed(evt);
            }
        });

        ta_show_articles.setEditable(false);
        ta_show_articles.setColumns(20);
        ta_show_articles.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ta_show_articles.setLineWrap(true);
        ta_show_articles.setRows(5);
        ta_show_articles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane2.setViewportView(ta_show_articles);

        btn_comment.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn_comment.setText("Comment");
        btn_comment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_comment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commentActionPerformed(evt);
            }
        });

        tf_comment.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tf_comment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btn_chat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_chat.setText("Chat");
        btn_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chatActionPerformed(evt);
            }
        });

        btn_show_articles.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_show_articles.setText("Show Articles");
        btn_show_articles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_show_articlesActionPerformed(evt);
            }
        });

        btn_sign_out.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_sign_out.setText("Sign Out");
        btn_sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sign_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_comment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(tf_comment))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_articles, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_show_articles)
                                .addGap(81, 81, 81))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                        .addGap(82, 82, 82)
                        .addComponent(btn_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sign_out)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_chat)
                    .addComponent(btn_sign_out))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_comment, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_comment, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_articles, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btn_show_articles)))
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_commentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commentActionPerformed
        // TODO add your handling code here:
        man.setComment(tf_comment.getText());
        man.comment(manager_new, manager_comment,(String) cb_articles.getSelectedItem() );
        tf_comment.setText("");
    }//GEN-LAST:event_btn_commentActionPerformed

    private void cb_articlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_articlesActionPerformed
        // TODO add your handling code here:
        e = ar.ShowContant(manager_new, (String) cb_articles.getSelectedItem());
        ta_show_articles.setText(e);
    }//GEN-LAST:event_cb_articlesActionPerformed

    private void btn_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chatActionPerformed
        // TODO add your handling code here:
        try {
            ProcessBuilder p = new ProcessBuilder("Chat 1.2\\Myserver");
            p.start();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btn_chatActionPerformed

    private void btn_show_articlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_show_articlesActionPerformed
        // TODO add your handling code here:
        part = pf.m.check_dept_m();
        manager_new = "Articles\\" + part + "\\manager\\manager_new\\";
        manager_comment = "Articles\\"+part+"\\manager\\manager_comm\\";
        arr2 = ar.show(manager_new);
        for (int i = 0; i < arr2.length; i++) {
            cb_articles.addItem(arr2[i]);
        }
        btn_show_articles.setVisible(false);
    }//GEN-LAST:event_btn_show_articlesActionPerformed

    private void btn_sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sign_outActionPerformed
        // TODO add your handling code here:
        proform0 pfs = new proform0();
        pfs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sign_outActionPerformed

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
            java.util.logging.Logger.getLogger(proformmanager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proformmanager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proformmanager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proformmanager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proformmanager().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chat;
    private javax.swing.JButton btn_comment;
    private javax.swing.JButton btn_show_articles;
    private javax.swing.JButton btn_sign_out;
    private javax.swing.JComboBox<String> cb_articles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea ta_show_articles;
    private javax.swing.JTextField tf_comment;
    // End of variables declaration//GEN-END:variables
}
