package ProgrammingBasicsWithJava.WhileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int minNum = Integer.MAX_VALUE;
        while (!input.equals("Stop")){
            int numbers = Integer.parseInt(input);

            if (numbers < minNum){
                minNum = numbers;
            }

            input = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
