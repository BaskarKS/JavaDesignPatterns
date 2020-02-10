package com.baskarks.design.patterns.behavioral.visitor.mosh.demo;

public class AnchorNode implements HtmlNode {
  @Override
  public void execute(Operation operation) {
    operation.apply(this);
  }
}
