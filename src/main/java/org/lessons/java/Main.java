package org.lessons.java;

public class Main {
    public static void main(String[] args) {

        Animal[] myAnimals = {
            new Dog("Fido"),
            new Eagle("America"),
            new Sparrow("Chip"),
            new Dolphin("Ecco")
        };
        
        for (int i = 0; i < myAnimals.length; i++) {
            myAnimals[i].emitSound();
            System.out.println("(Hi I'm " + myAnimals[i].getName() + "!)");
            // myAnimals[i].emitSound();
            myAnimals[i].eat();

            makeFly(myAnimals[i]);
            makeSwim(myAnimals[i]);
        }
        
    }

    public static void makeFly(Animal animal){
        if(animal instanceof Fly){
            // animal.emitSound();
            ((Fly) animal).fly();
        } else {
            // animal.emitSound();
            System.out.println("(I can't fly!)");
        }
    }

    public static void makeSwim(Animal animal){
        if(animal instanceof Swim){
            // animal.emitSound();
            ((Swim) animal).swim();
        } else {
            // animal.emitSound();
            System.out.println("(I can't swim!)");
        }
    }
}