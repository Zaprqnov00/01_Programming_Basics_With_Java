package ProgrammingBasicsWithJava.IfElseExams;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();


       if (season.equals("summer")){
           if (budget <= 100){
               System.out.println("Somewhere in Bulgaria");
               budget = budget * 0.30;
               System.out.printf("Camp - %.2f",budget);
           }else if (budget > 100 && budget <= 1000) {
               System.out.println("Somewhere in Balkans");
               budget = budget * 0.40;
               System.out.printf("Camp - %.2f", budget);
           }else {
               System.out.println("Somewhere in Europe");
               budget = budget * 0.90;
               System.out.printf("Hotel - %.2f",budget);
           }
        }
       if (season.equals("winter")) {
           if (budget <= 100) {
               System.out.println("Somewhere in Bulgaria");
               budget = budget * 0.70;
               System.out.printf("Hotel - %.2f", budget);
           } else if (budget > 100 && budget <= 1000) {
               System.out.println("Somewhere in Balkans");
               budget = budget * 0.80;
               System.out.printf("Hotel - %.2f", budget);
           }else {
               System.out.println("Somewhere in Europe");
               budget = budget * 0.90;
               System.out.printf("Hotel - %.2f",budget);
           }
       }
    }
}