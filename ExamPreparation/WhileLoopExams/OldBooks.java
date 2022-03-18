package ProgrammingBasicsWithJava.WhileLoopExams;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String aniBook = scanner.nextLine();

        String searchBook = scanner.nextLine();

        int counterBooks = 0;
        while (!searchBook.equals("No More Books")){


            if (aniBook.equals(searchBook)){
                break;
            }

            counterBooks++;
            searchBook = scanner.nextLine();
        }
        if (searchBook.equals(aniBook)){
            System.out.printf("You checked %d books and found it.",counterBooks);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",counterBooks);
        }
    }
}
