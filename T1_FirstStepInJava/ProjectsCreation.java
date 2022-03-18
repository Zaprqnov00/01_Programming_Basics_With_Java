package ProgrammingBasicsWithJava.FirstStepInJava;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String architectName = scanner.nextLine();

       int countProject = Integer.parseInt(scanner.nextLine());

       int totalHours = countProject * 3;

        System.out.println("The architect " + architectName + " will need " + totalHours + " hours to complete " + countProject + " project/s.");

    }
}
