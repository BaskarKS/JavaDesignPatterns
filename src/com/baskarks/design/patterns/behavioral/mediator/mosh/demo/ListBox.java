package com.baskarks.design.patterns.behavioral.mediator.mosh.demo;

public class ListBox extends UIControl {
  private String selection;

  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    this.selection = selection;
    notifyEventHandlers();
  }
}
