package com.baskarks.design.patterns.structural.bridge.mosh.problem;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl{

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: Set-Channel : " + number);
    }

    @Override
    public void turnOn() {
        System.out.println("Sony: Turn-On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn-Off");
    }
}
