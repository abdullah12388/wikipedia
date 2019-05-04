package projectform;

import Wikipedia.*;
import java.io.*;
import javax.swing.*;

public class proformshow extends javax.swing.JFrame {

    public proformshow() {
        initComponents();
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
    }

    Article ar = new Article();
    String[] arr1 = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_show_article = new javax.swing.JTextArea();
        cb_articles = new javax.swing.JComboBox<>();
        tf_comment = new javax.swing.JTextField();
        btn_comment = new javax.swing.JButton();
        btn_rate = new javax.swing.JButton();
        tf_rate = new javax.swing.JTextField();
        show_articles = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Show Articles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 48))); // NOI18N

        ta_show_article.setEditable(false);
        ta_show_article.setColumns(20);
        ta_show_article.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ta_show_article.setLineWrap(true);
        ta_show_article.setRows(5);
        ta_show_article.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta_show_article);

        cb_articles.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cb_articles.setMaximumRowCount(10);
        cb_articles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_articlesActionPerformed(evt);
            }
        });

        tf_comment.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        btn_comment.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_comment.setText("Comment");
        btn_comment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commentActionPerformed(evt);
            }
        });

        btn_rate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_rate.setText("Rate");
        btn_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rateActionPerformed(evt);
            }
        });

        tf_rate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        show_articles.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        show_articles.setText("Show Articles");
        show_articles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_articlesActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tf_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_rate))
                                    .addComponent(cb_articles, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_comment, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_comment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(show_articles)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_articles, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(show_articles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(tf_comment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_comment, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_commentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commentActionPerformed
        // TODO add your handling code here:
        proformwiki pfw = new proformwiki();
        Rate r = new Rate();
        r.setPath(pfw.Show + (String) cb_articles.getSelectedItem());
        r.setComment(tf_comment.getText());
        r.AddComment();
        tf_comment.setText("");
    }//GEN-LAST:event_btn_commentActionPerformed

    private void btn_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rateActionPerformed
        try {
            // TODO add your handling code here:
            int x = Integer.parseInt(tf_rate.getText());
            proformwiki pfw = new proformwiki();
            Rate r = new Rate();
            r.setPath(pfw.Show + (String) cb_articles.getSelectedItem());
            r.setRate(x);
            r.Rating();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btn_rateActionPerformed

    private void cb_articlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_articlesActionPerformed
        // TODO add your handling code here:
        proformwiki pfw = new proformwiki();
        String e = ar.ShowContant(pfw.Show, (String) cb_articles.getSelectedItem());
        ta_show_article.setText(e);
    }//GEN-LAST:event_cb_articlesActionPerformed

    private void show_articlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_articlesActionPerformed
        // TODO add your handling code here:
        proformwiki pfw = new proformwiki();
        switch (pfw.check1) {
            case "Art":
                pfw.Show = "Articles\\art\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
            case "Sports":
                pfw.Show = "Articles\\sport\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
            case "Maths":
                pfw.Show = "Articles\\maths\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
            case "Biology":
                pfw.Show = "Articles\\biology\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
            case "Physics":
                pfw.Show = "Articles\\physics\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
            case "Chemistry":
                pfw.Show = "Articles\\chemistry\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
            case "Philosophy":
                pfw.Show = "Articles\\philosophy\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
            case "Politics":
                pfw.Show = "Articles\\politics\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
            case "Economy":
                pfw.Show = "Articles\\economy\\really_show\\";
                arr1 = ar.show(pfw.Show);
                break;
        }

        for (int i = 0; i < arr1.length; i++) {
            cb_articles.addItem(arr1[i]);
        }
        show_articles.setVisible(false);
    }//GEN-LAST:event_show_articlesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new proformwiki().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(proformshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proformshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proformshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proformshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proformshow().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comment;
    private javax.swing.JButton btn_rate;
    public javax.swing.JComboBox<String> cb_articles;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton show_articles;
    private javax.swing.JTextArea ta_show_article;
    private javax.swing.JTextField tf_comment;
    private javax.swing.JTextField tf_rate;
    // End of variables declaration//GEN-END:variables
}
