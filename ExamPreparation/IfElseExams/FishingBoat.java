package ProgrammingBasicsWithJava.IfElseExams;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (season.equals("Spring")) {
            sum = 3000;
            if (fishers <= 6) {
                sum *= 0.90;
            } else if (fishers <= 11) {
                sum *= 0.85;
            } else {
                sum *= 0.75;
            }
        }
        if (season.equals("Summer")) {
            sum = 4200;
            if (fishers <= 6) {
                sum *= 0.90;
            } else if (fishers <= 11) {
                sum *= 0.85;
            } else {
                sum *= 0.75;
            }
        }
        if (season.equals("Autumn")) {
            sum = 4200;
            if (fishers <= 6) {
                sum *= 0.90;
            } else if (fishers <= 11) {
                sum *= 0.85;
            } else {
                sum *= 0.75;
            }
        }
            if (season.equals("Winter")) {
                sum = 2600;
                if (fishers <= 6) {
                    sum *= 0.90;
                } else if (fishers <= 11) {
                    sum *= 0.85;
                } else {
                    sum *= 0.75;
                }
            }
            if (fishers % 2 == 0 && !season.equals("Autumn")){
                sum *= 0.95;
            }
            if (budget >= sum) {
                double input = budget - sum;
                System.out.printf("Yes! You have %.2f leva left.", input);
            }else {
                double output = sum - budget;
                System.out.printf("Not enough money! You need %.2f leva.",output);
            }
        }
    }