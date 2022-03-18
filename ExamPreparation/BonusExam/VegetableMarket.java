package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double euro = 1.94;

        double vegetableKg = Double.parseDouble(scanner.nextLine());
        double fruitKg = Double.parseDouble(scanner.nextLine());
        int totalVegetableKg = Integer.parseInt(scanner.nextLine());
        int totalFruitKg = Integer.parseInt(scanner.nextLine());

        double vegetablePrice = vegetableKg * totalVegetableKg;
        double fruitPrice = fruitKg * totalFruitKg;
        double totalPrice = (vegetablePrice + fruitPrice);

        System.out.printf("%.2f",totalPrice / 1.94);


    }
}
