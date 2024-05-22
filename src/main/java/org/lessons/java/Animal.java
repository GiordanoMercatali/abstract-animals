package org.lessons.java;

public abstract class Animal {

    private String name;
    private String food;

    public Animal(String name, String food){
        this.name = name;
        this.food = food;
    }

    public String getName(){
        return name;
    }

    public String getFood(){
        return food;
    }
    
    public void sleep(){
        System.out.println("Zzz...");
    }

    public abstract void emitSound();
    // public abstract void eat();
}
