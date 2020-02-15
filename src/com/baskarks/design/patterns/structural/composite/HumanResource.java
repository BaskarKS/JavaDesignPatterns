package com.baskarks.design.patterns.structural.composite;

public class HumanResource implements Deployable {
  @Override
  public void deploy() {
    System.out.println("Deploying a human resource");
  }
}
