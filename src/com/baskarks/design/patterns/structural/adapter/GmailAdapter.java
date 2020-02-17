package com.baskarks.design.patterns.structural.adapter;

import com.baskarks.design.patterns.structural.adapter.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient;
    public GmailAdapter(GmailClient client) {
        gmailClient = client;
    }
    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
