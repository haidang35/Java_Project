package lab.s5;

import java.util.Scanner;

public class Person{
    public String name;
    public String gioiTinh;
    public String ngaySinh;
    public String diaChi;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhap ho va ten: ");
        setName(sc.nextLine());
        System.out.print("Nhap gioi tinh: ");
        setGioiTinh(sc.nextLine());
        System.out.print("Nhap ngay sinh: ");
        setNgaySinh(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        setDiaChi(sc.nextLine());
    }
    public void inThongTin(){
        System.out.println("Ho va ten: "+getName());
        System.out.println("Gioi tinh: "+getGioiTinh());
        System.out.println("Ngay sinh: "+getNgaySinh());
        System.out.println("Dia chi: "+getDiaChi());
    }
}
