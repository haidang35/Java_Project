package assignment.s3;

import java.util.ArrayList;

public class Cart {
    int id;
    String customer;
    double grandTotal;
    ArrayList productList = new ArrayList();
    String city;


    public Cart() {
        this.productList = productList;
    }

    public void themSanPham(String name){
           productList.add(name);
    }

    public void xoaSanPham(String name){
        for(int i=0;i<productList.size();i++){
            productList.remove(name);
        }
    }
    public void InSanPham(){
        for(int i=0;i<productList.size();i++){
            System.out.println(productList.get(i));
        }
    }
    public double grandTotal(){
        double tongTien;
        if(city == "HN" || city == "HCM")
            tongTien = grandTotal + (double)1/100*grandTotal;
        else
            tongTien =  grandTotal + (double)2/100*grandTotal;
        return tongTien;
    }



}
