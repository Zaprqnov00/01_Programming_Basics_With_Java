package ProgrammingBasicsWithJava.WhileLoopExams;

import java.util.Scanner;

public class ReadyForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());
        String problemExam = scanner.nextLine();
        int poorGrades = 0;
        boolean notGoodGrades = false;
        double totalScore = 0;
        int problems = 0;
        String lastProblem = "";

        while (!problemExam.equals("Enough")){
            int grade = Integer.parseInt(scanner.nextLine());
             totalScore += grade;
             problems++;
             lastProblem = problemExam;
            if (grade <= 4){
                poorGrades++;
                if (poorGradesLimit == poorGrades){
                    notGoodGrades = true;
                    break;
                }
            }

            problemExam = scanner.nextLine();
        }
        if (notGoodGrades){
            System.out.printf("You need a break, %d poor grades.",poorGrades);
        }else {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s",totalScore/problems,problems,lastProblem);
        }
    }
}
