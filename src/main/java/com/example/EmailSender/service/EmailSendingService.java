package com.example.EmailSender.service;

import com.example.EmailSender.configuration.Email;
import com.example.EmailSender.configuration.EmailBody;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.List;

public interface EmailSendingService {
    String sendEmail(EmailBody body);
}
