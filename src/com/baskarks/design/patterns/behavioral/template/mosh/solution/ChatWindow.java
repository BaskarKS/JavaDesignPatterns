package com.baskarks.design.patterns.behavioral.template.mosh.solution;

public class ChatWindow extends Window {
    @Override
    protected void onClosed() {
        System.out.println("Disconnecting from the server...");
    }
}
