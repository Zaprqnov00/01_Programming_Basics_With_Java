package ProgrammingBasicsWithJava.ForLoopExams;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < n; i++) {
            double numbers = Double.parseDouble(scanner.nextLine());

            if (numbers % 2 == 0) {
                p1++;
            }
            if (numbers % 3 == 0) {
                p2++;
            }
            if (numbers % 4 == 0){
                p3++;
            }
        }
        System.out.printf("%.2f%%\n",p1 / n * 100);
        System.out.printf("%.2f%%\n",p2 / n * 100);
        System.out.printf("%.2f%%\n",p3 / n * 100);
    }
}
