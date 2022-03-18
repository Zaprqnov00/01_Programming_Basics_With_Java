package ProgrammingBasicsWithJava.Exam2021;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int santaClausDaysOff = Integer.parseInt(scanner.nextLine());
        int foodsLeft = Integer.parseInt(scanner.nextLine());
        double foodsFirstAnimal = Double.parseDouble(scanner.nextLine());
        double secondFirstAnimal = Double.parseDouble(scanner.nextLine());
        double thirdFirstAnimal = Double.parseDouble(scanner.nextLine());

        double firstDeer = santaClausDaysOff * foodsFirstAnimal;
        double secondDeer = santaClausDaysOff * secondFirstAnimal;
        double thirdDeer = santaClausDaysOff * thirdFirstAnimal;

        double allNeedFood = firstDeer + secondDeer + thirdDeer;

        if (foodsLeft > allNeedFood){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodsLeft - allNeedFood));
        }else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(allNeedFood - foodsLeft));
        }
    }
}
