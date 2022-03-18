package ProgrammingBasicsWithJava.IfElse;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistics = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        if (statistics > 150){
            clothesPrice = clothesPrice * 0.9;
        }
        double decor = budget * 0.1;
        double clothesMoney = statistics * clothesPrice;
        double totalPrice = decor + clothesMoney;
         if (totalPrice > budget) {
             System.out.printf("Not enough money!\n" + "Wingard needs %.2f leva more.", totalPrice - budget);
         }else{
             System.out.printf("Action!\n" + "Wingard starts filming with %.2f leva left.",budget - totalPrice);
         }
    }
}