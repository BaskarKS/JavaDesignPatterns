package com.baskarks.design.patterns.practice.commandasmemento;

public class Main {

    public static void main(String[] args) {
        Document document = new Document("my name is baskar");
        History history = new History();

        BoldCommand makeDocumentTextBold = new BoldCommand(document, history);
        System.out.println(document.getText());

        Undo CtrlZ = new Undo(history);

        System.out.println();
        makeDocumentTextBold.executeCommand(); // pressing bold button to make text bold
        System.out.println(document.getText());

        System.out.println();
        makeDocumentTextBold.undoCommand(); // pressing bold button again to undo it
        System.out.println(document.getText());

        System.out.println();
        makeDocumentTextBold.executeCommand(); // making text bold
        CtrlZ.executeCommand(); // using Ctrl + Z to undo the bold
        System.out.println(document.getText());


    }
}
