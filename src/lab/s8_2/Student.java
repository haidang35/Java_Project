package lab.s8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public int age;
    public String address;
    public float gpa;
    ArrayList<Student> stdList;

    public Student() {
        stdList= new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void addStudent(Scanner sc){
        System.out.print("Nhap id: ");
        setId(sc.nextInt());
        System.out.print("Nhap ten: ");sc.nextLine();
        setName(sc.nextLine());
        System.out.print("Nhap tuoi: ");
        setAge(sc.nextInt());
        System.out.print("Nhap dia chi: ");sc.nextLine();
        setAddress(sc.nextLine());
        System.out.print("Nhap diem trung binh: ");
        setGpa(sc.nextFloat());
    }
    public void showStudent(){
        System.out.println("Id: "+getId());
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Address: "+getAddress());
        System.out.println("GPA: "+getGpa());
    }



}
