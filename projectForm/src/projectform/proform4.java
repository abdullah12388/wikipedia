
package projectform;

import Wikipedia.*;


public class proform4 extends javax.swing.JFrame {

    
    public proform4() {
        initComponents();
        this.setSize(620,329);
        lbl.setSize(620,329);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        tf_credit_number = new javax.swing.JTextField();
        tf_credit_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Credit Card Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 90, 190, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter The Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(134, 13, 348, 42);

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

        tf_credit_number.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        tf_credit_number.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_credit_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_credit_numberActionPerformed(evt);
            }
        });
        getContentPane().add(tf_credit_number);
        tf_credit_number.setBounds(247, 164, 300, 40);

        tf_credit_name.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        tf_credit_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_credit_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_credit_nameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_credit_name);
        tf_credit_name.setBounds(247, 96, 300, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Credit Card Number:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 158, 210, 50);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectform/creditbackground.jpg"))); // NOI18N
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 620, 329);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        payment p = new payment();
        p.setCheck_f_p("premium");
        p.setCheck_C_G("credit");
        p.setCridit_Name(tf_credit_name.getText());
        p.setCridit_Number(tf_credit_number.getText());
        p.Check_Free_premium();
        this.dispose();
    }//GEN-LAST:event_submitActionPerformed

    private void tf_credit_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_credit_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_credit_numberActionPerformed

    private void tf_credit_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_credit_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_credit_nameActionPerformed

    
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
            java.util.logging.Logger.getLogger(proform4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proform4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proform4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proform4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proform4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tf_credit_name;
    private javax.swing.JTextField tf_credit_number;
    // End of variables declaration//GEN-END:variables
}
