package com.baskarks.design.patterns.structural.adapter.mosh.solution;


import com.baskarks.design.patterns.structural.adapter.mosh.solution.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
  private GmailClient client = new GmailClient();

  @Override
  public void downloadEmails() {
    client.connect();
    client.getEmails();
    client.disconnect();
  }
}
