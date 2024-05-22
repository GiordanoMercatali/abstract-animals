package org.lessons.java;

public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void sleep(){
        System.out.println("Zzz...");
    }

    public abstract void emitSound();
    public abstract void eat();
}
