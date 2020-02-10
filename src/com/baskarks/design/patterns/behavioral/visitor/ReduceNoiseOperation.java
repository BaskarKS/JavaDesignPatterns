package com.baskarks.design.patterns.behavioral.visitor;

public class ReduceNoiseOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reduce noise FactSegment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reduce noise FormatSegment");
    }
}
