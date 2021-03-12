package lab.s8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyHS {
    ArrayList<Student> stdList;
    public QuanLyHS() {
        stdList= new ArrayList<>();
    }

    public void addStudentToList(Student std){
        stdList.add(std);
    }
    public void editStudent( Scanner sc){
        System.out.print("Nhap vao id can tim: ");
        int id=sc.nextInt();
        for(Student ds: stdList){
            if(ds.getId()==id){
                System.out.println("Nhap vao cac thong tin muon sua");
                System.out.print("Nhap ten: ");sc.nextLine();
                String name=sc.nextLine();
                ds.setName(name);
                System.out.print("Nhap so tuoi: ");
                int age=sc.nextInt();
                ds.setAge(age);
                System.out.print("Nhap dia chi");sc.nextLine();
                String address=sc.nextLine();
                ds.setAddress(address);
                System.out.print("Nhap diem trung binh: ");
                float gpa=sc.nextFloat();
                ds.setGpa(gpa);
            }else{
                System.out.println("Khong tim thay sinh vien");
            }
        }
    }
    public void deleteStudent(Scanner sc){
        System.out.print("Nhap vao id can xoa: ");
        int id=sc.nextInt();
        for(int i=0;i<stdList.size();i++){
            if(id==stdList.get(i).getId()){
                stdList.remove(i);
            }
        }

    }
    public void sortByGoa(){
        for(int i=0; i<stdList.size()-1;i++){
            for(int j=1;j<stdList.size()-1-i;i++){
                if(stdList.get(j).getGpa()>stdList.get(j+1).getGpa()){
                    Student tmp= stdList.get(j);
                    stdList.set(j, stdList.get(j+1));
                    stdList.set(j+1, tmp);
                }
            }
        }
    }
    public void sortByName(){
        Collections.sort(stdList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public void showStudentList(){
        for(Student ds: stdList){
            ds.showStudent();
        }
    }
    public void Menu(){
        Student n;
        int choose;
        int stop;
        Scanner sc= new Scanner(System.in);

        do {
            System.out.println("----------------------------------------------");
            System.out.println("Quan ly hoc sinh: ");
            System.out.println("1 - them hoc sinh");
            System.out.println("2 - sua hoc sinh");
            System.out.println("3 - xoa hoc sinh");
            System.out.println("4 - sap xep hoc sinh hoc sinh theo gpa");
            System.out.println("5 - sap xep hoc sinh theo ten");
            System.out.println("6 - In ra danh sach hoc sinh");
            System.out.println("-----------------------------------------------");
            System.out.print("Moi ban nhap tuy chon: ");
            choose=sc.nextInt();
            switch (choose) {
                case 1:
                    n = new Student();
                    n.addStudent(sc);
                    addStudentToList(n);
                    stop=1;
                    break;
                case 2:
                    editStudent(sc);
                    stop=1;
                    break;
                case 3:
                    deleteStudent(sc);
                    stop=1;
                    break;
                case 4:
                    sortByGoa();
                    stop=1;
                    break;
                case 5:
                    sortByName();
                    stop=1;
                    break;
                case 6:
                    showStudentList();
                    stop=1;
                    break;
                default:
                    System.out.println("Ban da chon sai");
                    stop=1;
                    break;
            }
        }while (stop==1);



    }
}
