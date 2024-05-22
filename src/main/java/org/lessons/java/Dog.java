package org.lessons.java;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void emitSound() {
        System.out.println("Bark bark!");
    }

    @Override
    public void eat() {
        System.out.println("(I'm eating meat)");
    }
    
}
