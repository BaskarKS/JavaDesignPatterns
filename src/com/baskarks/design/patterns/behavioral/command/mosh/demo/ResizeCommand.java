package com.baskarks.design.patterns.behavioral.command.mosh.demo;

import com.baskarks.design.patterns.behavioral.command.command;

public class ResizeCommand implements command {
  @Override
  public void execute() {
    System.out.println("Resize");
  }
}
