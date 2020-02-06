package com.baskarks.design.patterns.behavioral.command.mosh.demo.editor;

public interface UndoableCommand extends Command {
  void unexecute();
}
