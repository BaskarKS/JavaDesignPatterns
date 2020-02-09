package com.baskarks.design.patterns.behavioral.chainofresponsibility.mosh.solution;

public class QuickBooksReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }
}