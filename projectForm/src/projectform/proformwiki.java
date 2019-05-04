package projectform;

import java.io.*;
import Wikipedia.*;
import java.util.*;
import javax.mail.*;
import javax.swing.*;

public class proformwiki extends javax.swing.JFrame {

    public proformwiki() {
        initComponents();
        this.setSize(1280, 726);
        this.setLocationRelativeTo(null);
    }
    
    Article ar = new Article();
    search sr = new search();
    public static String Show = "";
    public static String check1 = "";
    user us = new user();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_art = new javax.swing.JButton();
        btn_sports = new javax.swing.JButton();
        btn_maths = new javax.swing.JButton();
        btn_biology = new javax.swing.JButton();
        btn_physics = new javax.swing.JButton();
        btn_chemistry = new javax.swing.JButton();
        btn_philosophy = new javax.swing.JButton();
        btn_politics = new javax.swing.JButton();
        btn_economy = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_department_name = new javax.swing.JLabel();
        btn_add_article = new javax.swing.JButton();
        btn_show_article = new javax.swing.JButton();
        btn_manager_comment = new javax.swing.JButton();
        btn_admin_respond = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Pass = new javax.swing.JTextField();
        sub = new javax.swing.JTextField();
        Tomail = new javax.swing.JTextField();
        yourmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Massagearea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        mailre = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        sendingbutton = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_chat = new javax.swing.JButton();
        btn_sign_out = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wikipedia Home");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Choose a Depratment :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(3, 0));

        btn_art.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_art.setText("Art");
        btn_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_artActionPerformed(evt);
            }
        });
        jPanel7.add(btn_art);

        btn_sports.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_sports.setText("Sports");
        btn_sports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sportsActionPerformed(evt);
            }
        });
        jPanel7.add(btn_sports);

        btn_maths.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_maths.setText("Maths");
        btn_maths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mathsActionPerformed(evt);
            }
        });
        jPanel7.add(btn_maths);

        btn_biology.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_biology.setText("Biology");
        btn_biology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_biologyActionPerformed(evt);
            }
        });
        jPanel7.add(btn_biology);

        btn_physics.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_physics.setText("Physics");
        btn_physics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_physicsActionPerformed(evt);
            }
        });
        jPanel7.add(btn_physics);

        btn_chemistry.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_chemistry.setText("Chemistry");
        btn_chemistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chemistryActionPerformed(evt);
            }
        });
        jPanel7.add(btn_chemistry);

        btn_philosophy.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_philosophy.setText("Philosophy");
        btn_philosophy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_philosophyActionPerformed(evt);
            }
        });
        jPanel7.add(btn_philosophy);

        btn_politics.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_politics.setText("Politics");
        btn_politics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_politicsActionPerformed(evt);
            }
        });
        jPanel7.add(btn_politics);

        btn_economy.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btn_economy.setText("Economy");
        btn_economy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_economyActionPerformed(evt);
            }
        });
        jPanel7.add(btn_economy);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Depatment Properties :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(6, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("You Choosed :");
        jPanel1.add(jLabel2);

        lbl_department_name.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_department_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_department_name.setText("No department selected");
        jPanel1.add(lbl_department_name);

        btn_add_article.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_add_article.setText("Add Article");
        btn_add_article.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_articleActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add_article);

        btn_show_article.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_show_article.setText("Show Articles");
        btn_show_article.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_show_articleActionPerformed(evt);
            }
        });
        jPanel1.add(btn_show_article);

        btn_manager_comment.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_manager_comment.setText("Manager Comment");
        btn_manager_comment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manager_commentActionPerformed(evt);
            }
        });
        jPanel1.add(btn_manager_comment);

        btn_admin_respond.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_admin_respond.setText("Admin Respond");
        btn_admin_respond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_respondActionPerformed(evt);
            }
        });
        jPanel1.add(btn_admin_respond);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Mail", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("To            :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("From       :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Subject    :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Password :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Massage :");

        Pass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        sub.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sub.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        Tomail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tomail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomailActionPerformed(evt);
            }
        });

        yourmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        yourmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourmailActionPerformed(evt);
            }
        });

        Massagearea.setColumns(20);
        Massagearea.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Massagearea.setRows(5);
        jScrollPane1.setViewportView(Massagearea);

        mailre.setEditable(false);
        mailre.setColumns(20);
        mailre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mailre.setRows(5);
        jScrollPane2.setViewportView(mailre);
        mailre.setEditable(false);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton9.setText("Show");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        sendingbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sendingbutton.setText("Send");
        sendingbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sendingbuttonMouseReleased(evt);
            }
        });
        sendingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendingbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sub)
                            .addComponent(Pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yourmail)
                            .addComponent(Tomail))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(sendingbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Tomail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(yourmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(sendingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_chat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_chat.setText("Chat");
        btn_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chatActionPerformed(evt);
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
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_update)
                        .addGap(378, 378, 378)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sign_out)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_update)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_chat)
                            .addComponent(btn_sign_out))))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_artActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Art Departmant");
        check1 = "Art";
    }//GEN-LAST:event_btn_artActionPerformed

    private void btn_sportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sportsActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Sportrs Departmant");
        check1 = "Sports";
    }//GEN-LAST:event_btn_sportsActionPerformed

    private void btn_mathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mathsActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Maths Departmant");
        check1 = "Maths";
    }//GEN-LAST:event_btn_mathsActionPerformed

    private void btn_biologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_biologyActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Biology Departmant");
        check1 = "Biology";
    }//GEN-LAST:event_btn_biologyActionPerformed

    private void btn_physicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_physicsActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Physics Departmant");
        check1 = "Physics";
    }//GEN-LAST:event_btn_physicsActionPerformed

    private void btn_chemistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chemistryActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Chemistry Departmant");
        check1 = "Chemistry";
    }//GEN-LAST:event_btn_chemistryActionPerformed

    private void btn_philosophyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_philosophyActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Philosophy Departmant");
        check1 = "Philosophy";
    }//GEN-LAST:event_btn_philosophyActionPerformed

    private void btn_politicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_politicsActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Politics Departmant");
        check1 = "Politics";
    }//GEN-LAST:event_btn_politicsActionPerformed

    private void btn_economyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_economyActionPerformed
        // TODO add your handling code here:
        lbl_department_name.setText("Economy Departmant");
        check1 = "Economy";
    }//GEN-LAST:event_btn_economyActionPerformed

    private void btn_add_articleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_articleActionPerformed
        // TODO add your handling code here:
        new proformadd().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_add_articleActionPerformed

    @SuppressWarnings("empty-statement")
    private void btn_show_articleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_show_articleActionPerformed
        // TODO add your handling code here:
        new proformshow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_show_articleActionPerformed

    private void TomailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TomailActionPerformed

    private void yourmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yourmailActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.mailre.setEditable(false);
        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("imap.gmail.com", yourmail.getText(), Pass.getText());
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);
            for (int i = 0, n = messages.length; i < n; i++) {
                Message message = messages[i];
                mailre.append("----------------------" + "\n" + "Email Number " + (i + 1) + "\n" + "Subject: " + message.getSubject()
                        + "\n" + "From: " + message.getFrom()[0] + "\n" + "Text: " + message.getContent().toString() + "\n" + "-----------------------");
            }
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (MessagingException e) {
            e.printStackTrace();
            System.exit(2);
        } catch (Exception e) {
            System.exit(3);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void sendingbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendingbuttonMouseReleased

    }//GEN-LAST:event_sendingbuttonMouseReleased

    private void sendingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendingbuttonActionPerformed
        // TODO add your handling code here:
        sendmail s = new sendmail(Tomail.getText(), sub.getText(), Massagearea.getText(), Pass.getText(), yourmail.getText());

    }//GEN-LAST:event_sendingbuttonActionPerformed

    private void btn_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chatActionPerformed
        // TODO add your handling code here:
        try {
            ProcessBuilder p = new ProcessBuilder("ClinetChat 1.2\\ClinetChat");
            p.start();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }

    }//GEN-LAST:event_btn_chatActionPerformed

    private void btn_manager_commentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manager_commentActionPerformed
        // TODO add your handling code here:
        new proformcm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_manager_commentActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        new proformupdateuser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_admin_respondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_respondActionPerformed
        // TODO add your handling code here:
        
        proform pf = new proform();
        proformadminrespond pfar = new proformadminrespond();
        sr.setFolderPath("Articles\\Admin\\Admin_comment\\");
        boolean b = sr.FolderSearch(pf.us.getEmail()+".txt");
        if(b==true)
        {
            pfar.ta_respond.setText(ar.ShowContant("Articles\\Admin\\Admin_comment\\", pf.us.getEmail()+".txt"));
            pfar.setVisible(true);
            this.dispose();
        }else
            JOptionPane.showMessageDialog(null,"you don't have any articles here");
        
        
        
    }//GEN-LAST:event_btn_admin_respondActionPerformed

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
            java.util.logging.Logger.getLogger(proformwiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proformwiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proformwiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proformwiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proformwiki().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Massagearea;
    private javax.swing.JTextField Pass;
    private javax.swing.JTextField Tomail;
    private javax.swing.JButton btn_add_article;
    private javax.swing.JButton btn_admin_respond;
    private javax.swing.JButton btn_art;
    private javax.swing.JButton btn_biology;
    private javax.swing.JButton btn_chat;
    private javax.swing.JButton btn_chemistry;
    private javax.swing.JButton btn_economy;
    private javax.swing.JButton btn_manager_comment;
    private javax.swing.JButton btn_maths;
    private javax.swing.JButton btn_philosophy;
    private javax.swing.JButton btn_physics;
    private javax.swing.JButton btn_politics;
    private javax.swing.JButton btn_show_article;
    private javax.swing.JButton btn_sign_out;
    private javax.swing.JButton btn_sports;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_department_name;
    private static javax.swing.JTextArea mailre;
    private javax.swing.JButton sendingbutton;
    private javax.swing.JTextField sub;
    private javax.swing.JTextField yourmail;
    // End of variables declaration//GEN-END:variables
}
