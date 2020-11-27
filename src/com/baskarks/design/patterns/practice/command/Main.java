package com.baskarks.design.patterns.practice.command;

public class Main {
    public static void main(String[] args) {
        ButtonInvoker button = new ButtonInvoker("Download Button");
        Command commandOne = new ConcreteDownloadCommand(new Receiver(), "http://www.wikipedia.com");
        Command commandTwo = new ConcreteDownloadCommand(new Receiver(), "http://www.google.com");
        button.OnClick(commandOne);
        button.OnClick(commandTwo);
    }
}
