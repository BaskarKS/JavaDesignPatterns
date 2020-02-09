package com.baskarks.design.patterns.behavioral.chainofresponsibility;

public class Demo {
    public static void main(String[] args) {
        String fileName = "Baskar.qbw";

        var quickBook = new QuickBookFileHandler(null);
        var macReader = new MacFileHandler(quickBook);
        var microsoft = new MicrosoftFileHandler(macReader);
        var dataReader = new DataReader(microsoft);
        dataReader.read(fileName);
    }
}
