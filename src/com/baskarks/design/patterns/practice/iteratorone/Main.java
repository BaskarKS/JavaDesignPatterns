package com.baskarks.design.patterns.practice.iteratorone;

public class Main {
    public static void main(String[] args) {
        Company kwi = new Company();
        kwi.addEmployee("Baskar", 11400, GenderSex.MALE);
        kwi.addEmployee("Reetha", 11000, GenderSex.SHEMALE);
        kwi.addEmployee("Karthik", 11200, GenderSex.MALE);
        kwi.addEmployee("Deepthi", 11405, GenderSex.FEMALE);
        kwi.addEmployee("Geetha", 11500, GenderSex.FEMALE);

        Iterator empList = kwi.getIterator();
        while (empList.hasNext()) {
            System.out.println(empList.getNext());
            empList.next();
        }
    }
}
