package lab.s2;

public class SoNguyenTo {
    public int a=2;
    public boolean isSoNguyenTo(int x){
        if(x<2) return false;
//        int dem=0;
//        for(int i=2;i<x;i++){
//            if(x%i==0)
//                dem++;
//        }
//        if(dem==0)
//            return true;
//        return false;
        for(int i=2;i<x/2;i++){
            if(x%i==0) return false;
        }
        return true;

    }
    public void timSoNguyenToTiepTheo(){
//        int kq=0;
//        for(int i=a+1;i<1000;i++){
//            int dem=0;
//            for(int j=2;j<i;j++){
//                if(i%j==0)
//                    dem++;
//            }
//            if(dem==0){
//                kq=i;
//                break;
//            }
//
//        }
//        return kq;
        for(int i=a+1;true;i++){
            if(isSoNguyenTo(i)) {
                setA(i);
                return ;
            }
        }

    }
    public int getA(){
        return a;

    }
    public void setA(int a){
        for(int i=2;true;i++){
           if(isSoNguyenTo(i))
               this.a=a;
        }

    }


}
