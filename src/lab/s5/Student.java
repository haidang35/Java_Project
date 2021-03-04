package lab.s5;

import java.util.Scanner;

public class Student extends Person{
    public String maSV;
    public double diemThi;
    public String email ;

    public Student() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhapThongTin(Scanner sc){
        System.out.print("Nhap ma SV: ");
        setMaSV(sc.nextLine());
        System.out.print("Nhap diem thi: ");
        setDiemThi(sc.nextDouble());
        System.out.print("Nhap email: ");

        sc.nextLine();
        setEmail(sc.nextLine());

    }
    public void inThongTin(){
        System.out.println("Ma SV: "+getMaSV());
        System.out.println("Diem thi: "+getDiemThi());
        System.out.println("Email: "+getEmail());
    }
    public void kiemTraHocBong(){
        if(getDiemThi()>8){
            System.out.println("Sinh vien duoc hoc bong");
        }else{
            System.out.println("Sinh vien khong duoc hoc bong");
        }
    }

}
