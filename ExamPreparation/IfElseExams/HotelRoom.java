package ProgrammingBasicsWithJava.IfElseExams;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        double nights = Double.parseDouble(scanner.nextLine());

        double studio = 0;
        double apartment = 0;


        if (month.equals("May") || month.equals("October")) {
            studio = 50;
            apartment = 65;
            if (nights > 7 && nights < 14) {
                studio = studio * 0.95;
            } else if (nights > 14) {
                studio = studio * 0.70;
                apartment = apartment * 0.90;
            }
        }
        if (month.equals("June") || month.equals("September")){
            studio = 75.20;
            apartment = 68.70;
            if (nights > 14){
                studio = studio * 0.80;
                apartment = apartment * 0.90;
            }
        }
        if (month.equals("July") || month.equals("August")){
            studio = 76;
            apartment = 77;
            if (nights > 14){
                apartment = apartment * 0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n",nights * apartment);
        System.out.printf("Studio: %.2f lv.",nights * studio);
    }
}
