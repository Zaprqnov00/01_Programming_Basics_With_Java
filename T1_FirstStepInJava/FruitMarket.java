package ProgrammingBasicsWithJava.FirstStepInJava;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	цената на малините е с 50% по-ниска от тази на ягодите;
        //•	цената на портокалите е с 40% по-ниска от цената на малините;
        //•	цената на бананите е с 80% по-ниска от цената на малините.

        double strawberriesSum = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        double raspberriesSum = strawberriesSum * 50/100;
        double orangeSum = raspberriesSum - (0.4 * raspberriesSum);
        double bananasSum = raspberriesSum - (0.8 * raspberriesSum);
        double totalRaspberries = raspberriesKg * raspberriesSum;
        double totalOrange = orangeKg * orangeSum;
        double totalBananas = bananasSum * bananasKg;
        double totalStrawberries = strawberriesKg * strawberriesSum;
        double totalSum = totalRaspberries + totalOrange + totalBananas + totalStrawberries;
        System.out.printf("%.2f", totalSum);

    }
}
