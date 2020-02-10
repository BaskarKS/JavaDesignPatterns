package com.baskarks.design.patterns.behavioral.visitor.mosh.solution;

public class NormalizeFilter implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize on format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize on fact segment");
    }
}
