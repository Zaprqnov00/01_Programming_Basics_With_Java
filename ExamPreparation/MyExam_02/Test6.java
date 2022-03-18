package ProgrammingBasicsWithJava.Exam2021Part2;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());
        int goldPerDay = 0;
        int averageGoldPerDay = 0;

        for (int i = 0; i < location ; i++) {
            double averageGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < days; j++) {
                goldPerDay++;
            }



        }
    }
}
