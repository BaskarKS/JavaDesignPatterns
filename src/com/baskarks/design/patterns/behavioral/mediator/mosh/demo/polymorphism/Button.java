package com.baskarks.design.patterns.behavioral.mediator.mosh.demo.polymorphism;

public class Button extends UIControl {
  private boolean isEnabled;

  public Button(DialogBox mediator) {
    super(mediator);
  }
  public boolean isEnabled() {
    return isEnabled;
  }

  public void setEnabled(boolean enabled) {
    isEnabled = enabled;
    mediator.changed(this);
  }
}
