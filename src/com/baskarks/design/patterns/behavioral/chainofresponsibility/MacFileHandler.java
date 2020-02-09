package com.baskarks.design.patterns.behavioral.chainofresponsibility;

import java.io.File;

public class MacFileHandler extends FileFormat {
    public MacFileHandler(FileFormat format) {
        super(format);
    }
    @Override
    public boolean processFile(String file) {
        if (file.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
            return true;
        }
        return false;
    }
}
