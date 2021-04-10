package pratical.adf2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ReservationSystem {
    public PriorityQueue<Passenger> listPassengers;

    public ReservationSystem() {
        listPassengers = new PriorityQueue<Passenger>();
    }

    public void addReservation(Scanner sc){
        System.out.print("Nhập ID đặt chỗ: ");
        Integer id = sc.nextInt();
        System.out.print("Nhập tên hành khách: ");sc.nextLine();
        String namePassenger = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Nhập ngày đi: ");
        String goDate = sc.nextLine();
        System.out.print("Nhập ngày về: ");
        String returnDate = sc.nextLine();
        Passenger pas = new Passenger(id, namePassenger, address, phoneNumber, goDate, returnDate);
        listPassengers.add(pas);
    }
    public void setPassengerRecords(Scanner sc,int id){
        for(Passenger pas: listPassengers){
            if(pas.getId() == id){
                System.out.println("Thay đổi thông tin hành khách "+pas.getName());
                System.out.print("Tên hành khách: ");sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Địa chỉ: ");
                String address = sc.nextLine();
                System.out.print("Số điện thoại: ");
                String phoneNumber = sc.nextLine();
                System.out.print("Nhập ngày đi: ");
                String goDate = sc.nextLine();
                System.out.print("Ngày về: ");
                String returnDate = sc.nextLine();
                pas.setName(name);
                pas.setAddress(address);
                pas.setPhoneNumber(phoneNumber);
                pas.setGoDate(goDate);
                pas.setReturnDate(returnDate);
            }
        }
    }
    public void modifyPassengerRecords(Scanner sc){
        System.out.println("Nhập vào ID muốn tìm kiếm: ");
        int id = sc.nextInt();
        for(Passenger pas: listPassengers){
            if(pas.getId() == id){
                System.out.println("Hành khách có ID "+id+" là: ");
                System.out.println("Tên hành khách: " + pas.getName());
                System.out.println("Địa chỉ: "+pas.getAddress());
                System.out.println("Số điện thoại: "+pas.getPhoneNumber());
                System.out.println("Ngày đi là: " + pas.getGoDate());
                System.out.println("Ngày về là: "+pas.getReturnDate());
                System.out.println("Bạn có muốn thay đổi thông tin hành khách này hay không: ");
                System.out.println("Nhập: 0. Có ---- 1. Không");
                int choose = sc.nextInt();
                switch (choose){
                    case 0:
                        setPassengerRecords(sc, id);
                        break;
                    case 1:
                        break;
                }

            }
        }
    }
    public void displayPassengerRecords(){
       for(Passenger pas: listPassengers){
           System.out.println("ID hành khách: " + pas.getId());
           System.out.println("Tên hành khách: " + pas.getName());
           System.out.println("Địa chỉ: " + pas.getAddress());
           System.out.println("Số điện thoại: " + pas.getPhoneNumber());
           System.out.println("Ngày đi: " + pas.getGoDate());
           System.out.println("Ngày về: " + pas.getReturnDate());
           System.out.println("---------------------");
       }

    }
}
