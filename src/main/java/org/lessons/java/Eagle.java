package org.lessons.java;

public class Eagle extends Animal implements Fly{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void emitSound() {
        System.out.println("Eeeeeee!");
    }

    @Override
    public void eat() {
        System.out.println("(I'm eating mice)");
    }

    @Override
    public void fly() {
        System.out.println("(I'm flying!)");
    }
    
}
