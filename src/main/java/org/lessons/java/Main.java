package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Chip");

        dog.emitSound();
        System.out.println("(Hi I'm " + dog.getName() + "!)");
        dog.emitSound();
        dog.eat();
        
        if (dog instanceof Fly) {
            dog.emitSound();
            ((Fly) dog).fly();
        } else if (dog instanceof Swim){
            dog.emitSound();
            ((Swim) dog).swim();
        } else{
            dog.emitSound();
            System.out.println("(I can't do none of those actions!)");
        }
        
    }
}