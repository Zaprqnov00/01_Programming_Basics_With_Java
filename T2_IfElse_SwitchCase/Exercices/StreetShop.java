package ProgrammingBasicsWithJava.IfElseAdvanced;

import java.util.Scanner;

public class StreetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = count * 0.50;
            } else if (product.equals("water")) {
                price = count * 0.80;
            } else if (product.equals("beer")) {
                price = count * 1.20;
            } else if (product.equals("sweets")) {
                price = count * 1.45;
            } else if (product.equals("peanuts")) {
                price = count * 1.60;
            }
        }
        if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                price = count * 0.40;
            } else if (product.equals("water")) {
                price = count * 0.70;
            } else if (product.equals("beer")) {
                price = count * 1.15;
            } else if (product.equals("sweets")) {
                price = count * 1.30;
            } else if (product.equals("peanuts")) {
                price = count * 1.50;
            }
        }if (town.equals("Varna")){
            if (product.equals("coffee")) {
                price = count * 0.45;
            } else if (product.equals("water")) {
                price = count * 0.70;
            } else if (product.equals("beer")) {
                price = count * 1.10;
            } else if (product.equals("sweets")) {
                price = count * 1.35;
            } else if (product.equals("peanuts")) {
                price = count * 1.55;
            }
        }
        System.out.println(price);
    }
}