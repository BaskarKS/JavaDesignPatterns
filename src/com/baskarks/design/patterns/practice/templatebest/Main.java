package com.baskarks.design.patterns.practice.templatebest;

public class Main {
    /*
         In this Template implementation, to introduce a new
         operation we have to extend the "Task" abstract class.
         and hs is forced to implement the abstract method. where
         he can define his own functionality. No guidelines or pre
         teaching is required to introduce a new operation. can directly
         call execute in the operation instance to achieve the results

         In Polymorphism methodology, he has to implement
         Template(I) to define a operation and has to pass the
         operation to Task for computation of operation.

         In Inheritance methodology, he has to extend the "Task"
         class and should be manually aware to override the
         "doExecute() method to define the new operation which
         may fail to follow for some developers
    */
    public static void main(String[] args) {
        System.out.println("Checking Template with in Package");
        AuditTrail capture = new AuditTrail();
        var transfer = new TransferMoney(capture);
        var report = new GenerateReport(capture);
        //transfer.doExecute(); // not supposed to use this method
        transfer.execute("Transfer Money Log Info");
        //report.doExecute();
        report.execute("Generate Report Log Info");
        capture.showCaptures();
    }
}
