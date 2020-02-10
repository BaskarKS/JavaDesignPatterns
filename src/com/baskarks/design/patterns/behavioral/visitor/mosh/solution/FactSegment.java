package com.baskarks.design.patterns.behavioral.visitor.mosh.solution;

public class FactSegment extends Segment {
  @Override
  public void applyFilter(AudioFilter filter) {
    filter.apply(this);
  }
}
