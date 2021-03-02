package assignment.s4_2;

public class Main {
    public static void main(String[] args){
        SinhVien std1 = new SinhVien();
        std1.setId(1);
        std1.setName("Nguyen Van A");
        std1.setPhoneNumber("0123456789");
        std1.setAddress("Ninh Binh");

        SinhVien std2 = new SinhVien();
        std2.setId(2);
        std2.setName("Nguyen Van B");
        std2.setPhoneNumber("0123456788");
        std2.setAddress("Ha Noi");

        LopHoc class1 = new LopHoc();
        class1.setIdClass(10);
        class1.setClassName("T2009M");
        class1.setRoomNumber("506");
        class1.addStudent(std1);
        class1.addStudent(std2);
        System.out.println("Danh sach sinh vien trong lop: ");
        class1.printStudentList();
    }
}
