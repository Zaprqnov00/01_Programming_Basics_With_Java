package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class PrognoseTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();

        if (time.equals("sunny")) {
            System.out.println("It's warm outside!");
        }else{
            System.out.println("It's cold outside!");
        }
    }
}
