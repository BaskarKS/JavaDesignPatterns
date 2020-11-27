package com.baskarks.design.patterns.practice.templatetwo;

public class Main {
    // Template is implemented using Polymorphism

    // New developer can create new implementation using template and pass it
    // to the engine to execute it, so engine will do some precomputed task(collecting
    // log info of the executed Task.

    // In order to precompute some execution(like collecting logs) for every
    // operations (like TransferMoney and GenerateReport), where the operations
    // are extensible by just implementing the Template(I) and pass it to the
    // main engine, so the engine will do the pre-computation like collecting logs
    // and instantiate the operation(any operation which implements Template(I)

    public static void main(String[] args) {
        AuditTrail logger = new AuditTrail();
        Template generateReport = new GenerateReport();
        Template transferMoney = new TransferMoney();
        Task mainEngine = new Task(logger);
        mainEngine.execute(generateReport, "Generate Report Log Info");
        mainEngine.execute(transferMoney, "Transfer Money Log Info");

        System.out.println();
        System.out.println("Logger Collected Logs");
        logger.showCaptures();
    }
}
