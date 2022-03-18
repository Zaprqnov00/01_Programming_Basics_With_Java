package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countHours = Integer.parseInt(scanner.nextLine());
        int dayOff =Integer.parseInt(scanner.nextLine());
        int holidayWorkers = Integer.parseInt(scanner.nextLine());

        int normalWorkDay = 8;
        int holidayWork = 2;

        double studyTime = 6.3 * normalWorkDay;
        int workers =  holidayWorkers * (holidayWork * dayOff);
        double totalTime = Math.floor(studyTime + workers);

        if (totalTime > countHours){
            double freeHours = Math.floor(totalTime - countHours);
            System.out.println("Yes!" + freeHours + "hours left.");;
        }else{
            double leftHours = Math.floor(countHours - totalTime);
            System.out.println("Not enough time!" + leftHours + "hours needed.");
        }

    }
}
