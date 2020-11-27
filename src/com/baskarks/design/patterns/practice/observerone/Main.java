package com.baskarks.design.patterns.practice.observerone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Demo in Push Style");
        SpreadData sheetData = new SpreadData();
        SpreadSheet sheet = new SpreadSheet();
        Chart chart = new Chart();
        sheetData.addSpreadDataObserver(sheet);
        sheetData.addSpreadDataObserver(chart);
        sheetData.setDataValue(10);
        System.out.println();
        sheetData.setDataValue(100);
        sheetData.removeSpreadDataObserver(sheet);
        System.out.println();
        System.out.println("SpreadSheet is Unregistered to Observe");
        sheetData.setDataValue(200);

        //Drawback is when future new Concrete observers rely on some other
        // extra data from the SpreadData its not available, making
        // modification in PushObserver to introduce the new data
        // needed by the future concrete observers, need all the changes
        // to be done on existing observers. which is against "open for extension
        // and closed for modification"
    }
}
