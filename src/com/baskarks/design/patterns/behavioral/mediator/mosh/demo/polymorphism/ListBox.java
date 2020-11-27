package com.baskarks.design.patterns.behavioral.mediator.mosh.demo.polymorphism;

import java.util.List;

public class ListBox extends UIControl {
  private String selection;

  public ListBox(DialogBox mediator) {
    super(mediator);
  }
  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    this.selection = selection;
    mediator.changed(this);
  }
}
