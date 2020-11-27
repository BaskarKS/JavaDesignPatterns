package com.baskarks.design.patterns.structural.bridge.mosh.problem;

public class SonyRemoteControl extends RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Sony: Turn-On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn-Off");
    }
}
