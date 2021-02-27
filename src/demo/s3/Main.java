package demo.s3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // khai bao 1 mang arrInt so nguyen 3 pt
        int [] arrInt = new int[3];
        arrInt[0]=1;
        arrInt[1]=2;
        int[][] arrInt2= new int[3][4];
        arrInt2[0][0] = 3;
        arrInt2[1][2] = 5;

        ArrayList arrl = new ArrayList();
        arrl.add(1);
        arrl.add("Hello");
        for(int i=0;i< arrl.size();i++){
            System.out.println(arrl.get(i)); // tuong tu kieu arrL[i]
        }
        arrl.add(null);
        ArrayList<String> arrString = new ArrayList<String>();
        arrString.add("Xin chao");
        arrString.add("Hello");
//        ArrayList<int> arrIn = new ArrayList<int>();
//        arrIn.add(3);
        // boxing - unboxing - Integer
        Integer x = new Integer(5);
        x += 5;

        ArrayList<Integer> arrinteger = new ArrayList<Integer>();
        arrinteger.add(4);

        ArrayList<Dog> arrDog = new ArrayList<Dog>();
        Dog d1= new Dog();
        arrDog.add(d1);
        Dog d2= new Dog();
        arrDog.add(d2);
        // muon them 100 con cho nua vao tap hop
        for(int i=0;i<100;i++){
            arrDog.add(new Dog());
        }
        arrDog.get(100);// gia tri la 1 con cho - 1 doi tuong

        for(int i=0;i<arrDog.size();i++){
            arrDog.get(i).run();
        }
    }
}
