package com.baskarks.design.patterns.structural.adapter.mosh.solution;

public class Demo {
  public static void show() {
    var client = new EmailClient();
    client.addProvider(new GmailAdapter());
    client.downloadEmails();
  }
}
