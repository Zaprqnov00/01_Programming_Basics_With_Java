package ProgrammingBasicsWithJava.FirstStepInJava;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPage = Integer.parseInt(scanner.nextLine());

        int pages = Integer.parseInt(scanner.nextLine());

        int countDays = Integer.parseInt(scanner.nextLine());

        int timeBook = countPage / pages;

        int timePerDay = timeBook / countDays;

        System.out.println(timePerDay);

    }
}
