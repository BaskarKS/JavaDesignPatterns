package com.baskarks.design.patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        var dialogBox = new SignUpDialogBox();
        dialogBox.setUserName("Baskar");
        dialogBox.setPassword("pwd");
        dialogBox.setTermsAndConditions();
    }
}
