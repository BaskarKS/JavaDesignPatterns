package com.baskarks.design.patterns.structural.bridge.mosh.problem;

public class SamsungAdvancedRemoteControl extends AdvancedRemoteControl{

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung: Set-Channel : " + number);
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung: Turn-On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: Turn-Off");
    }
}
