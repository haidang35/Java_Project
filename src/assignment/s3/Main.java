package assignment.s3;

public class Main {
    public static void main(String[] args){
        Product prod1 = new Product();
        prod1.setQty(prod1.qty=10);

        Cart ca1= new Cart();
        ca1.id = 1;
        ca1.customer = "Nguyen Hai Dang";
        ca1.grandTotal = 65000;
        ca1.city = "HN";
        ca1.themSanPham("Macbook Pro");
        ca1.themSanPham("Realme 6 Pro");
        System.out.println("STT: "+ca1.id);
        System.out.println("Ten KH: "+ca1.customer);
        System.out.println("City: "+ca1.city);
        System.out.println("San pham da mua: ");
        ca1.InSanPham();
        System.out.println("Tong tien: "+ca1.grandTotal());
    }
}
