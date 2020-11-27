package com.baskarks.design.patterns.practice.iteratorone;

import com.baskarks.design.patterns.practice.templatebest.GenerateReport;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Company {
    private List<Employee> employeeList;
    private Employee[] employees;
    private final int MAX_EMPLOYEES = 10;
    private int employeeCount;

    public Company() {
        employeeList = new ArrayList<>();
        employees = new Employee[MAX_EMPLOYEES];
        employeeCount = 0;
    }
    public void addEmployee(String name, int empId, GenderSex gender) {
        if (name == null || name.length() == 0 || empId < 0 || gender == null)
            throw new IllegalArgumentException("Enter proper Employee Details");
        Employee employee = new Employee(name, empId, gender);
        employeeList.add(employee);
        employees[employeeCount++] = employee;
    }
/*
    // defining the below methods, will force the client to change the
    // way of reading the data if the data management structure changes to
    // different type. We need iterator pattern to make clients rely on interface
    // rather than the data directly.
    public List<Employee> getAllEmployeeDetails() {
        return employeeList;
    }
*/
    public Iterator<Employee> getIterator() {
        //return new EmployeeIterator(this);
        return new EmployeeArray(this);
    }
    public Employee[] getEmployeesArray() {
        return this.employees;
    }

    // whenever the internal data management, data structure changes, we
    // implement a iterator based on the new data structure,
    // client never needs to change their implementation of data reading
    private class EmployeeArray implements  Iterator<Employee> {
        private Company company;
        private int count;
        public EmployeeArray(Company company) {
            this.company = company;
            this.count = 0;
        }
        @Override
        public boolean hasNext() {
            Employee[] employeeArray = company.getEmployeesArray();
            return count < employeeArray.length && employeeArray[count] != null;
        }

        @Override
        public void next() {
            count++;
        }

        @Override
        public Employee getNext() {
            return company.getEmployeesArray()[count];
        }
    }

    private class EmployeeIterator implements Iterator<Employee> {

        private Company allEmployees;
        public int count;

        public EmployeeIterator(Company company) {
            allEmployees = company;
            count = 0;
        }

        @Override
        public boolean hasNext() {
            return count < allEmployees.employeeList.size();
        }

        @Override
        public void next() {
            count += 1;
        }

        @Override
        public Employee getNext() {
            return allEmployees.employeeList.get(count);
        }
    }

    static class Employee {
        private String name;
        private int empId;
        private GenderSex gender;

        public Employee(String name, int empId, GenderSex gender) {
            this.name = name;
            this.empId = empId;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", gender=" + gender +
                '}';
        }
    }
}
