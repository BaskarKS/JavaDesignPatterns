package com.baskarks.design.patterns.practice.command;

public class ConcreteDownloadCommand implements Command {
    private Receiver receiver;
    private String URL;

    public ConcreteDownloadCommand(Receiver receiver, String URL) {
        this.receiver = receiver;
        this.URL = URL;
    }
    @Override
    public void execute() {
        receiver.downloadData(this.URL);
    }
}
