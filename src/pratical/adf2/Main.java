package pratical.adf2;

import java.net.Inet4Address;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        ReservationSystem rs = new ReservationSystem();
        while (run){
            System.out.println("Menu Booking Reservation ARS");
           System.out.println("1. Add reservation");
           System.out.println("2. Modify passenger records");
           System.out.println("3. Display passenger records");
           System.out.println("4. Exit");
           System.out.println("-----------------------------");
           System.out.print("Mời bạn chọn menu: ");
           int choose = sc.nextInt();
           switch (choose){
               case 1:
                   rs.addReservation(sc);
                   break;
               case 2:
                   rs.modifyPassengerRecords(sc);
                   break;
               case 3:
                   rs.displayPassengerRecords();
                   break;
               case 4:
                   run = false;
                   break;
           }
        }
    }

}
