
package projectform;


public class proform0 extends javax.swing.JFrame {

    
    public proform0() {
        initComponents();
        this.setSize(1024,768);
        lbl.setSize(1024,768);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin = new javax.swing.JButton();
        manager = new javax.swing.JButton();
        user = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1024, 768));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        admin.setBackground(new java.awt.Color(0, 0, 0));
        admin.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        admin.setForeground(new java.awt.Color(204, 204, 204));
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin);
        admin.setBounds(740, 110, 240, 160);

        manager.setBackground(new java.awt.Color(0, 0, 0));
        manager.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        manager.setForeground(new java.awt.Color(204, 204, 204));
        manager.setText("Manager");
        manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerActionPerformed(evt);
            }
        });
        getContentPane().add(manager);
        manager.setBounds(740, 310, 240, 160);

        user.setBackground(new java.awt.Color(0, 0, 0));
        user.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        user.setForeground(new java.awt.Color(204, 204, 204));
        user.setText("User");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(740, 510, 240, 160);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectform/wikipedia-logo-wallpaper copy.png"))); // NOI18N
        lbl.setAutoscrolls(true);
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 1024, 768);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        proform pf = new proform();
        pf.check = "admin";
        pf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void managerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerActionPerformed
        // TODO add your handling code here:
        proform pf = new proform();
        pf.check = "manager";
        new proform().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_managerActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        proform pf = new proform();
        pf.check = "user";
        new proform1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userActionPerformed

    
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
            java.util.logging.Logger.getLogger(proform0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proform0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proform0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proform0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proform0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel lbl;
    private javax.swing.JButton manager;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
