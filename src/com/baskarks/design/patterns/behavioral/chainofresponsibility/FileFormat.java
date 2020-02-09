package com.baskarks.design.patterns.behavioral.chainofresponsibility;

public abstract class FileFormat {
    private FileFormat format;
    public FileFormat(FileFormat format) {
        this.format = format;
    }

    protected abstract boolean processFile(String file);

    public void handleFile(String file) {
        if (processFile(file))
            return;
        if (format != null)
            format.handleFile(file);
    }
}
