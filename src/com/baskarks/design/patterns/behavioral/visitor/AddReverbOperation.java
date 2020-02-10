package com.baskarks.design.patterns.behavioral.visitor;

public class AddReverbOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Add reverb FactSegment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Add reverb FormatSegment");
    }
}
