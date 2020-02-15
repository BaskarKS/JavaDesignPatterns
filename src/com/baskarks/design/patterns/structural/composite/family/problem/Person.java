package com.baskarks.design.patterns.structural.composite.family.problem;

public class Person {
    private String gender;
    private String name;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public void getDetails() {
        System.out.println("Name : " + name + ", Gender : " + gender);
    }
}
