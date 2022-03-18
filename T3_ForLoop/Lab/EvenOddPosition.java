package ProgrammingBasicsWithJava.ForLoop;

import java.util.Scanner;

public class EvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        double OddMin = Double.MAX_VALUE;
        double OddMax = Double.MIN_VALUE;
        double OddSum = 0;
        double EvenMin = Double.MAX_VALUE;
        double EvenMax = Double.MIN_VALUE;
        double EvenSum = 0;

        for (int i = 0; i < n; i++) {
            double number =  Double.parseDouble(scanner.nextLine());

           if (number > EvenMax){
               EvenMax = number;
           }else if (number < EvenMin){
               EvenMin = number;
           }
          EvenSum++;
        }

    }
}
