package org.example.oop.Inheritance.MultilevelInheritance;

class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Puppy extends Dog {

    void play() {
        System.out.println("Puppy plays");
    }

    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}
