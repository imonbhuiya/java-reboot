package org.example.oop.Inheritance.Super;

class Employee {

    String role = "Employee";

    Employee(String name) {
        System.out.println("Parent constructor: " + name);
    }

    void work() {
        System.out.println("Parent method: Employee is working");
    }
}


public class Developer extends Employee {

    String role = "Developer";

    Developer(String name) {

        // 1. super(...) → calls parent constructor
        super(name);
    }


    void showExamples() {

        // 2. super.field → accesses parent field
        System.out.println("Child role: " + this.role);
        System.out.println("Parent role: " + super.role);


        // 3. super.method() → calls parent method
        super.work();
    }


    public static void main(String[] args) {

        Developer dev = new Developer("Alex");

        dev.showExamples();
    }
}