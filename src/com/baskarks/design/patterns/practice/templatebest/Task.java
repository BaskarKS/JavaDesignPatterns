package com.baskarks.design.patterns.practice.templatebest;

public abstract class Task {
    private AuditTrail recordTransactions;

    public Task(AuditTrail logger) {
        recordTransactions = logger;
    }
    public void execute(String logInfo) {
        recordTransactions.record(logInfo); // pre computation (Eg: collect logs)
        doExecute();
    }
    protected abstract void doExecute(); // making protected will restrict to call
                                                                    // this method by the clients or
                                                                    // other users outside this package
}
