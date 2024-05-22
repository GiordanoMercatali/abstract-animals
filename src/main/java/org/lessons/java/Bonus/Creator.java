package org.lessons.java.Bonus;

public class Creator {
    public static void main(String[] args) {
        DVDPlayer ps  = new DVDPlayer();
        System.out.println(ps.getClassName());
        ps.play();
    }
}
