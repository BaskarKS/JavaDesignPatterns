package com.baskarks.design.patterns.practice.command;

public class ButtonInvoker {
    private String buttonLabel;
    public ButtonInvoker(String buttonLabel) {
        this.buttonLabel = buttonLabel;
    }

    public void OnClick(Command concreteCommand) {
        concreteCommand.execute();
    }

    public String getButtonLabel() {
        return buttonLabel;
    }

    public void setButtonLabel(String buttonLabel) {
        this.buttonLabel = buttonLabel;
    }
}
