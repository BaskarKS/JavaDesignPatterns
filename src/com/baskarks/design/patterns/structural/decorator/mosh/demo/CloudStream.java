package com.baskarks.design.patterns.structural.decorator.mosh.demo;

public class CloudStream implements Stream {
  public void write(String data) {
    System.out.println("Storing " + data);
  }
}
