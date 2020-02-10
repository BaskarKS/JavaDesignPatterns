package com.baskarks.design.patterns.behavioral.visitor;

public interface Operation {
    public void apply(FactSegment factSegment);
    public void apply(FormatSegment formatSegment);
}
