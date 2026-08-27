package org.example.oop.Inheritance.Super;

public class Dog extends Animal {

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Woof");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.makeSound();
    }
}
