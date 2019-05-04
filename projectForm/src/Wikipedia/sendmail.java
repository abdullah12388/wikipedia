package Wikipedia;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author omar
 */
public class sendmail {

    public sendmail(String to, String sub, String msg, String pass, String user) {
        Properties prop = new Properties();
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", true);
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");

        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(user, pass);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);

            Transport.send(message);
            System.out.println("MAssage Sent");
        } catch (Exception e) {
            System.out.println(e);

        }

    }

}
