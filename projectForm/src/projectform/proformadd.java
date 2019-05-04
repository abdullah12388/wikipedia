package projectform;

import Wikipedia.*;

public class proformadd extends javax.swing.JFrame {

    public proformadd() {
        initComponents();
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
    }

    public static String New = "";
    public static String Show = "";
    proformwiki pfw = new proformwiki();
    proform pf = new proform();
    Article ar = new Article();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_article_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_add_article = new javax.swing.JTextArea();
        btn_add_article = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add Articles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 48))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Article Name : ");

        tf_article_name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        ta_add_article.setColumns(20);
        ta_add_article.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ta_add_article.setLineWrap(true);
        ta_add_article.setRows(5);
        ta_add_article.setText("    ");
        ta_add_article.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta_add_article);

        btn_add_article.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_add_article.setText("Add");
        btn_add_article.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_articleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(tf_article_name, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add_article, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_article_name)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add_article, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn_add_articleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_articleActionPerformed
        // TODO add your handling code here:
        ar.setArticle_Name(tf_article_name.getText());
        ar.setArticle_Content(ta_add_article.getText());
        switch (pfw.check1) {
            case "Art":
                New = "Articles\\art\\manager\\manager_new\\";
                Show = "Articles\\art\\really_show";
                break;
            case "Sports":
                New = "Articles\\sport\\manager\\manager_new\\";
                Show = "Articles\\sport\\really_show";
                break;
            case "Maths":
                New = "Articles\\maths\\manager\\manager_new\\";
                Show = "Articles\\maths\\really_show";
                break;
            case "Biology":
                New = "Articles\\biology\\manager\\manager_new\\";
                Show = "Articles\\biology\\really_show";
                break;
            case "Physics":
                New = "Articles\\physics\\manager\\manager_new\\";
                Show = "Articles\\physics\\really_show";
                break;
            case "Chemistry":
                New = "Articles\\chemistry\\manager\\manager_new\\";
                Show = "Articles\\chemistry\\really_show";
                break;
            case "Philosophy":
                New = "Articles\\philosophy\\manager\\manager_new\\";
                Show = "Articles\\philosophy\\really_show";
                break;
            case "Politics":
                New = "Articles\\politics\\manager\\manager_new\\";
                Show = "Articles\\politics\\really_show";
                break;
            case "Economy":
                New = "Articles\\economy\\manager\\manager_new\\";
                Show = "Articles\\economy\\really_show";
                break;
            default :
                break;
        }
        ar.add(pf.us, New, Show);
        pfw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_add_articleActionPerformed

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
            java.util.logging.Logger.getLogger(proformadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proformadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proformadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proformadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proformadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_article;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_add_article;
    private javax.swing.JTextField tf_article_name;
    // End of variables declaration//GEN-END:variables
}
