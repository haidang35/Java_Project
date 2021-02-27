package lab.s2_2;
import java.util.Scanner;
import java.lang.String;

public class Fraction{
    public int tuSo;
    public int mauSo;

    public Fraction() {

    }
    
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public Fraction(int tuSo, int mauSo){
        this.tuSo=tuSo;
        this.mauSo=mauSo;
    }

    public void NhapPhanSo(Scanner sc){
        int a;
        int b;
        do{
            System.out.println("Nhap tu so: ");
            a = sc.nextInt();

            System.out.println("Nhap mau so: ");
            b= sc.nextInt();
            if(b==0)
                System.out.println("Mau so khong duoc bang 0. Yeu cau nhap lai:");
            else{
                tuSo=a;
                mauSo=b;
            }


        }while(b==0);

    }
    public void InPhanSo(){
        if(tuSo*mauSo<0)
            System.out.println("-"+Math.abs(tuSo)+"/"+Math.abs(mauSo));
        else if (tuSo*mauSo>0)
            System.out.println(Math.abs(tuSo)+"/"+Math.abs(mauSo));
    }

    public void  RutGonPhanSo(){
        int min=Math.min(tuSo,mauSo);
        int UCLN=0;
         for(int i=1;i<=min;i++){
             if(tuSo%i==0 && mauSo%i==0)
                 UCLN = i;
         }
         tuSo/=UCLN;
         mauSo/=UCLN;
    }
    public void NghichDaoPhanSo(){
        int temp=tuSo;
        tuSo=mauSo;
        mauSo=temp;
        if(mauSo==1)
            System.out.println("Nghich dao phan so: "+tuSo);
        else
        System.out.println("Nghich dao phan so: "+tuSo+"/"+mauSo);
    }
    public Fraction add(Fraction ps2){
        int a=getTuSo()*ps2.getMauSo()+ ps2.tuSo*mauSo;
        int b=mauSo* ps2.mauSo;
        return new Fraction(a, b);
    }
    public Fraction sub(Fraction ps2){
        int a=tuSo*ps2.mauSo - ps2.tuSo*mauSo;
        int b=mauSo* ps2.mauSo;
        return new Fraction(a, b);

    }
    public Fraction mul(Fraction ps2){
        int a=tuSo*ps2.tuSo;
        int b=mauSo*ps2.mauSo;
        return new Fraction(a,b);
    }
    public Fraction div(Fraction ps2){
        int a=tuSo*ps2.mauSo;
        int b=mauSo*ps2.tuSo;
        return new Fraction(a,b);
    }


}
