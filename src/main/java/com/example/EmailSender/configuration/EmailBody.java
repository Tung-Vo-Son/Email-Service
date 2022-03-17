package com.example.EmailSender.configuration;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmailBody {
    private Email from;
    private List<Email> to;
    private String content;
    private String subject;
//    private List<Attachment> attachments;
    private List<Email> cc;
}
