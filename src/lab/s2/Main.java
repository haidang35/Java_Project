package lab.s2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner printer=new Scanner(System.in);
        int a;
        System.out.println("Nhap so a: ");
        a=printer.nextInt();
        SoNguyenTo x= new SoNguyenTo();
        x.setA(a);
        System.out.println("Kiem tra so nguyen to: "+ x.isSoNguyenTo(a));

    }
}
