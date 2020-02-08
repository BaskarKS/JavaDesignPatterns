package com.baskarks.design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    List<EventListener> eventListeners = new ArrayList<>();

    public void addListener(EventListener event) {
        eventListeners.add(event);
    }

    public void notifyListeners() {
        for (var listener : eventListeners)
            listener.updateEvents();
    }
}
