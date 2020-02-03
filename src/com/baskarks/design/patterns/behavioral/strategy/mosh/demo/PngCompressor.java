package com.baskarks.design.patterns.behavioral.strategy.mosh.demo;

public class PngCompressor implements Compressor {
  @Override
  public void compress(String fileName) {
    System.out.println("Compressing using PNG");
  }
}
