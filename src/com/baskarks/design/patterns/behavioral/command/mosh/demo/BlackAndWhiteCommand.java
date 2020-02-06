package com.baskarks.design.patterns.behavioral.command.mosh.demo;

import com.baskarks.design.patterns.behavioral.command.mosh.demo.fx.Command;

public class BlackAndWhiteCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Black and white");
  }
}
