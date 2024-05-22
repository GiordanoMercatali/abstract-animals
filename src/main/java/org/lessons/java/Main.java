package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Princess");

        dog.emitSound();
        System.out.println("(Hi I'm " + dog.getName() + ")");
        dog.emitSound();
        dog.eat();
        
    }
}