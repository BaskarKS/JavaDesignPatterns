package com.baskarks.design.patterns.structural.composite.family.composite;

public class Person implements PersonDetails{
    private String gender;
    private String name;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    @Override
    public void getDetails() {
        System.out.println("Name : " + name + ", Gender : " + gender);
    }
}
