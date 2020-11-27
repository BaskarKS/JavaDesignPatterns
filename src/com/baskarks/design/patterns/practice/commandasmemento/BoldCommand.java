package com.baskarks.design.patterns.practice.commandasmemento;

//its concrete command and takes responsibility of Invoker
public class BoldCommand implements UndoCommand{
    private Document document; //Receiver
    private History history; // another form of receiver
    private String text;
    public BoldCommand(Document document, History history) {
        this.document = document;
        this.history = history;
    }
    @Override
    public void undoCommand() {
        document.setText(this.text);
    }

    @Override
    public void executeCommand() {
        this.text = document.getText();
        document.makeTextBold();
        history.push(this);
    }
}
