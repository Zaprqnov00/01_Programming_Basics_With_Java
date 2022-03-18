package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        //° F = (° C × 9/5) + 32

        double fahrenheit = (num * 9/5) + 32;

        System.out.printf("%.2f",fahrenheit);

    }
}
