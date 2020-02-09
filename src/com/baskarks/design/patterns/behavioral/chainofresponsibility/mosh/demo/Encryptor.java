package com.baskarks.design.patterns.behavioral.chainofresponsibility.mosh.demo;

public class Encryptor extends Handler {
  public Encryptor(Handler next) {
    super(next);
  }

  @Override
  public boolean doHandle(HttpRequest request) {
    System.out.println("Encryption");
    return false;
  }
}
