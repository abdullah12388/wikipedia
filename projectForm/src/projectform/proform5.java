
package projectform;

import Wikipedia.*;


public class proform5 extends javax.swing.JFrame {

    
    public proform5() {
        initComponents();
        this.setSize(620,329);
        lbl.setSize(620,329);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        tf_gift_name = new javax.swing.JTextField();
        tf_gift_number = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gift Card Number:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 158, 182, 50);

        tf_gift_name.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        tf_gift_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_gift_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_gift_nameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_gift_name);
        tf_gift_name.setBounds(247, 96, 300, 40);

        tf_gift_number.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        tf_gift_number.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_gift_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_gift_numberActionPerformed(evt);
            }
        });
        getContentPane().add(tf_gift_number);
        tf_gift_number.setBounds(247, 164, 300, 40);

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(250, 230, 100, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter The Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(134, 13, 348, 42);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gift Card Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 90, 160, 50);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectform/creditbackground.jpg"))); // NOI18N
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 620, 329);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_gift_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_gift_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_gift_nameActionPerformed

    private void tf_gift_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_gift_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_gift_numberActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        payment p = new payment();
        p.setCheck_f_p("premium");
        p.setCheck_C_G("gift");
        p.setGift_Card_Name(tf_gift_name.getText());
        p.setGift_Card_Number(tf_gift_number.getText());
        p.Check_Free_premium();
        this.dispose();
    }//GEN-LAST:event_submitActionPerformed

    
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
            java.util.logging.Logger.getLogger(proform5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proform5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proform5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proform5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proform5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tf_gift_name;
    private javax.swing.JTextField tf_gift_number;
    // End of variables declaration//GEN-END:variables
}
