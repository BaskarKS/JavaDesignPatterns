package com.baskarks.design.patterns.practice.templatethree;

public class TransferMoney extends Task{
    public TransferMoney(AuditTrail logger) {
        super(logger);
    }

    @Override
    public void doExecute() {
        System.out.println("Transfer Money Functionality Executed");
    }
}
