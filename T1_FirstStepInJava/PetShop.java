package ProgrammingBasicsWithJava.FirstStepInJava;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDogs = Integer.parseInt(scanner.nextLine());

        int countAnimals = Integer.parseInt(scanner.nextLine());

        double AllDogsFood =countDogs * 2.50;

        double AllAnimalsFood = countAnimals * 4;

        double sum = AllDogsFood + AllAnimalsFood;

        System.out.println(sum + " lv.");



    }
}
