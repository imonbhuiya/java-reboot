package org.example.oop.practice.EmployeeManagement;

public class Tester extends Employee {

    private String testingTool; //Encapsulation

    public Tester(String name, double salary, String testingTool) {
        super(name, salary); //Parent constructor
        this.testingTool = testingTool; //Child field
    }

    public String getTestingTool() {
        return testingTool;
    }

    @Override
    public void work() {
        System.out.println("Tester is testing software");
    }


}
