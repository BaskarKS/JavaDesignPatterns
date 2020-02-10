package com.baskarks.design.patterns.behavioral.visitor.mosh.demo;

public interface Operation {
  void apply(HeadingNode heading);
  void apply(AnchorNode anchor);
}
