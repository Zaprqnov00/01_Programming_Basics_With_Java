package ProgrammingBasicsWithJava.Exam2021;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOperationSystem = Double.parseDouble(scanner.nextLine());
        double priceVideoCard = Double.parseDouble(scanner.nextLine());
        double priceRAM = Double.parseDouble(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double sumOperationSystem = priceOperationSystem * 1.57;
        double sumVideoCard = priceVideoCard * 1.57;
        double sumRAM = priceRAM * 1.57;
        double allRAM = sumRAM * countRam;
        double percentOperationSystem = sumOperationSystem - (sumOperationSystem * percent);
        double percentVideoCard = sumVideoCard - (sumVideoCard * percent);
        double allSumParts = allRAM + percentOperationSystem + percentVideoCard;

        System.out.printf("Money needed - %.2f leva.",allSumParts);

    }
}
