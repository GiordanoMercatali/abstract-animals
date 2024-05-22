package org.lessons.java.Bonus;

import java.util.Scanner;

public class Creator {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.Create();
    }

    public void Create(){
            System.out.println("Are a playstation or a dvd player?");
            String nextDevice = scanner.nextLine().toLowerCase();
            if (nextDevice.equals("playstation")) {
                Playstation ps = new Playstation();
                System.out.println(ps.getClassName());
                ps.play();
                ps.stop();
            } else if(nextDevice.equals("dvd player")){
                DVDPlayer dp = new DVDPlayer();
                System.out.println(dp.getClassName());
                dp.play();
                dp.stop();
            } else {
                System.out.println("Invalid device!");
            }
    }
}
