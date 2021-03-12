package lab.s8;

import java.util.Scanner;

public class KHNuocNgoai extends KhachHang{
    public String quocTich;



    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public float tongTien(){
        float tongTien=0;
        tongTien=getSoLuong()*2000;
        return tongTien;
    }

}
