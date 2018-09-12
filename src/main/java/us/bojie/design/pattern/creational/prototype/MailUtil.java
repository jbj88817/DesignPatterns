package us.bojie.design.pattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "To {0}, mail address: {1}, Content: {2}";
        System.out.println(MessageFormat.format(outputContent, mail.getName(),
                mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("Saving OriginMail, originMail: " + mail.getContent());
    }
}
