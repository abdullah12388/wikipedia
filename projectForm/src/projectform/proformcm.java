package projectform;

import Wikipedia.*;

public class proformcm extends javax.swing.JFrame {

    public proformcm() {
        initComponents();
        this.setSize(1000, 692);
        this.setLocationRelativeTo(null);
    }
    public static String dip = "";
    public static String really_show = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_show_article = new javax.swing.JTextArea();
        tf_article_name = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_edit_article = new javax.swing.JTextArea();
        btn_update = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manager Comment");

        ta_show_article.setEditable(false);
        ta_show_article.setColumns(20);
        ta_show_article.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ta_show_article.setRows(5);
        jScrollPane3.setViewportView(ta_show_article);

        tf_article_name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        btn_submit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Enter your Article Name : ");

        ta_edit_article.setColumns(20);
        ta_edit_article.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ta_edit_article.setRows(5);
        jScrollPane1.setViewportView(ta_edit_article);

        btn_update.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_update))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_article_name, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_submit)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_article_name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        proformwiki pfw = new proformwiki();
        switch (pfw.check1) {
            case "Art":
                dip = "Art";
                pfw.Show = "Articles\\art\\manager\\manager_comm\\";
                really_show = "Articles\\art\\really_show";
                break;
            case "Sports":
                dip = "Sport";
                pfw.Show = "Articles\\sport\\manager\\manager_comm\\";
                really_show = "Articles\\sport\\really_show";
                break;
            case "Maths":
                dip = "Maths";
                pfw.Show = "Articles\\maths\\manager\\manager_comm\\";
                really_show = "Articles\\maths\\really_show";
                break;
            case "Biology":
                dip = "Biology";
                pfw.Show = "Articles\\biology\\manager\\manager_comm\\";
                really_show = "Articles\\biology\\really_show";
                break;
            case "Physics":
                dip = "Physics";
                pfw.Show = "Articles\\physics\\manager\\manager_comm\\";
                really_show = "Articles\\physics\\really_show";
                break;
            case "Chemistry":
                dip = "Chemistry";
                pfw.Show = "Articles\\chemistry\\manager\\manager_comm\\";
                really_show = "Articles\\chemistry\\really_show";
                break;
            case "Philosophy":
                dip = "Philosophy";
                pfw.Show = "Articles\\philosophy\\manager\\manager_comm\\";
                really_show = "Articles\\philosophy\\really_show";
                break;
            case "Politics":
                dip = "Politics";
                pfw.Show = "Articles\\politics\\manager\\manager_comm\\";
                really_show = "Articles\\politics\\really_show";
                break;
            case "Economy":
                dip = "Economy";
                pfw.Show = "Articles\\economy\\manager\\manager_comm\\";
                really_show = "Articles\\economy\\really_show";
                break;
        }
        proform pf = new proform();
        pf.us.setArticle_Name(tf_article_name.getText());
        ta_show_article.setText(pf.us.see_manager_comm(pfw.Show));
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        //proformwiki pfw = new proformwiki();
        proform pf = new proform();
        Article ar = new Article();
        ar.setArticle_Content(ta_edit_article.getText());
        ar.setArticle_Name(dip + "~" + pf.us.getEmail() + "~" + tf_article_name.getText());
        ar.add(pf.us, "Articles\\Admin\\", "Articles\\Admin\\");
        ta_edit_article.setText("");
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new proformwiki().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(proformcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proformcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proformcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proformcm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proformcm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea ta_edit_article;
    private javax.swing.JTextArea ta_show_article;
    private javax.swing.JTextField tf_article_name;
    // End of variables declaration//GEN-END:variables
}
