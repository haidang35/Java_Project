package assignment.s4_2;

import java.util.ArrayList;

public class LopHoc{
    int idClass;
    String className;
    String roomNumber;
    ArrayList<SinhVien> students;

    public LopHoc() {
        students= new ArrayList<>();
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void addStudent(SinhVien stu){
        students.add(stu);
    }
    public void removeStudent(int index){
        students.remove(index);
    }
    public void printStudentList(){
        for(SinhVien std: students){
           System.out.println(std.getId()+" - "+std.getName()+" - "+std.getPhoneNumber()+" - "+std.getAddress());
        }
    }


}
