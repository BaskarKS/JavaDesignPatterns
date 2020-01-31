package com.baskarks.design.patterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        var directionService = new DirectionService();
        directionService.setTravelMode(new DrivingMode());
        directionService.getDirection();
        directionService.getEta();

        System.out.println();
        directionService.setTravelMode(new BicyclingMode());
        directionService.getDirection();
        directionService.getEta();

        System.out.println();
        directionService.setTravelMode(new TransitMode());
        directionService.getDirection();
        directionService.getEta();

        System.out.println();
        directionService.setTravelMode(new WalkingMode());
        directionService.getDirection();
        directionService.getEta();

    }
}
