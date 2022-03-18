package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt( scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double totalP1 = P1 * hours;
        double totalP2 = P2 * hours;
        double totalFull = totalP1 + totalP2;;
        if (totalFull <= V) {
            double percentTotalFull = (totalFull / V * 100);
            double percentP1 = (totalP1 / totalFull * 100);
            double percentP2 = (totalP2 / totalFull * 100);
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percentTotalFull,percentP1,percentP2);
        }else{
            double overflow = totalFull - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hours,overflow);

        }
    }
}
