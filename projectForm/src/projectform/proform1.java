
package projectform;

public class proform1 extends javax.swing.JFrame {

    
    public proform1() {
        initComponents();
        this.setSize(400,300);
        lbl.setSize(400,300);
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sign_in = new javax.swing.JButton();
        btn_sign_up = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btn_sign_in.setBackground(new java.awt.Color(51, 51, 51));
        btn_sign_in.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_sign_in.setForeground(new java.awt.Color(255, 255, 255));
        btn_sign_in.setText("Sign In");
        btn_sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sign_inActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sign_in);
        btn_sign_in.setBounds(249, 30, 130, 80);

        btn_sign_up.setBackground(new java.awt.Color(51, 51, 51));
        btn_sign_up.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_sign_up.setForeground(new java.awt.Color(255, 255, 255));
        btn_sign_up.setText("Sign Up");
        btn_sign_up.setPreferredSize(new java.awt.Dimension(99, 37));
        btn_sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sign_upActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sign_up);
        btn_sign_up.setBounds(250, 140, 130, 80);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectform/Wikipedia-Logo-Black.jpg"))); // NOI18N
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sign_inActionPerformed
        // TODO add your handling code here:
        new proform().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sign_inActionPerformed

    private void btn_sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sign_upActionPerformed
        // TODO add your handling code here:
        new proform2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_sign_upActionPerformed

    
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
            java.util.logging.Logger.getLogger(proform1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proform1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proform1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proform1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proform1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sign_in;
    private javax.swing.JButton btn_sign_up;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}
