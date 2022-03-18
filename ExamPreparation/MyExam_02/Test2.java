package ProgrammingBasicsWithJava.Exam2021Part2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballFan = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int countBeer = Integer.parseInt(scanner.nextLine());
        int countChips = Integer.parseInt(scanner.nextLine());

        double beerSum = countBeer * 1.20;
        double chipsOnePacketSum = beerSum * 0.45;
        double chipsSum = Math.ceil(countChips * chipsOnePacketSum);
        double allSum = beerSum + chipsSum;

        if (allSum <= budget){
            System.out.printf("%s bought a snack and has %.2f leva left.",footballFan,budget - allSum);
        }else {
            System.out.printf("%s needs %.2f more leva!",footballFan,allSum - budget);
        }

    }
}
