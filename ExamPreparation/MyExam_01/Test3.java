package ProgrammingBasicsWithJava.Exam2021;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kgShipment = Double.parseDouble(scanner.nextLine());
        String drive = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double priceKm = 0;

        if (drive.equals("standard")) {
            if (kgShipment < 1) {
                priceKm = km * 0.03;
            } else if (kgShipment > 1 && kgShipment < 10) {
                priceKm = km * 0.05;
            } else if (kgShipment >= 10 && kgShipment < 40) {
                priceKm = km * 0.10;
            } else if (kgShipment >= 40 && kgShipment < 90) {
                priceKm = km * 0.15;
            } else {
                priceKm = km * 0.20;
            }
        }else if (drive.equals("express")) {
            if (kgShipment < 1) {
                priceKm = km * 0.03 + 0.03 * 0.8 * kgShipment * km;
            } else if (kgShipment > 1 && kgShipment < 10) {
                priceKm = km * 0.05 + 0.05 * 0.4 * kgShipment * km;
            } else if (kgShipment >= 10 && kgShipment < 40) {
                priceKm = km * 0.10 + 0.10 * 0.05 * kgShipment * km;
            } else if (kgShipment >= 40 && kgShipment < 90) {
                priceKm = km * 0.15 + 0.15 * 0.02 * kgShipment * km;
            } else {
                priceKm = km * 0.20 + 0.20 * 0.01 * kgShipment * km;
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",kgShipment,priceKm);

    }
}
