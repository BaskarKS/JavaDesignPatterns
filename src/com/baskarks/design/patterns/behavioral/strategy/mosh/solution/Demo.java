package com.baskarks.design.patterns.behavioral.strategy.mosh.solution;

public class Demo {
    public static void show() {
        var client = new ChatClient(new DES());
        client.send("Hello World");
    }
}
