package assignment.s3;

public class Product {
    int id;
    String productName;
    int qty;
    double price;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty>0){
            this.qty = qty;
            System.out.println("San pham con hang");
        }
        else
            System.out.println("San pham het hang");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0)
            this.price = price;
    }
}
