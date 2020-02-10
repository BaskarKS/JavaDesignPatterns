package com.baskarks.design.patterns.behavioral.visitor;

public class FactSegment implements Segment {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
