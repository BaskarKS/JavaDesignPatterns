package com.baskarks.design.patterns.behavioral.memento.mosh.demo;

public class EditorState {
  private final String content;

  public EditorState(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
