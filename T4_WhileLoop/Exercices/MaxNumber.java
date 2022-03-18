package ProgrammingBasicsWithJava.WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxNum = Integer.MIN_VALUE;
        while (!input.equals("Stop")){
            int numbers = Integer.parseInt(input);

            if (numbers > maxNum){
                maxNum = numbers;
            }

            input = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
