package com.baskarks.design.patterns.structural.adapter.mosh.demo;

public class VividFilter implements Filter {
  @Override
  public void apply(Image image) {
    System.out.println("Applying Vivid Filter");
  }
}
