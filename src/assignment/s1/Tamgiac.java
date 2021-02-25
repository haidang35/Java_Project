package assignment.s1;


public class Tamgiac {

      void CheckTamGiac(int a,int b, int c){
          if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a){
              System.out.println(a + "," + b +","+ c +" La 3 canh cua tam giac");
          }else{
              System.out.println(a + "," + b +","+ c + " Khong phai la 3 canh cua mot tam giac");
          }
      }
      void Chuvi(int a, int b, int c){
          if(a+b>c && a+c>b && b+c>a){
              int chuvi = a+b+c;
              System.out.println("Chu vi cua tam giac la: " + chuvi);
          }

      }
      void Dientich(int a, int b, int c){
          if(a+b>c && a+c>b && b+c>a){
              float p = (float)(a+b+c)/2;
              double Dientich;
              Dientich= Math.sqrt(p*(p-a)*(p-b)*(p-c));
              System.out.println("Dien tich cua tam giac la: " + Dientich);
          }

      }

}
