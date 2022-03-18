package ProgrammingBasicsWithJava.BonusExam;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double taxiPrize = 0.70;
        double taxiDay = 0.79;
        double taxiNight = 0.90;
        double busDayNight = 0.09;
        double trainDayNight = 0.06;
        double taxiTotalDay = taxiPrize + km * taxiDay;
        double taxiTotalNight = taxiPrize + km * taxiNight;
        double busTotal = busDayNight * km;
        double trainTotal = trainDayNight * km;

        if ( km < 20 && time.equals("day")) {
            System.out.printf("%.2f",taxiTotalDay);
        }else if (km < 20 && time.equals("night")){
            System.out.printf("%.2f",taxiTotalNight);
        }else if (km < 100) {
            System.out.printf("%.2f",busTotal);
        }else if (km > 100){
            System.out.printf("%.2f",trainTotal);
        }
    }
}
