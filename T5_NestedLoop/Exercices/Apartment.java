package ProgrammingBasicsWithJava.NestedLoop;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1 ; i--) {
            for (int j = 0; j < rooms ; j++) {

                String letter = "";
                if (i == floors){
                    letter = "L";
                }else if (i % 2 == 0){
                    letter = "O";
                }else {
                    letter = "A";
                }
                System.out.printf("%s%d%d ",letter,i,j);
            }
            System.out.println();
        }
    }
}
