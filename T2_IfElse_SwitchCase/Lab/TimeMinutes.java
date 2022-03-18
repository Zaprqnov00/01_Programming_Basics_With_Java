package ProgrammingBasicsWithJava.IfElse;

import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        if (minute < 45) {
            System.out.printf("%d:%02d%n", hour, (minute + 15));
        }else if (hour == 23) {
            System.out.printf("0:%02d%n", (minute - 45));
        }else {
            System.out.printf("%d:%02d%n", (hour + 1), (minute - 45));
        }
    }
}
