package ProgrammingBasicsWithJava.FirstStepInJava;

import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double hallRent = Double.parseDouble(scanner.nextLine());
        double cakePrice = hallRent * 20 / 100;
        double drinksPrice = cakePrice - cakePrice * 45 / 100;
        double animatorPrice = hallRent * 1 / 3;
        double sums = hallRent + cakePrice + drinksPrice + animatorPrice;
        System.out.println(sums);
    }
}
