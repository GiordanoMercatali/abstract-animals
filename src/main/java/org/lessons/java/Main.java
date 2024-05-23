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

            if(myAnimals[i] instanceof Fly && !(myAnimals[i] instanceof Swim)){
                makeFly((Fly) myAnimals[i]);
            } else if(myAnimals[i] instanceof Swim && !(myAnimals[i] instanceof Fly)){
                makeSwim((Swim) myAnimals[i]);
            } else if (myAnimals[i] instanceof Fly && myAnimals[i] instanceof Swim) {
                makeFly((Fly) myAnimals[i]);
                makeSwim((Swim) myAnimals[i]);
            }
            else {
                System.out.println("I can't do those things!");
            }
        }
        
    }

    public static void makeFly(Fly animal){
        animal.fly();
    }

    public static void makeSwim(Swim animal){
        animal.swim();
    }
}