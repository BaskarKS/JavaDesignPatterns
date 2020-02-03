package com.baskarks.design.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        var chatClient = new ChatClient(new DesEncryptionAlgorithm());
        chatClient.send("Hai");
        var diffClient = new ChatClient(new AesEncryptionAlgorithm());
        diffClient.send("Bye");

    }
}
