package com.baskarks.design.patterns.behavioral.chainofresponsibility;

public class MicrosoftFileHandler extends FileFormat {
    public MicrosoftFileHandler(FileFormat format) {
        super(format);
    }

    @Override
    public boolean processFile(String file) {
        if (file.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
            return true;
        }
        return false;
    }
}
