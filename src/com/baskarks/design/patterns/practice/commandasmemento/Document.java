package com.baskarks.design.patterns.practice.commandasmemento;

import javax.print.Doc;

public class Document {
    private String text;
    public Document(String text) {
        this.text = text;
    }
    public String getText() {
        return this.text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void makeTextBold() {
        String boldText = "<b>"+this.text+"</b>";
        this.text = boldText;
    }
}
