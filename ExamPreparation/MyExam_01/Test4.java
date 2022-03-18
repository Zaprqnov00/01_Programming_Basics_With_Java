package ProgrammingBasicsWithJava.Exam2021;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = Integer.parseInt(scanner.nextLine());

        int studentMaxGrade = 0;
        int studentNormalGrade = 0;
        int studentOkGrade = 0;
        int studentFailGrade = 0;
        double average = 0;

        for (int i = 1; i <= countStudent ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 5.00){
                studentMaxGrade++;
            }else  if (grade >= 4 && grade <= 4.99){
                studentNormalGrade++;
            }else if (grade >= 3 && grade <= 3.99){
                studentOkGrade++;
            }else {
                studentFailGrade++;
            }

            average = average + grade;

        }
        System.out.printf("Top students: %.2f%%\n",studentMaxGrade * 1.0/ countStudent * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",studentNormalGrade * 1.0/ countStudent * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",studentOkGrade * 1.0/ countStudent * 100);
        System.out.printf("Fail: %.2f%%\n",studentFailGrade * 1.0/ countStudent * 100);
        System.out.printf("Average: %.2f",average / countStudent);
    }
}
