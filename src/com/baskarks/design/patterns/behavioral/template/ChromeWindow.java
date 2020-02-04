package com.baskarks.design.patterns.behavioral.template;

public class ChromeWindow extends Window {
    @Override
    protected void onClosing() {
        super.onClosing();
        System.out.println("Saving the windows before App Close");
    }
}
