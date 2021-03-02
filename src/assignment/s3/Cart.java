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

    public ArrayList getProductList() {
        return productList;
    }

    public void setProductList(ArrayList productList) {
        this.productList = productList;
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
        Product prod = new Product();
        productList.remove(index);
        prod.setQty(prod.getQty()+1);
        setGrandTotal(getGrandTotal()-prod.price);
    }

    public double calgrandTotal(){
        if(city == "HN" || city == "HCM")
            return  grandTotal + (double)1/100*grandTotal;
        else
            return  grandTotal + (double)2/100*grandTotal;
    }



}
