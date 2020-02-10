package com.baskarks.design.patterns.behavioral.visitor.mosh.solution;

public class FormatSegment extends Segment {
  @Override
  public void applyFilter(AudioFilter filter) {
    filter.apply(this);
  }
}
