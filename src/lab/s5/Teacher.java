package lab.s5;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person{
    ArrayList<String> classList;
    public double income;
    public int numberLesson;
    ArrayList<String> lessonList;

    public Teacher() {
        classList = new ArrayList<>();
        lessonList = new ArrayList<>();
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getNumberLesson() {
        return numberLesson;
    }

    public void setNumberLesson(int numberLesson) {
        this.numberLesson = numberLesson;
    }

    public void nhapThongTin(Scanner sc){

        System.out.println("Nhap cac lop giang day:");
//        for(int i=0;i<5;i++){
//            classList.add(sc.nextLine());
//        }
        int choose;
        do{
            classList.add(sc.nextLine());
            System.out.println("Ban co muon nhap tiep khong (1-co || 2-khong)");
            choose=sc.nextInt();
            if(choose==1 || choose!=2){
                System.out.print("Moi ban nhap : ");
                classList.add(sc.nextLine());
            }
        }while(choose==1);

        sc.nextLine();
        System.out.print("Nhap muc luong: ");
        setIncome(sc.nextDouble());
        System.out.print("Nhap so mon giang day: ");
        setNumberLesson(sc.nextInt());
        System.out.print("Nhap cac mon giang day: ");
        sc.nextLine();
        for(int i=0;i<getNumberLesson();i++){
            lessonList.add(sc.nextLine());
        }



    }
    public void inThongTin(){
        System.out.println("DS lop giang day:");
        for(String dsl: classList){
            System.out.println(dsl);
        }
        System.out.println("Muc luong: "+getIncome());
        System.out.println("So mon giang day: "+getNumberLesson());
        System.out.println("Cac mon giang day: ");
        for(String cmd: lessonList){
            System.out.println(cmd);
        }

    }
}
