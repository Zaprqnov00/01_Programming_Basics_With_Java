package ProgrammingBasicsWithJava.Exam2021Part2;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeCat = scanner.nextLine();
        String gender = scanner.nextLine();
        int catLife = 0;

        if (gender.equals("m")){
            if (typeCat.equals("British Shorthair")){
                catLife = 13;
            }else if (typeCat.equals("Siamese")){
                catLife = 15;
            }else if (typeCat.equals("Persian")){
                catLife = 14;
            }else if (typeCat.equals("Ragdoll")){
                catLife = 16;
            }else if (typeCat.equals("American Shorthair")){
                catLife = 12;
            }else {
                catLife = 11;
            }
        }
        if (gender.equals("f")){
            if (typeCat.equals("British Shorthair")){
                catLife = 14;
            }else if (typeCat.equals("Siamese")){
                catLife = 16;
            }else if (typeCat.equals("Persian")){
                catLife = 15;
            }else if (typeCat.equals("Ragdoll")){
                catLife = 17;
            }else if (typeCat.equals("American Shorthair")){
                catLife = 13;
            }else {
                catLife = 12;
            }
        }
        int humanMonths = catLife * 12;
        int catMonths = humanMonths / 6;

        if (!typeCat.equals("British Shorthair") && !typeCat.equals("Siamese") && !typeCat.equals("Persian") && !typeCat.equals("Ragdoll")
                && !typeCat.equals("American Shorthair") && !typeCat.equals("Siberian")){
            System.out.printf("%s is invalid cat!",typeCat);
        }else {
            System.out.printf("%.0f cat months",Math.floor(catMonths));
        }
    }
}
