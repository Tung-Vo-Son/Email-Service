package com.example.EmailSender.controller;

import com.example.EmailSender.configuration.EmailBody;
import com.example.EmailSender.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class EmailController {

    @Autowired
    private EmailServiceImpl emailService;


    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody EmailBody emailBody){
        emailService.sendEmail(emailBody);
        return "Sent";
    }

    @GetMapping("/sendEmailWithAttachment")
    public String sendEmailWithAttachment() throws MessagingException {
        return "Sent email with attachment";
    }
}
