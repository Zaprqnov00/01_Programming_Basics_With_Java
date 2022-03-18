package ProgrammingBasicsWithJava.BonusExam;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String petrol = scanner.nextLine();
        int litres = Integer.parseInt(scanner.nextLine());

        if (petrol.equals("Diesel") || petrol.equals("Gasoline") || petrol.equals("Gas")){
            if (litres >= 25) {
                System.out.println("You have enough " + petrol.toLowerCase() + ".");
            }else if (litres < 25) {
                System.out.println("Fill your tank with " + petrol.toLowerCase() + "!");
            }
            }else {
                System.out.println("Invalid fuel!");
        }
    }
}
