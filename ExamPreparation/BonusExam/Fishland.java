package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fishS = Double.parseDouble(scanner.nextLine());
        double fishC = Double.parseDouble(scanner.nextLine());
        double kgP = Double.parseDouble(scanner.nextLine());
        double kgSa = Double.parseDouble(scanner.nextLine());
        int shell = Integer.parseInt(scanner.nextLine());

        double moneyPalamud = fishS + fishS * 0.6;
        double pricePalamud = kgP * moneyPalamud;
        double moneySafrid = fishC + fishC * 0.8;
        double priceSafrid = kgSa * moneySafrid;
        double priceShell = shell * 7.5;
        double totalMoney = pricePalamud + priceSafrid + priceShell;

        System.out.printf("%.2f",totalMoney);
    }
}
