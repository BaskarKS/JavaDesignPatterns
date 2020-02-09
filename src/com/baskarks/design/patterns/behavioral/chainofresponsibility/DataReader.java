package com.baskarks.design.patterns.behavioral.chainofresponsibility;

import javax.xml.crypto.Data;
import java.io.File;

public class DataReader {
    private FileFormat format;
    public DataReader(FileFormat format) {
        this.format = format;
    }
    public void read(String fileName) {
/*
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
        }
        else if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
        }
        else if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
        }
        else
            throw new UnsupportedOperationException("File format not supported.");
*/
        format.handleFile(fileName);
    }
}
