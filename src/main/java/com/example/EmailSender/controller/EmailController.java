package com.example.EmailSender.controller;

import com.example.EmailSender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/sendEmail")
    public String sendEmail(){
        emailService.sendEmail("silverbinary47@gmail.com", "Hello", "This is the subject");
        return "Sent";
    }
}
