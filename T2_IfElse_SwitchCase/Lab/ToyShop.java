package ProgrammingBasicsWithJava.IfElse;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzle = 2.60;
        int doll = 3;
        double toyBear = 4.10;
        double minion = 8.20;
        int truck = 2;


        double totalPrice = Double.parseDouble(scanner.nextLine());
        int countPuzzle = Integer.parseInt(scanner.nextLine());
        int countDoll = Integer.parseInt(scanner.nextLine());
        int countToyBear = Integer.parseInt(scanner.nextLine());
        int countMinion = Integer.parseInt(scanner.nextLine());
        int countTruck = Integer.parseInt(scanner.nextLine());

        double totalSize = puzzle * countPuzzle + doll * countDoll + toyBear * countToyBear + minion * countMinion + truck * countTruck;
        double countToy = countPuzzle + countDoll + countToyBear + countMinion + countTruck;
        if (countToy >= 50) {
            totalSize = totalSize * 0.75;
        }
        totalSize = totalSize * 0.90;

        if ( totalSize >= totalPrice){
            System.out.printf("Yes! %.2f lv left.",totalSize - totalPrice);

        }else{
            System.out.printf("Not enough money! %.2f lv needed.",totalPrice - totalSize);
        }
    }
}