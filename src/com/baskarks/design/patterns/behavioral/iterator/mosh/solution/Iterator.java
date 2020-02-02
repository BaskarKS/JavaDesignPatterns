package com.baskarks.design.patterns.behavioral.iterator.mosh.solution;

public interface Iterator {
  boolean hasNext();
  Product current();
  void next();
}
