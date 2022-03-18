package ProgrammingBasicsWithJava.WhileLoopExams;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int days= 0;

        while (money < excursionPrice){
            String command = scanner.nextLine();
            double moneyLeft = Double.parseDouble(scanner.nextLine());
            days++;

            switch (command){
                case "spend":
                    money -= moneyLeft;
                    if (money < 0){
                        money = 0;
                    }
                    spendDays++;
                    break;
                case "save":
                    money += moneyLeft;
                    spendDays = 0;
                    break;
            }
             if (spendDays == 5){
                 break;
             }
        }
        if (money >= excursionPrice){
            System.out.printf("You saved the money for %d days.",days);
        }else {
            System.out.printf("You can't save the money.\n%d",days);
        }
    }
}
