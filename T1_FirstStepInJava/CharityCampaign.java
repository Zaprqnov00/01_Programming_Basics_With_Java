package ProgrammingBasicsWithJava.FirstStepInJava;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cake = 45;
        double waffle = 5.80;
        double butcher = 3.20;

        int days = Integer.parseInt(scanner.nextLine());
        int countBakers = Integer.parseInt(scanner.nextLine());
        int countCakes = Integer.parseInt(scanner.nextLine());
        int countWaffles = Integer.parseInt(scanner.nextLine());
        int countButcher = Integer.parseInt(scanner.nextLine());

        double sumPerDay = (cake * countCakes + waffle * countWaffles + butcher * countButcher) * countBakers;
        double totalSum = sumPerDay * days;
        double costsSum = totalSum - totalSum/8;
        System.out.printf("%.2f",costsSum);



    }
}
