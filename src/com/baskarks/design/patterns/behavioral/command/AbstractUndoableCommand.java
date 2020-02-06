package com.baskarks.design.patterns.behavioral.command;

public abstract class AbstractUndoableCommand implements UndoableCommand{
    protected History history;
    protected VideoEditor editor;

    public AbstractUndoableCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }
    public abstract void doExecute();
}
