package com.baskarks.design.patterns.practice.templatethree;

public class Task {
    private AuditTrail logger;
    public Task(AuditTrail logger) {
        this.logger = logger;
    }
    public void execute(String logInfo) {
        logger.record(logInfo);
        doExecute();
    }
    public void doExecute() {

    }
}
