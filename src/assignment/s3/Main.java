package assignment.s3;

public class Main {
    public static void main(String[] args){
        Product prod1 = new Product();
        prod1.setId(1);
        prod1.setProductName("Iphone XS Max");
        prod1.setQty(2);
        prod1.setPrice(30000);

        Product prod2= new Product();
        prod2.setId(2);
        prod2.setProductName("Samsung Galaxy S20");
        prod2.setQty(3);
        prod2.setPrice(18000);

        Cart ca = new Cart();
        ca.setId(1);
        ca.setCustomer("Nguyen Hai Dang");
        ca.setCity("HN");
        System.out.println("Danh sach san pham da mua: ");

        ca.themSanPham(prod1);
        ca.themSanPham(prod1);
        ca.themSanPham(prod2);
        for(Product sp: ca.productList){
            System.out.println(sp.productName);
        }
        System.out.println("Tong tien: "+ca.calgrandTotal());

    }
}
