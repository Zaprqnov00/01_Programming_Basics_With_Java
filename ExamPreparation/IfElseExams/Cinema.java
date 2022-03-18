package ProgrammingBasicsWithJava.IfElseExams;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String project = scanner.nextLine();
        double r = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        double seats = r * c;

        if (project.equals("Premiere")) {
            sum = seats * 12.0;
        }else if (project.equals("Normal")) {
            sum = seats * 7.50;
        }else{
            sum = seats * 5.00;
        }
        System.out.printf("%.2f leva",sum);
    }
}
