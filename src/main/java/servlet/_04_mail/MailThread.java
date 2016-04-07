package servlet._04_mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailThread extends Thread {
    private MimeMessage message;
    private String sendToEmail;
    private String mailSubject;
    private String mailText;
    private Properties properties;

    public MailThread(String sendToEmail, String mailSubject, String mailText, Properties properties) {
        this.sendToEmail = sendToEmail;
        this.mailSubject = mailSubject;
        this.mailText = mailText;
        this.properties = properties;
    }

    private void init() {
        // mail session object
        Session mailSession = (new SessionCreator(properties)).createSession();
        mailSession.setDebug(true);

        // creation of mail message object
        message = new MimeMessage(mailSession);
        try {
            // loading parameters into mail message object
            message.setSubject(mailSubject);
            message.setContent(mailText, "text/html");
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(sendToEmail));
        } catch (AddressException e) {
            System.err.println("Incorrect address: " + sendToEmail + " " + e);
            // in log file
        } catch (MessagingException e) {
            System.err.println("Message format error. " + e);
            // in log file
        }
    }

    @Override
    public void run() {
        init();
        try {
            // send message
            Transport.send(message);
        } catch (MessagingException e) {
            System.err.println("Error sending message. " + e);
            // in log file
        }
    }
}
