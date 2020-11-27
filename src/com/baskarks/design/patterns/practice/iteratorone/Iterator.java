package com.baskarks.design.patterns.practice.iteratorone;

public interface Iterator<T> {
    public boolean hasNext();
    public void next();
    public T getNext();
}
