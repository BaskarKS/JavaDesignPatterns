package com.baskarks.design.patterns.behavioral.visitor.mosh.solution;

public interface AudioFilter {
    void apply(FormatSegment formatSegment);
    void apply(FactSegment factSegment);
}
