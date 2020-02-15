package com.baskarks.design.patterns.structural.composite.family.problem;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> details = new ArrayList<>();

    public void addDetails(Person person) {
        details.add(person);
    }

    public void getDetails() {
        for (Person each : details)
            each.getDetails();
    }

}
