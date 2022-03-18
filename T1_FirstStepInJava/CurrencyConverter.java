package ProgrammingBasicsWithJava.FirstStepInJava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());

        int month = Integer.parseInt(scanner.nextLine());

        double InterestRate = Double.parseDouble(scanner.nextLine());

        double sumPerMonth = depositSum * (InterestRate / 100) / 12;

        double totalSum = depositSum + month * sumPerMonth;

        System.out.println(totalSum);



    }
}
