
package projectform;

import Wikipedia.payment;



public class proform3 extends javax.swing.JFrame {

    
    public proform3() {
        initComponents();
        this.setSize(435,300);
        lbl.setSize(435,300);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_gift = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_credit = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btn_gift.setBackground(new java.awt.Color(0, 0, 0));
        btn_gift.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_gift.setForeground(new java.awt.Color(255, 255, 255));
        btn_gift.setText("Gift");
        btn_gift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giftActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gift);
        btn_gift.setBounds(250, 100, 130, 120);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("choose the payment:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 309, 42);

        btn_credit.setBackground(new java.awt.Color(0, 0, 0));
        btn_credit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_credit.setForeground(new java.awt.Color(255, 255, 255));
        btn_credit.setText("Credit");
        btn_credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditActionPerformed(evt);
            }
        });
        getContentPane().add(btn_credit);
        btn_credit.setBounds(60, 100, 130, 120);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectform/paybackground.jpg"))); // NOI18N
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 435, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_giftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giftActionPerformed
        // TODO add your handling code here:
        new proform5().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_giftActionPerformed

    private void btn_creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditActionPerformed
        // TODO add your handling code here:
        new proform4().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_creditActionPerformed

    
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
            java.util.logging.Logger.getLogger(proform3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proform3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proform3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proform3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proform3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_credit;
    private javax.swing.JButton btn_gift;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}
