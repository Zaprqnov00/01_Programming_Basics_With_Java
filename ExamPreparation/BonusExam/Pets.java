package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        double dogFoodNeed = days * dogFood;
        double catFoodNeed = days * catFood;
        double turtleFoodNeed = (days * turtleFood) / 1000;

        double totalFood = (dogFoodNeed + catFoodNeed + turtleFoodNeed);

        double kgLeft = Math.floor(food - totalFood);
        double kgOff = Math.ceil(totalFood - food);

        if (totalFood <= food){
            System.out.printf("%.0f kilos of food left.\n",kgLeft);
        }else{
            System.out.printf("%.0f more kilos of food are needed.",kgOff);
        }



    }
}
