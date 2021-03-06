package com.baskarks.design.patterns.behavioral.chainofresponsibility.mosh.solution;

public class Demo {
    public static void main(String[] args) {
        show();
    }
    public static void show() {
        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");
    }
}
