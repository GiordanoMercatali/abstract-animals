package org.lessons.java;

public class Dolphin extends Animal implements Swim{

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void emitSound() {
        System.out.println("Eeh eeh eeh!");
    }

    @Override
    public void eat() {
        System.out.println("(I'm eating fish)");
    }

    @Override
    public void swim() {

        System.out.println("(I'm swimming!)");

    }

    
}
