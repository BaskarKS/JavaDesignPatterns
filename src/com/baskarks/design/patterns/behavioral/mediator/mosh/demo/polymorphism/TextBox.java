package com.baskarks.design.patterns.behavioral.mediator.mosh.demo.polymorphism;

public class TextBox extends UIControl {
  private String content;

  public TextBox(DialogBox mediator) {
    super(mediator);
  }
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
    mediator.changed(this);
  }

}
