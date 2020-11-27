package com.baskarks.design.patterns.behavioral.mediator.mosh.demo.polymorphism;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
  protected DialogBox mediator;

  public UIControl(DialogBox mediator) {
    this.mediator = mediator;
  }
}
