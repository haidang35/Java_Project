package pratical.adf2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ReservationSystem {
    public PriorityQueue<Passenger> listPassengers = new PriorityQueue<>();

    public void addReservation(Scanner sc){
        System.out.print("Nhập ID đặt chỗ: ");
        Integer id = sc.nextInt();
        System.out.print("Nhập tên hành khách: ");sc.nextLine();
        String namePassenger = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Nhập ngày đi và về: ");
        String returnDate = sc.nextLine();
        Passenger pas = new Passenger(id, namePassenger, address, phoneNumber, returnDate);
        listPassengers.add(pas);
    }
    public void modifyPassengerRecords(Scanner sc){
        System.out.println("Nhập vào ID muốn tìm kiếm: ");
        Integer id = sc.nextInt();
        for(Passenger pas: listPassengers){
            if(pas.getId() == id){
                System.out.println("Hành khách có ID: "+id+" là: ");
                System.out.println("Tên hành khách: "+pas.name);
                System.out.println("Địa chỉ: "+pas.getAddress());
                System.out.println("Số điện thoại: "+pas.getPhoneNumber());
                System.out.println("Ngày đi và về là: "+pas.returnDate);
            }
        }
    }
    public void displayPassengerRecords(){
        for(Passenger pas: listPassengers){
            System.out.println("ID hành khách: " + pas.getId());
            System.out.println("Tên hành khách" + pas.getName());
            System.out.println("Địa chỉ: " + pas.getAddress());
            System.out.println("Số điện thoại: " + pas.getPhoneNumber());
            System.out.println("Ngày đi và về: " + pas.getReturnDate());
            System.out.println("---------------------");
        }
    }
}
