package com.baskarks.design.patterns.behavioral.state.mosh.demo;

public class Canvas {
  private Tool currentTool;

  public void mouseDown() {
    currentTool.mouseDown();
  }

  public void mouseUp() {
    currentTool.mouseUp();
  }

  public Tool getCurrentTool() {
    return currentTool;
  }

  public void setCurrentTool(Tool currentTool) {
    this.currentTool = currentTool;
  }
}
