package lab.s5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Person per = new Person();
        per.nhapThongTin(sc);
        per.inThongTin();

        Student st1= new Student();
        st1.nhapThongTin(sc);
        st1.inThongTin();
        st1.kiemTraHocBong();

        Teacher tc = new Teacher();
        tc.nhapThongTin(sc);
        tc.inThongTin();
    }
}
