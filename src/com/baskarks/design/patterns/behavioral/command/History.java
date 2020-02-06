package com.baskarks.design.patterns.behavioral.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.push(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public boolean isEmpty() {
        return commands.size() == 0;
    }
}
