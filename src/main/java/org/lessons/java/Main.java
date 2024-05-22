package org.lessons.java;

public class Main {
    public static Dog dog = new Dog("Chip");

        
    public static void main(String[] args) {

        dog.emitSound();
        System.out.println("(Hi I'm " + dog.getName() + "!)");
        dog.emitSound();
        dog.eat();
        
        // if (dog instanceof Fly) {
        //     dog.emitSound();
        //     ((Fly) dog).fly();
        // } else if (dog instanceof Swim){
        //     dog.emitSound();
        //     ((Swim) dog).swim();
        // } else{
        //     dog.emitSound();
        //     System.out.println("(I can't do none of those actions!)");
        // }

        makeFly(dog);
        makeSwim(dog);
        
    }

    public static void makeFly(Animal animal){
        if(animal instanceof Fly){
            animal.emitSound();
            ((Fly) animal).fly();
        } else {
            animal.emitSound();
            System.out.println("(I can't fly!)");
        }
    }

    public static void makeSwim(Animal animal){
        if(animal instanceof Swim){
            animal.emitSound();
            ((Swim) animal).swim();
        } else {
            animal.emitSound();
            System.out.println("(I can't swim!)");
        }
    }
}