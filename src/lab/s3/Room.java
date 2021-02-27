package lab.s3;
import java.util.Scanner;

import java.util.ArrayList;

public class Room {
    String tenPhong;
    int viTri;
    ArrayList<String> dSNguoiDung = new ArrayList<String>();

    public Room(){

    }
    public void themNguoi(String add){
        dSNguoiDung.add(add);
    }
    public void xoaNguoi(String del){
        dSNguoiDung.remove(del);
    }
    public void InThongTin(){
        System.out.println("Ten phong: "+tenPhong);
        System.out.println("Vi tri phong: "+viTri);
        for(int i=0;i<dSNguoiDung.size();i++){
            System.out.println("User "+i+": "+dSNguoiDung.get(i));
        }
    }



}
