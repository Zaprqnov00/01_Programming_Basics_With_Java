package ProgrammingBasicsWithJava.WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int weight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int sizeHouse = weight * length * height;
        int sum = 0;
        boolean isLost = false;

        String input = scanner.nextLine();

        while (!input.equals("Done")){
            int boxes = Integer.parseInt(input);

            sum = sum + boxes;

            if (sum >= sizeHouse){
                isLost = true;
                break;
            }

            input = scanner.nextLine();
        }
        int diff = Math.abs(sizeHouse - sum);
        if (isLost){
            System.out.printf("No more free space! You need %d Cubic meters more.",diff);
        }else {
            System.out.printf("%d Cubic meters left.",diff);
        }
    }
}
