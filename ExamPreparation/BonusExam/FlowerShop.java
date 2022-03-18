package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double magnolii = 3.25;
        double ziombioli = 4;
        double roses = 3.50;
        double cactus = 8;

        int countMagnolii = Integer.parseInt(scanner.nextLine());
        int countZiombioli = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countCactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = (countMagnolii * magnolii) + (countZiombioli * ziombioli) + (countRoses * roses) + (countCactus * cactus);
        double tax = totalPrice * 5 / 100;
        double winPrice = totalPrice - tax;


        if (winPrice < giftPrice) {
            double lv = (giftPrice - winPrice);
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(lv));
        } else {
            double lvOff = winPrice - giftPrice;
            System.out.printf("She is left with %.0f leva.", Math.floor(lvOff));
        }
    }
}



