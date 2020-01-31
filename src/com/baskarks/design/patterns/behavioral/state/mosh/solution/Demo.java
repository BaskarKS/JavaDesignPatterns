package com.baskarks.design.patterns.behavioral.state.mosh.solution;

public class Demo {
    public static void show() {
        var service = new DirectionService(new Walking());
        service.getEta();
        service.getDirection();
    }
}
