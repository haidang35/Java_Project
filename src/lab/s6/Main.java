package lab.s6;

public class Main {
    public static void main(String[] args){
        PhoneBook sdt1= new PhoneBook();
        sdt1.insertPhone("Jinner","0357446532");
        sdt1.insertPhone("Jinner","0357446533");
        sdt1.insertPhone("Jine","0123456789");
        System.out.println("Danh sach sau khi sap xep");
        sdt1.sort();

    }
}
