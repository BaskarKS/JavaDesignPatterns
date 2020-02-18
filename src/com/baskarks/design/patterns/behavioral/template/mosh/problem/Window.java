package com.baskarks.design.patterns.behavioral.template.mosh.problem;

public class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.

        System.out.println("Removing the window from the screen");

        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }
}
