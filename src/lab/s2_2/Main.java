package lab.s2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Fraction ps1= new Fraction();
        Fraction ps2= new Fraction();
        Fraction psTong=new Fraction();
        Fraction psTru=new Fraction();
        Fraction psNhan=new Fraction();
        Fraction psChia=new Fraction();

        System.out.println("Nhap phan so thu  nhat: ");
        ps1.NhapPhanSo(sc);
        System.out.println("Nhap phan so thu  hai: ");
        ps2.NhapPhanSo(sc);

        psTong=ps1.add(ps2);

        System.out.println("Phan so thu nhat la: ");
        ps1.InPhanSo();
        System.out.println("Phan so thu hai la: ");
        ps2.InPhanSo();
        System.out.println("Tong hai phan so la: ");
        psTong.RutGonPhanSo();
        psTong.InPhanSo();
        System.out.println("Hieu hai phan so la: ");
        psTru=ps1.sub(ps2);
        psTru.RutGonPhanSo();
        psTru.InPhanSo();
        System.out.println("Tich hai phan so la: ");
        psNhan=ps1.mul(ps2);
        psNhan.RutGonPhanSo();
        psNhan.InPhanSo();
        System.out.println("Thuong hai phan so la:");
        psChia=ps1.div(ps2);
        psChia.RutGonPhanSo();
        psChia.InPhanSo();



    }
}
