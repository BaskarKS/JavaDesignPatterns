package com.baskarks.design.patterns.practice.templatethree;

public class GenerateReport extends Task{
    public GenerateReport(AuditTrail logger) {
        super(logger);
    }

    @Override
    public void doExecute() {
        System.out.println("Generate Report Functionality Executed");
    }
}
