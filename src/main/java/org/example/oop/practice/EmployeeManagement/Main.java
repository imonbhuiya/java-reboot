package org.example.oop.practice.EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Alex", 5000, "Java");
        Tester tester = new Tester("Bob", 4509, "Selenium");
        System.out.println(developer.getName());
        System.out.println(developer.getSalary());
        System.out.println(developer.getProgrammingLanguage());

        developer.work();
        developer.increaseSalary(500);
        System.out.println(developer.getSalary());

        System.out.println(tester.getName());
        System.out.println(tester.getSalary());
        System.out.println(tester.getTestingTool());
        tester.work();

    }
}
