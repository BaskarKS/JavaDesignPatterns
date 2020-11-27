package com.baskarks.design.patterns.practice.check;

import com.baskarks.design.patterns.practice.templatebest.AuditTrail;
import com.baskarks.design.patterns.practice.templatebest.GenerateReport;
import com.baskarks.design.patterns.practice.templatebest.TransferMoney;

public class Main {
    public static void main(String[] args) {
        System.out.println("Checking Template outside Package");
        AuditTrail capture = new AuditTrail();
        var transfer = new TransferMoney(capture);
        var report = new GenerateReport(capture);
        transfer.execute("Transfer Money");
        report.execute("Generate Report"); // here we are not allowed to access protected methods of TransferMoney and GenerateReport class instance of different package

        System.out.println();
        capture.showCaptures();
        DerivedTask derTask = new DerivedTask(capture);
        derTask.doExecute(); // if we don't create a DerivedTask subclass(in current package) of
                                        // TransferMoney parent class(different package) and also override the
                                        // parent protected method. we are not allowed to access the parent
                                        // protected method
    }
}

class DerivedTask extends TransferMoney { // can never extend an abstract class which contain default access abstract method which is outside the package

    public DerivedTask(AuditTrail logger) {
        super(logger);
    }

    @Override
    protected void doExecute() {
        super.doExecute();
    }
}
// Protected access methods of ClassA in different package cannot be accessed here.
// Only instance of derived classes(current package) of ClassA(different package) can
// access the protected methods of ClassA (compulsorily the protected method of classA
// should be overridden in the derived class(current package) and inside the overridden
// methods(in derived class) we can access the parent protected methods using
// super.parent_overridden_method)
