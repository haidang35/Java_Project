package pratical.s1_sem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Car c= new Car();
        System.out.print("Moi ban nhap ten xe oto: ");
        c.setName(sc.nextLine());
        System.out.println("Ten xe: "+c.getName());
        System.out.println("MaxSpeed: "+c.moveMax()+" km/h");
        Motor m= new Motor();
        System.out.print("Moi ban nhap ten xe motor: ");
        m.setName(sc.nextLine());
        System.out.println("Ten xe: "+m.getName());
        System.out.println("MaxSpeed: "+m.moveMax()+" km/h");
    }
}
