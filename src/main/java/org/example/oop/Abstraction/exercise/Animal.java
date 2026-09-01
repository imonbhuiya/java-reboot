package org.example.oop.Abstraction.exercise;

public abstract class Animal {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstract method
    public abstract void sayHell();

    //concrete method
    public void sleep() {
        System.out.println("zzzz....");
    }
}
