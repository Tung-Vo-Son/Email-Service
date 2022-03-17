package com.example.EmailSender.controller;

import com.example.EmailSender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/sendEmail")
    public String sendEmail(){
        emailService.sendSimpleEmail("silverbinary47@gmail.com", "Hello", "This is the subject");
        return "Sent";
    }

    @GetMapping("/sendEmailWithAttachment")
    public String sendEmailWithAttachment() throws MessagingException {
        String attachmentPath = "C:\\Users\\Admin\\Desktop\\vladislav-ociacia-v-51.png";
        emailService.SendEmailWithAttachment("silverbinary47@gmail.com", "Hello", "This is the subject", attachmentPath);
        return "Sent email";
    }
}
