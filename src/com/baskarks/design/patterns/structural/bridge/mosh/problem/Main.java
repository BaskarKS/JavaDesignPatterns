package com.baskarks.design.patterns.structural.bridge.mosh.problem;

public class Main {
    public static void main(String[] args) {
        RemoteControl normalRemote = new SamsungAdvancedRemoteControl();
        System.out.println(SamsungAdvancedRemoteControl.class.isInstance(normalRemote));
        AdvancedRemoteControl advancedRemote = (AdvancedRemoteControl) normalRemote;
        normalRemote.turnOn();
        normalRemote.turnOff();
        System.out.println();
        advancedRemote.turnOn();
        advancedRemote.turnOff();
        advancedRemote.setChannel(10);
    }
}
