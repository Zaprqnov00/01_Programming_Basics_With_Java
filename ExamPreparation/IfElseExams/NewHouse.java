package ProgrammingBasicsWithJava.IfElseExams;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        double countFlower = Double.parseDouble(scanner.nextLine());
        double allMoney = Double.parseDouble(scanner.nextLine());

        double result = 0;
        double roses = countFlower * 5;
        double dahlia = countFlower * 3.8;
        double tulips = countFlower * 2.8;
        double narcissus = countFlower * 3;
        double gladiolus = countFlower * 2.5;

        if (flower.equals("Roses")){
            if (countFlower > 80){
                result = roses * 0.90;
            }else{
                result = roses;
            }
        }
        if (flower.equals("Dahlias")){
            if (countFlower > 90) {
                result = dahlia * 0.85;
            }else {
                result = dahlia;
            }
        }
        if (flower.equals("Tulips")){
            if (countFlower > 80) {
                result = tulips * 0.85;
            } else {
                result = tulips;
            }
        }
        if (flower.equals("Narcissus")){
            if (countFlower < 120) {
                result = narcissus * 1.15;
            }else {
                result = narcissus;
            }
        }
        if (flower.equals("Gladiolus")){
            if (countFlower < 80) {
                result = gladiolus * 1.20;
            }else {
                result = gladiolus;
            }
        }
        if (allMoney >= result) {
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", countFlower, flower,allMoney-result);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",result - allMoney);
        }
    }
}
