package com.baskarks.design.patterns.behavioral.command;

public class UndoCommand implements command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (!history.isEmpty())
            history.pop().unexecute();
    }
}
