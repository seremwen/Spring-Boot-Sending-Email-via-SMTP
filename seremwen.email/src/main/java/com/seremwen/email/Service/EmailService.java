package com.seremwen.email.Service;

public interface EmailService {

    // Method
    // To send a simple email
    String sendSimpleMail(src.main.java.com.seremwen.email.Entity.EmailDetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(src.main.java.com.seremwen.email.Entity.EmailDetails details);
}