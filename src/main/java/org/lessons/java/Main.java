package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow("Chip");

        sparrow.emitSound();
        System.out.println("(Hi I'm " + sparrow.getName() + "!)");
        sparrow.emitSound();
        sparrow.eat();
        sparrow.emitSound();
        sparrow.fly();
        
    }
}