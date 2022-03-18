package ProgrammingBasicsWithJava.IfElseAdvanced;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        switch (product){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "grapes":
            case "lemon":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
