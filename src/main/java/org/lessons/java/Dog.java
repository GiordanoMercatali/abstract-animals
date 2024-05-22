package org.lessons.java;

public class Dog extends Animal {

    public Dog(String name, String food) {
        super(name, food);
    }

    @Override
    public void emitSound() {
        System.out.println("Bark bark!");
    }

    // @Override
    // public void eat() {
    //     System.out.println("(I'm eating meat)");
    // }
    
}
