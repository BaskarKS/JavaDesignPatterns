package com.baskarks.design.patterns.structural.adapter;

import com.baskarks.design.patterns.structural.adapter.Gmail.GmailClient;

public class Demo {
    public static void main(String[] args) {
        var mailClient = new EmailClient();
        mailClient.addProvider(new EmailProvider() {
            @Override
            public void downloadEmails() {
                System.out.println("Get Outlook Mails");
            }
        });
        mailClient.downloadEmails();
        mailClient.addProvider(new GmailAdapter(new GmailClient()));
        mailClient.downloadEmails();
    }
}
