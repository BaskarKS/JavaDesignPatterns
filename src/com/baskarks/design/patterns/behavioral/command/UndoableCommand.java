package com.baskarks.design.patterns.behavioral.command;

public interface UndoableCommand extends command {
    public void unexecute();
}
