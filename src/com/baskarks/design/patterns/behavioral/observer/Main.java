package com.baskarks.design.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        var firstStock = new Stock("A", 1.50f);
        var secondStock = new Stock("B", 2.50f);
        var thirdStock = new Stock("C", 3.50f);

        var statusBar = new StatusBar();
        statusBar.addStock(firstStock);
        statusBar.addStock(secondStock);

        var allStocks = new StockListView();
        allStocks.addStock(firstStock);
        allStocks.addStock(secondStock);
        allStocks.addStock(thirdStock);

        firstStock.attachObserver(statusBar);
        secondStock.attachObserver(statusBar);

        firstStock.attachObserver(allStocks);
        secondStock.attachObserver(allStocks);
        thirdStock.attachObserver(allStocks);

        firstStock.setPrice(10.5f);
        //thirdStock.setPrice(11.5f);
    }
}
