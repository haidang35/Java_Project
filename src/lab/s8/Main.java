package lab.s8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
       ArrayList dsKH= new ArrayList();
       KHVietNam vn= new KHVietNam();
       vn.setHoTen("jinner");
       vn.setNgayRaHoaDon("12/12/2020");
       vn.setSoLuong(125);
       KHVietNam vn1= new KHVietNam();
       vn1.setHoTen("ABC");
       vn1.setNgayRaHoaDon("12/12/2020");
       vn1.setSoLuong(265);
       KHNuocNgoai nn= new KHNuocNgoai();
       nn.setHoTen("alex");
       nn.setQuocTich("UK");
       nn.setNgayRaHoaDon("12/12/2020");
       nn.setSoLuong(350);
       dsKH.add(vn);
       dsKH.add(vn1);
       dsKH.add(nn);
       int TongSLKHVN=0;
       int TongSLKHNN=0;
       int tongTien=0;
       int count=0;
       for(int i=0;i<dsKH.size();i++){
           if(dsKH.get(i) instanceof KHVietNam){
               TongSLKHVN+=((KHVietNam) dsKH.get(i)).getSoLuong();
           }else if(dsKH.get(i) instanceof KHNuocNgoai){
               TongSLKHNN+=((KHNuocNgoai) dsKH.get(i)).getSoLuong();
               tongTien+=((KHNuocNgoai) dsKH.get(i)).tongTien();
               count++;
           }
       }
       System.out.println("Tong so luong KHVN: "+TongSLKHVN);
       System.out.println("Tong so luong KHNN: "+TongSLKHNN);
       System.out.println("Trung binh thanh tien cua KHNN: "+tongTien/count);

    }
}
