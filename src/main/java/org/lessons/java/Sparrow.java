package org.lessons.java;

public class Sparrow extends Animal {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void emitSound() {
        System.out.println("Chip chip!");
    }

    @Override
    public void eat() {
        System.out.println("(I'm eating worms)");
    }
    
}
