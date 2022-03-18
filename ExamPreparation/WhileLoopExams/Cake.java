package ProgrammingBasicsWithJava.WhileLoopExams;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int weight= Integer.parseInt(scanner.nextLine());
        int pieces = length * weight;

        String input = scanner.nextLine();
        boolean end = false;

        while (!input.equals("STOP")){
            int counter = Integer.parseInt(input);

            pieces -= counter;

            if (pieces < counter){
                end = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (end){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces));
        }else {
            System.out.printf("%d pieces are left.",pieces);
        }
    }
}
