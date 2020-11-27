package com.baskarks.design.patterns.practice.templatebest;

public class GenerateReport extends Task{
    public GenerateReport(AuditTrail logger) {
        super(logger);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generating Report Functionality executed");
    }
}
