package com.baskarks.design.patterns.behavioral.chainofresponsibility;

public class QuickBookFileHandler extends FileFormat {
    public QuickBookFileHandler(FileFormat format) {
        super(format);
    }
    @Override
    public boolean processFile(String file) {
        if (file.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
            return true;
        }
        return false;
    }
}
