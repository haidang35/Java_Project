package lab.s8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList extends Student{
    ArrayList<Student> stdList;

    public StudentList() {
        stdList= new ArrayList<>();
    }

    public void addStudent(Scanner sc){
        Student std=new Student();
        System.out.print("Nhap id: ");
        std.setId(sc.nextInt());
        System.out.print("Nhap ten: ");
        std.setName(sc.nextLine());
        System.out.print("Nhap tuoi: ");
        std.setAge(sc.nextInt());
        System.out.print("Nhap dia chi: ");
        std.setAddress(sc.nextLine());
        System.out.print("Nhap diem trung binh: ");
        std.setGpa(sc.nextFloat());
        stdList.add(std);
    }
    public void editStudent(int id, Scanner sc){
        for(Student ds: stdList){
            if(ds.getId()==id){
                System.out.print("Nhap ten: ");
                String name=sc.nextLine();
                ds.setName(name);
                System.out.print("Nhap tuoi so tuoi: ");
                int age=sc.nextInt();
                ds.setAge(age);
            }else{
                System.out.println("Khong tim thay sinh vien");
            }
        }
    }
    public void deleteStudent(int id){
        for(Student ds: stdList){
            if(ds.getId()==id){
                stdList.remove(ds);
            }
        }
    }
   public void sortByGoa(){
      for(int i=0; i<stdList.size()-1;i++){
          for(int j=0;j<stdList.size()-1-i;i++){
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
   public void showStudent(){
        for(Student ds: stdList){
            System.out.println("Id: "+getId());
            System.out.println("Name: "+getName());
            System.out.println("Address: "+getAddress());
        }
   }


}
