package org.lessons.java.Bonus;

public abstract class Device {

    private String className;

    public Device(){
        this.className = getClassName();
    }

    public String getClassName(){
        return getClass().getSimpleName();
    }
    
    public void play(){
        System.out.println("I'm a" + className + " and I'm in play mode");
    }

    public void stop(){
        System.out.println("I'm a" + className + " and I'm in stop mode");
    }
}
