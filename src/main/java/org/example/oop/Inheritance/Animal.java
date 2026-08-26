package org.example.oop.Inheritance;

public class Animal {

    void eat(){
        System.out.println("Eating");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

    }
}

