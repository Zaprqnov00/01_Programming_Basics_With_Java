package ProgrammingBasicsWithJava.IfElse;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double swimmingTime = Double.parseDouble(scanner.nextLine());

        double ivanTime = distance * swimmingTime;
        double lag = Math.floor(distance / 15) * 12.5;
        double totalTime = ivanTime + lag;
        if (totalTime < sec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime - sec);
        }
    }
}
