package com.baskarks.design.patterns.structural.composite.family.problem;

public class Demo {
    public static void main(String[] args) {
        Person male1 = new Person("Baskar", "Male");
        Person male2 = new Person("Yuva", "male");
        Person male3 = new Person("Deva", "male");
        Family fam1 = new Family();
        fam1.addDetails(male1);
        fam1.addDetails(male2);
        fam1.addDetails(male3);
        fam1.getDetails();
        Person fem1 = new Person("Jaashi", "female");
        Person fem2 = new Person("Ramani", "female");
        Family fam2 = new Family();
        fam2.addDetails(fem1);
        fam2.addDetails(fem2);
        fam2.getDetails();

        Family total = new Family();
        //cant form family in family hierarchy
        //total.addDetails(fam1); // cant add family
        //total.addDetails(fam2); // cant add family
        total.getDetails();
    }
}
