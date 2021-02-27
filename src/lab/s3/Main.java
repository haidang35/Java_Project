package lab.s3;

public class Main {
    public static void main(String[] args){
        Room s1 = new Room();
        s1.tenPhong = "A5K51";
        s1.viTri = 302;
        s1.themNguoi("Nguyen Hai Dang");
        s1.themNguoi("Dang Jinner");
        s1.themNguoi("Nguyen Hai Dang 2");
        s1.xoaNguoi("Nguyen Hai Dang");
        s1.InThongTin();
    }
}
