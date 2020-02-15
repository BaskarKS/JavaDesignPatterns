package com.baskarks.design.patterns.structural.composite.family.solution;

import java.util.ArrayList;
import java.util.List;

public class Family {
    //problem can be solved by maintaining Object type objects
    //any object type can be added / maintained
    private List<Object> details = new ArrayList<>();

    public void addDetails(Object person) {
        details.add(person);
    }

    //handle object type based on instance type.
    public void getDetails() {
        for (Object each : details) {
            if (each instanceof Person)
                ((Person)each).getDetails();
            else if (each instanceof Family)
                ((Family)each).getDetails();
        }
    }
}
