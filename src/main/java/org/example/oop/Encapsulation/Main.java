package org.example.oop.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Student s1 =
                new Student("Sara", 22, "IT");

        System.out.println(s1.getAge());

        s1.setAge(23);

        System.out.println(s1.getAge());
    }
}