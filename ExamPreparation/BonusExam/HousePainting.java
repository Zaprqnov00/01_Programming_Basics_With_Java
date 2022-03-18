package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heightHouse = Double.parseDouble(scanner.nextLine());
        double lengthWall = Double.parseDouble(scanner.nextLine());
        double heightRoof = Double.parseDouble(scanner.nextLine());

        double lateralWall = heightHouse * lengthWall;
        double window = 1.5 * 1.5;
        double totalLateral = (2 * lateralWall) - (2 * window);
        double backWall = heightHouse * heightHouse;
        double entrance = 1.2 * 2;
        double totalDoor = 2 * backWall - entrance;
        double totalArea = totalLateral + totalDoor;
        double greenPaint = totalArea / 3.4;

        double twoRoof = 2 * (heightHouse * lengthWall);
        double twoTriangle = 2 * (heightHouse * heightRoof/2);
        double totalArea2 = twoRoof + twoTriangle;
        double redPaint = totalArea2 / 4.3;

        System.out.printf("%.2f\n",greenPaint);
        System.out.printf("%.2f",redPaint);
    }
}
