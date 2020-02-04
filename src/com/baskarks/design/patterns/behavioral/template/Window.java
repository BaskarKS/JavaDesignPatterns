package com.baskarks.design.patterns.behavioral.template;

public class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        onClosing();
        System.out.println("Removing the window from the screen");
        onClosed();
        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }
    protected void onClosing() {}
    protected void onClosed() {}
}
