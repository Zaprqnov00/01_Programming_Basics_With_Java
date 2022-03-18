package ProgrammingBasicsWithJava.IfElseAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday")) {
            if (fruit.equals("banana")) {
                price = count * 2.50;
            } else if (fruit.equals("apple")) {
                price = count * 1.20;
            } else if (fruit.equals("orange")) {
                price = count * 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = count * 1.45;
            } else if (fruit.equals("kiwi")) {
                price = count * 2.70;
            } else if (fruit.equals("pineapple")) {
                price = count * 5.50;
            } else if (fruit.equals("grapes")) {
                price = count * 3.85;
            }
        }
        if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                price = count * 2.70;
            } else if (fruit.equals("apple")) {
                price = count * 1.25;
            } else if (fruit.equals("orange")) {
                price = count * 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = count * 1.60;
            } else if (fruit.equals("kiwi")) {
                price = count * 3.00;
            } else if (fruit.equals("pineapple")) {
                price = count * 5.60;
            } else if (fruit.equals("grapes")) {
                price = count * 4.20;
            }
        }
        if (price > 0) {
            System.out.printf("%.2f", price);
        } else {
            System.out.println("error");
        }
    }
}