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

            makeFly((Fly) myAnimals[i]);
            makeSwim((Swim) myAnimals[i]);
        }
        
    }

    public static void makeFly(Fly animal){
        animal.fly();
    }

    public static void makeSwim(Swim animal){
        animal.swim();
    }
}