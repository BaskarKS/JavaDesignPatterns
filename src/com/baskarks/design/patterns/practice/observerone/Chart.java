package com.baskarks.design.patterns.practice.observerone;

import com.baskarks.design.patterns.behavioral.observer.Observer;

public class Chart implements PushObserver {
    @Override
    public void update(int value) {
        System.out.println("Chart is updated with Value : " + value);
    }
}
