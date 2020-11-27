package com.baskarks.design.patterns.practice.templatethree;

public class Main {
    /*
    Template implemented using Inheritance

    New Developers are forced to learn the mechanism of extending the
    Template class (Task) and manually override the doExecute() method of
    parent class (task). and implement the functionality inside the doExecute()
    method.
    */
    public static void main(String[] args) {
        AuditTrail logger = new AuditTrail();
        GenerateReport generateReport = new GenerateReport(logger);
        TransferMoney transferMoney = new TransferMoney(logger);

        generateReport.execute("generate report logging details");
        transferMoney.execute("transfer money logging details");

        System.out.println();
        System.out.println();
        logger.showCaptures();
    }
}
