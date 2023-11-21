package org.pro.mailx;

import javax.mail.MessagingException;

public class SendMailClass {
    public static String server="smtp.gmail.com";
    public static String from = "shibaramroutsqa@gmail.com";
    public static String password = "ONLINEgl$9731931298";
    public static String[] to ={"email2srout@gmail.com","info.shibaram@gmail.com"};
    public static String subject = "Test Report";

    public static String messageBody ="TestMessage";
    public static String attachmentPath="D:\\MY_PROJECTS\\Selenium_Repository\\SeleniumTest\\EXReport\\extent.html";
    public static String attachmentName="extent.html";
    public static void main(String[] args) throws MessagingException {
        MonitoringMail mail = new MonitoringMail();
        mail.sendMail(server,from,to,subject,messageBody,attachmentPath,attachmentName);
    }
}
