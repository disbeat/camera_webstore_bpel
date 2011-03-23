package is.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.NamingException;

import org.jboss.logging.Logger;

public class Mailer {
 
	public void sendMail(String to, String subject, String body)
	throws MessagingException, NamingException {
		Properties props = System.getProperties();
		props.put("mail.smtp.host", "smtp.dei.uc.pt");
		
		Session mailSession = Session.getDefaultInstance(props, null);
		
		MimeMessage message = new MimeMessage(mailSession);
		message.setSubject(subject);
		message.setFrom(new InternetAddress("msimoes@student.dei.uc.pt"));
		message.setRecipients(javax.mail.Message.RecipientType.TO,
				InternetAddress.parse(to, false));
		message.setText(body);
		message.setHeader("X-Mailer", "LPCO");
		message.setSentDate(new Date());
		message.saveChanges();
 
		Transport.send(message);
		Logger.getLogger(this.getClass()).warn("Message sent");
	}
	
	public static void main(String []args) throws MessagingException, NamingException{
		Mailer mail = new Mailer();
		
		mail.sendMail("disbeat@gmail.com", "teste", "test");
	}
}
