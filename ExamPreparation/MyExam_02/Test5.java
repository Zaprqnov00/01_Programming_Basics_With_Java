package ProgrammingBasicsWithJava.Exam2021Part2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKids = 0;
        int countAdults = 0;
        int sumToys = 0;
        int sumSweatshirt = 0;

        String command = scanner.nextLine();
        while (!command.equals("Christmas")){
            int age = Integer.parseInt(command);

            if (age <= 16){
                countKids++;
            }else {
                countAdults++;
            }

            sumToys = countKids * 5;
            sumSweatshirt = countAdults * 15;

            command = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d%n",countAdults);
        System.out.printf("Number of kids: %d%n",countKids);
        System.out.printf("Money for toys: %d%n",sumToys);
        System.out.printf("Money for sweaters: %d",sumSweatshirt);
    }
}
