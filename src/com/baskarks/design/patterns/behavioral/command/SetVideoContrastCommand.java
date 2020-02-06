package com.baskarks.design.patterns.behavioral.command;

public class SetVideoContrastCommand extends AbstractUndoableCommand{
    private float prevContrast;
    private float contrast;

    public SetVideoContrastCommand(VideoEditor editor, History history,
                                   float contrast) {
        super(editor, history);
        this.prevContrast = editor.getContrast();
        this.contrast = contrast;
    }
    @Override
    public void doExecute() {
        editor.setContrast(contrast);
    }

    @Override
    public void unexecute() {
        editor.setContrast(this.prevContrast);
    }
}
