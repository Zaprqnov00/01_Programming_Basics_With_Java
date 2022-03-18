package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());

        int normaGame = 30000;
        int workdayGame = 63;
        int holidayGame = 127;
        int yearDay = 365;

        int workDays = yearDay - freeDays;
        int totalGameTime = workDays * workdayGame + freeDays * holidayGame;

        if (normaGame >= totalGameTime) {
            int hours = (normaGame - totalGameTime) / 60;
            int min = (normaGame - totalGameTime) % 60;
            System.out.println("Tom sleeps well");
            System.out.println(hours + " hours and " + min + " minutes less for play");
        }else{
            int hours = (totalGameTime - normaGame) / 60;
            int min = (totalGameTime - normaGame) % 60;
            System.out.println("Tom will run away");
            System.out.println(hours + " hours and " + min + " minutes more for play");
        }
    }
}