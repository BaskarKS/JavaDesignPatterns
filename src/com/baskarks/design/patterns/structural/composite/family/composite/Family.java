package com.baskarks.design.patterns.structural.composite.family.composite;

import java.util.ArrayList;
import java.util.List;

public class Family implements PersonDetails{
    private List<PersonDetails> details = new ArrayList<>();

    public void addDetails(PersonDetails person) {
        details.add(person);
    }

    @Override
    public void getDetails() {
        for (PersonDetails each : details) {
            each.getDetails();
        }
    }
}
