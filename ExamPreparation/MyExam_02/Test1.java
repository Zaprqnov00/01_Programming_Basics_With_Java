package ProgrammingBasicsWithJava.Exam2021Part2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumPerPage = Double.parseDouble(scanner.nextLine());
        double sumPerCover = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        double designer = Double.parseDouble(scanner.nextLine());
        int percentGroup = Integer.parseInt(scanner.nextLine());

        double firstSum = sumPerPage * 899 + sumPerCover * 2;
        double afterPercent = firstSum - (firstSum * percent / 100);
        double sumDesigner = afterPercent + designer;
        double sumGroup = sumDesigner - (sumDesigner * percentGroup / 100);

        System.out.printf("Avtonom should pay %.2f BGN.",sumGroup);

    }
}