package com.baskarks.design.patterns.structural.composite;

public class Truck implements Deployable {
  @Override
  public void deploy() {
    System.out.println("Deploying a truck");
  }
}
