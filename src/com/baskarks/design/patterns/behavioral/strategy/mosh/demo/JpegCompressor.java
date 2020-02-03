package com.baskarks.design.patterns.behavioral.strategy.mosh.demo;

public class JpegCompressor implements Compressor {
  @Override
  public void compress(String fileName) {
    System.out.println("Compressing using JPEG");
  }
}
