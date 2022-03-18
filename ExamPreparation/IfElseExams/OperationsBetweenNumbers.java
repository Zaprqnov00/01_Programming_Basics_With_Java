package ProgrammingBasicsWithJava.IfElseExams;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int result = 0 ;


        if (operator.equals("+")) {
            result = n1 + n2;
            if (result % 2 == 0) {

                System.out.printf("%d +  %d  =  %d - even", n1,n2, result);
            } else {
                System.out.printf("%d +  %d = %d - odd", n1,n2, result);
            }

        } else if (operator.equals("-")) {
            result = n1 - n2;
            if (result % 2 == 0) {
                System.out.printf("%d - %d = %d - even", n1, n2, result);
            } else {
                System.out.printf("%d - %d = %d - odd", n1, n2, result);
            }

        } else if (operator.equals("*")) {
            result = n1 * n2;
            if (result % 2 == 0) {
                System.out.printf("%d * %d = %d - even", n1, n2, result);
            } else {
                System.out.printf("%d * %d = %d - odd", n1, n2, result);
            }
        } else if (operator.equals("/")) {
            result = n1 / n2;
            if (n2 != 0) {
                System.out.printf("%d / %d = %.2f", n1, n2, result);
            } else {
                System.out.printf("Cannot divine %d by zero", n1);
            }

        } else if (operator.equals("%")) {
            result = n1 % n2;
            if (n2 != 0) {
                System.out.printf("%d % %d = %.2f", n1, n2, result);
            } else {
                System.out.printf("Cannot divine %d by zero", n1);
            }
        }
        System.out.println(result);
    }
}

