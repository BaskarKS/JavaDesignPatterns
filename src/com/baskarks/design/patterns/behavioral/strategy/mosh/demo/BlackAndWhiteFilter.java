package com.baskarks.design.patterns.behavioral.strategy.mosh.demo;

public class BlackAndWhiteFilter implements Filter {
  @Override
  public void apply(String fileName) {
    System.out.println("Applying B&W filter");
  }
}
