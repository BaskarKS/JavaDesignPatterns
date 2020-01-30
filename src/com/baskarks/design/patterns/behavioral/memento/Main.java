package com.baskarks.design.patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        DocumentHistory documentHistory = new DocumentHistory();
        Document docOne = new Document();

        docOne.setContent("Programming");
        docOne.setFontName("Ariel");
        docOne.setFontSize(18);
        documentHistory.saveDocument(docOne.saveDocument());
        System.out.println(docOne);

        docOne.setFontSize(22);
        documentHistory.saveDocument(docOne.saveDocument());
        System.out.println(docOne);

        docOne.setFontName("Calibri");
        documentHistory.saveDocument(docOne.saveDocument());
        System.out.println(docOne);

        System.out.println("Restoring document to previous state");
        docOne.restoreDocument(documentHistory.getLastDocument());
        System.out.println(docOne);

        System.out.println("Restoring document to previous state");
        docOne.restoreDocument(documentHistory.getLastDocument());
        System.out.println(docOne);

        System.out.println("Restoring document to previous state");
        docOne.restoreDocument(documentHistory.getLastDocument());
        System.out.println(docOne);

    }
}
