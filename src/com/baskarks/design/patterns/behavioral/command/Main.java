package com.baskarks.design.patterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        var editor = new VideoEditor();
        var history = new History();
        var videoTextCmd = new SetVideoTextCommand(editor, history, "Sadhguru");
        var videoContrastCmd = new SetVideoContrastCommand(editor, history, 2.5f);
        var undoCmd = new UndoCommand(history);
        System.out.println(editor);
        videoTextCmd.execute();
        videoContrastCmd.execute();
        System.out.println(editor);
        undoCmd.execute();
        System.out.println(editor);
        undoCmd.execute();
        System.out.println(editor);
        undoCmd.execute();
        System.out.println(editor);
    }
}
