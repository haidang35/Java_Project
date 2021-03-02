package assignment.s3;

import java.util.ArrayList;

public class Cart {
    int id;
    String customer;
    double grandTotal;
    ArrayList<Product> productList;
    String city;


    public Cart() {

        productList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void themSanPham(Product prod){
        if(prod.checkQty()){
            productList.add(prod);
            prod.setQty(prod.getQty()-1);
            setGrandTotal(getGrandTotal()+prod.price);
        }else
            System.out.println("Them san pham that bai");
    }

    public void xoaSanPham(int index){
        Product prod = productList.get(index);
        productList.remove(index);
        prod.setQty(prod.getQty()+1);
        setGrandTotal(getGrandTotal()-prod.price);
    }

    public double calgrandTotal(){
        if(getCity() == "HN" || getCity() == "HCM")
            return  grandTotal +grandTotal*1/100;
        else
            return  grandTotal + grandTotal*2/100;
    }



}
