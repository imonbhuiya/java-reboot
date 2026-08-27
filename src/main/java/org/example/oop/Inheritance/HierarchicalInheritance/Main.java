package org.example.oop.Inheritance.HierarchicalInheritance;

class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    void code() {
        System.out.println("Developer is coding");
    }
}

class Tester extends Employee {

    void test() {
        System.out.println("Tester is testing");
    }
}

public class Main {

    public static void main(String[] args) {

        Developer dev = new Developer();

        dev.work();  // ✅ from parent
        dev.code();  // ✅ own method
    //    dev.test();  // ❌ belongs to Tester

        Tester tester = new Tester();

        tester.work(); // ✅ from parent
        tester.test(); // ✅ own method
      //  tester.code(); // ❌ belongs to Developer
    }
}
