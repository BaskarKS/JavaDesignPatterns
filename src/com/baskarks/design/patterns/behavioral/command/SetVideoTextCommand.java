package com.baskarks.design.patterns.behavioral.command;

public class SetVideoTextCommand extends AbstractUndoableCommand {
    private String videoLabel;
    private VideoEditor editor;

    public SetVideoTextCommand(VideoEditor editor, History history,
                                String text) {
        super(editor, history);
        this.editor = editor;
        this.videoLabel = text;

    }

    @Override
    public void doExecute() {
        editor.setText(videoLabel);
    }

    @Override
    public void unexecute() {
        editor.removeText();
    }

    public String getVideoLabel() {
        return videoLabel;
    }

    public void setVideoLabel(String videoLabel) {
        this.videoLabel = videoLabel;
    }
}
