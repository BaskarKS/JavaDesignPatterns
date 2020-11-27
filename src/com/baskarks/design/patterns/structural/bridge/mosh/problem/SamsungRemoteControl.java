package com.baskarks.design.patterns.structural.bridge.mosh.problem;

public class SamsungRemoteControl extends RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Samsung: Turn-On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: Turn-Off");
    }
}
