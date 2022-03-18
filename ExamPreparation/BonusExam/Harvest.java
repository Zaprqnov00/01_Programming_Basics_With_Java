package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrapes = X * Y;
        double wine = (totalGrapes / 2.5) * 0.4;

        if (wine >= Z){
            double leftWine = (wine - Z);
            double personWine = (leftWine / countWorkers);
            //	Резултатът трябва да е закръглен към по-ниско цяло число
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",Math.floor(wine));
            //	И двата резултата трябва да са закръглени към по-високото цяло число
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(leftWine),Math.ceil(personWine));
        }else{
            double freeWine = (Z - wine);
            //	Резултатът трябва да е закръглен към по-ниско цяло число
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(freeWine));
        }
    }
}
