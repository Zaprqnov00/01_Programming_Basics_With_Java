package ProgrammingBasicsWithJava.Exam2021;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int excursionSea = Integer.parseInt(scanner.nextLine());
        int excursionMountain = Integer.parseInt(scanner.nextLine());
        int sea = 680;
        int mountain = 499;
        int sum = 0;
        boolean isLost = false;

        String input = scanner.nextLine();

        while (!input.equals("Stop")){
            String packet = input;

            if (packet.equals("sea")){
                sum += sea;
                excursionSea--;
            }
            if (packet.equals("mountain")){
                sum += mountain;
                excursionMountain--;
            }
            if (excursionSea == 0 && excursionMountain == 0){
                break;
            }
            if (excursionSea + excursionMountain == 0){
                isLost = true;
                break;
            }


            input = scanner.nextLine();
        }
        if (isLost){
            System.out.printf("Good job! Everything is sold.\nProfit: %d leva.",sum);
        }else {
            System.out.printf("Profit: %d leva.",sum);
        }
    }
}
