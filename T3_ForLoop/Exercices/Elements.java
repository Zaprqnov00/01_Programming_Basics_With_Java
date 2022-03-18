package ProgrammingBasicsWithJava.ForLoopExams;

import java.util.Scanner;

public class Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

       int maxNum = Integer.MIN_VALUE;
       int sum = 0;

        for (int i = 1; i <= n ; i++) {
             int numbers = Integer.parseInt(scanner.nextLine());
             sum += numbers;
             if (numbers > maxNum){
                 maxNum = numbers;
             }
        }
        sum = sum - maxNum;
        if (maxNum == sum){
            System.out.printf("Yes%nSum = %d",sum);
        }else {
            System.out.printf("No%nDiff = %d",Math.abs(maxNum - sum));
        }
    }
}
