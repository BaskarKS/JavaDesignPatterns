package com.baskarks.design.patterns.practice.commandasmemento;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<UndoCommand> commandsList;
    public History() {
        commandsList = new ArrayList<>();
    }
    public void push(UndoCommand command) {
        commandsList.add(command);
    }
    public UndoCommand pop() {
        int index = commandsList.size() - 1;
        return commandsList.size() > 0 ? commandsList.get(index) : null;
    }
    public boolean isEmpty() {
        return !(commandsList.size() > 0);
    }
}
