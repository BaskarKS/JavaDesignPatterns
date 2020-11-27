package com.baskarks.design.patterns.practice.commandasmemento;

// its concrete command and also act as invoker
public class Undo implements Command {
    private History history;
    public Undo(History history) {
        this.history = history; // receiver
    }
    @Override
    public void executeCommand() {
        if (!history.isEmpty())
            history.pop().undoCommand();
        else
            System.out.println("No Commands in History to Undo");
    }
}
