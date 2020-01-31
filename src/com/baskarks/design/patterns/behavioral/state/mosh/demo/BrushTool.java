package com.baskarks.design.patterns.behavioral.state.mosh.demo;

public class BrushTool implements Tool {
  @Override
  public void mouseDown() {
    System.out.println("Brush icon");
  }

  @Override
  public void mouseUp() {
    System.out.println("Draw a line");
  }
}
