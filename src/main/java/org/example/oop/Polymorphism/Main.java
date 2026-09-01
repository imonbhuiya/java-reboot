package org.example.oop.Polymorphism;

class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(name + " is working");
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

    public void writeJava() {
        System.out.println(getName() + " is coding with Java");
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

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the team");
    }
}

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new Developer("Alex"),
                new Tester("Bob"),
                new Manager("Sarah")
        };

        for (Employee employee : employees) {
            employee.work();
        }
    }
}