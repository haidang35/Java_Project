package lab.s2_2;
import java.util.Scanner;
import java.lang.String;

public class Fraction{
    public int a;
    public int b;

    public Fraction() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void NhapPhanSo(){
        Scanner printer = new Scanner(System.in);
        int a;
        System.out.println("Nhap tu so: ");
        a=printer.nextInt();
        int b;
        System.out.println("Nhap mau so: ");
        b=printer.nextInt();
    }
    public void InPhanSo(){
        System.out.println(getA() + "/"+ getB());
    }


}
