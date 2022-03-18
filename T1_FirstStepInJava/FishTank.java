package ProgrammingBasicsWithJava.FirstStepInJava;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());


        int vAquarium = length * weight * height;
        double totalLitres = vAquarium * 0.001;
        double Percent = percent * 0.01;
        double finalLitres = totalLitres * (1 - Percent);
        System.out.printf("%.2f",finalLitres);

    }
}
