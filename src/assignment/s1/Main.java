package assignment.s1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int a;
        int b;
        int c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap a= ");
        a = sc.nextInt();
        System.out.println("Nhap b= ");
        b = sc.nextInt();
        System.out.println("Nhap c= ");
        c = sc.nextInt();
        Tamgiac Tg= new Tamgiac();
        Tg.CheckTamGiac(a,b,c);
        Tg.Chuvi(a,b,c);
        Tg.Dientich(a,b,c);

    }
}
