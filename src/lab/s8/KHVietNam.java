package lab.s8;

import java.util.Scanner;

public class KHVietNam extends KhachHang{
    public String doiTuongKH;


    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }


    public float tongTien(){
        float tongTien=0;
        if(getSoLuong()<=50)
            tongTien = getSoLuong()*1000;
        if(getSoLuong()>50 && getSoLuong()<=100)
            tongTien = (getSoLuong()-50)*1200+50*1000;
        if(getSoLuong()>100 && getSoLuong()<=200 )
            tongTien=(getSoLuong()-100)*1500+50*1200+50*1000;
        if(getSoLuong()>200)
            tongTien=(getSoLuong()-200)*2000+100*1500+50*1200+50*1000;
        return tongTien;
    }


}
