package ProgrammingBasicsWithJava.IfElse;

import java.util.Scanner;

public class SummationOfSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int racer1 = Integer.parseInt(scanner.nextLine());
        int racer2 = Integer.parseInt(scanner.nextLine());
        int racer3 = Integer.parseInt(scanner.nextLine());

        int totalTime = racer1 + racer2 + racer3;

        int min = totalTime / 60;
        int sec = totalTime % 60;

        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }
    }
}
