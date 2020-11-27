package com.baskarks.design.patterns.practice.templatebest;

public class TransferMoney extends Task{
    public TransferMoney(AuditTrail logger) {
        super(logger);
    }

    @Override
    protected void doExecute() {
        System.out.println("TransferringMoney Task Functionality executed");
    }
}
