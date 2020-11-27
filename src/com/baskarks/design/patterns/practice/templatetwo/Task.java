package com.baskarks.design.patterns.practice.templatetwo;

public class Task {
    private AuditTrail logger;
    public Task(AuditTrail logger) {
        this.logger = logger;
    }

    public void execute(Template template, String logInfo) {
        logger.record(logInfo);
        template.doExecute();
    }
}
