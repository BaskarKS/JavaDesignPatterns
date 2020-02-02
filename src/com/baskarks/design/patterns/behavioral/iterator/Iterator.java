package com.baskarks.design.patterns.behavioral.iterator;

public interface Iterator {
    boolean hasNext();
    Product current();
    void next();
}
