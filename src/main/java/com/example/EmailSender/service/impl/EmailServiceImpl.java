package com.example.EmailSender.service.impl;


import com.example.EmailSender.configuration.Email;
import com.example.EmailSender.configuration.EmailBody;
import com.example.EmailSender.service.EmailSendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailServiceImpl implements EmailSendingService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public String sendEmail(EmailBody emailBody) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailBody.getFrom().getEmail());
        for(Email emailReceiver : emailBody.getTo()){
            message.setTo(emailReceiver.getEmail());
        }
        if(emailBody.getCc() == null || emailBody.getCc().isEmpty()){
            for(Email emailCc : emailBody.getCc()){
                message.setCc(emailCc.getEmail());
            }
        }
        message.setSubject(emailBody.getSubject());
        message.setText(emailBody.getContent());

        mailSender.send(message);
        return "Sending message";
    }
}
