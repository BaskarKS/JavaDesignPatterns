package com.baskarks.design.patterns.practice.observerone;

public class SpreadSheet implements PushObserver{
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet is updated with Value : " + value);
    }
}
