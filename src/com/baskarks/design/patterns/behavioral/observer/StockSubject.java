package com.baskarks.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockSubject {
    List<Observer> stockObservers = new ArrayList<>();

    public void attachObserver(Observer observer) {
        stockObservers.add(observer);
    }

    public void detachObserver(Observer observer) {
        stockObservers.remove(observer);
    }

    public void notifyObserver() {
        for (var observer : stockObservers) {
            observer.update();
        }
    }
}
