package com.baskarks.design.patterns.practice.templatetwo;

public class GenerateReport implements Template{
    @Override
    public void doExecute() {
        System.out.println("Generate Report Logic Executed Here");
    }
}
