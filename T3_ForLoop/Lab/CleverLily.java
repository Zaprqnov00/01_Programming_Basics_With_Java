package ProgrammingBasicsWithJava.ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachine = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        double money = 0;
        double currentMoney = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0){
                toys++;
            }else {
                brother++;
                currentMoney = currentMoney + 10;
                money = money + currentMoney;
            }
        }
        double safeMoney = (toys * toysPrice) + money - brother;
        if (safeMoney >= washMachine){
            System.out.printf("Yes! %.2f",safeMoney - washMachine);
        }else {
            System.out.printf("No! %.2f",washMachine - safeMoney);
        }
    }
}
