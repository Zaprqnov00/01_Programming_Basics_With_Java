package ProgrammingBasicsWithJava.NestedLoop;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int studentTicket = 0;
        int standardTicket = 0;
        int kidTicket = 0;
        int totalTicket = 0;
        while (!input.equals("Finish")){
            String filmName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int allSeats = 0;
            String command = scanner.nextLine();
            while (!command.equals("End")){
                String typeTicket = command;

                allSeats++;
                totalTicket++;

                switch (typeTicket){
                    case "student":
                        studentTicket++;
                        break;
                    case "standard":
                        standardTicket++;
                        break;
                    case "kid":
                        kidTicket++;
                        break;
                }
                if (freeSeats == allSeats){
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n",filmName,allSeats * 1.0 / freeSeats * 100);

            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n",totalTicket);
        System.out.printf("%.2f%% student tickets.\n",studentTicket * 1.0 / totalTicket * 100);
        System.out.printf("%.2f%% standard tickets.\n",standardTicket * 1.0 / totalTicket * 100);
        System.out.printf("%.2f%% kids tickets.",kidTicket * 1.0 / totalTicket * 100);
    }
}
