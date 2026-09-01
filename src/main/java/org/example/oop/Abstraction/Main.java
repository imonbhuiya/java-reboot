package org.example.oop.Abstraction;

abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    public abstract void work();

    // Normal method
    public void takeBreak() {
        System.out.println(name + " is taking a break");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing Java code");
    }
}

class Tester extends Employee {

    public Tester(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing software");
    }
}

public class Main {

    public static void main(String[] args) {

        Employee developer = new Developer("Alex");
        Employee tester = new Tester("Bob");

        developer.work();
        developer.takeBreak();

        tester.work();
        tester.takeBreak();
    }
}