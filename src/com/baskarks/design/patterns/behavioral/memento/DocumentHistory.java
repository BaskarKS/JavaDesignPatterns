package com.baskarks.design.patterns.behavioral.memento;

import javax.print.Doc;
import java.util.Stack;

public class DocumentHistory {
    Stack<DocumentState> docState;

    public DocumentHistory() {
        docState = new Stack<>();
    }

    public void saveDocument(DocumentState document) {
        docState.push(document);
    }

    public DocumentState getLastDocument() {
          return (!docState.isEmpty()) ? docState.pop() : null;
    }

}
