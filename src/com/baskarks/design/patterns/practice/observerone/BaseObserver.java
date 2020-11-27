package com.baskarks.design.patterns.practice.observerone;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseObserver {
    private List<PushObserver> spreadDataObservers;
    public BaseObserver() {
        spreadDataObservers = new ArrayList<>();
    }
    public void addSpreadDataObserver(PushObserver observer) {
        spreadDataObservers.add(observer);
    }

    public void removeSpreadDataObserver(PushObserver observer) {
        spreadDataObservers.remove(observer);
    }

    public void notifySpreadDataObserver(int value) {
        for (PushObserver observer : spreadDataObservers)
            observer.update(value);
    }
}
