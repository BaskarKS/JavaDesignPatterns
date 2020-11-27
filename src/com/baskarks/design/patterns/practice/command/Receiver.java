package com.baskarks.design.patterns.practice.command;

public class Receiver {
    public void downloadData(String URL) {
        System.out.println("Downloading Data From URL : " + URL);
    }
}
