package ProgrammingBasicsWithJava.WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String name = scanner.nextLine();

        int study = 1;
        double sum = 0;
        int off = 0;

        while (study <= 12){
            if (off > 1){
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4){
                off++;
                continue;
            }
            sum = sum + grade;

            study++;
        }
        if (off > 1){
            System.out.printf("%s has been excluded at %d grade",name,study);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }
    }
}
