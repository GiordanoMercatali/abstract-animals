package org.lessons.java.Bonus;

public abstract class Device {

    private String className;

    public Device(String className){
        this.className = getClassName();
    }

    public String getClassName(){
        return className = getClass().getName();
    }
    
    public void play(){
        System.out.println("I'm " + className + " and I'm in play mode");
    }

    public void stop(){
        System.out.println("I'm " + className + " and I'm in stop mode");
    }
}
