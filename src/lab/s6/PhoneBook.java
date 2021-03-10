package lab.s6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{

    public ArrayList<PhoneNumber> PhoneList;
    public PhoneBook(){
        PhoneList=new ArrayList<>();

    }
    @Override
    public void insertPhone(String name, String phone) {

        for(PhoneNumber sdt: PhoneList){
            if(name.equals(sdt.getName())){
                    if(sdt.PhoneNumberList.contains(phone)){
                        sdt.addPhone(phone);
                    }
                    return;
            }
        }
        PhoneNumber sc=new PhoneNumber();
        PhoneList.add(sc);

    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber sll: PhoneList){
            if(sll.getName().equals(name)){
                PhoneList.remove(sll);
                return;
            }else{
                System.out.println("Xoa so lien lac that bai");
            }
        }
    }


    @Override
    public void updatePhone(String name,String oldphone, String newphone) {
         for(PhoneNumber sll: PhoneList){
//             if(sll.getName().equals(name)){
//                 for(String sdt: sll.PhoneNumberList){
//                     if(sdt==oldphone){
//                         sdt=newphone;
//                         return;
//                     }
//                 }
//             }
             sll.removePhone(oldphone);
             sll.addPhone(newphone);
         }
    }

    @Override
    public void searchPhone(String name) {
        for(PhoneNumber sdt: PhoneList){
            if(sdt.getName().equals(name)){
                System.out.println("So dien thoai cua "+name );
                for(String sll: sdt.PhoneNumberList){
                    System.out.println(sll);
                }
                return;
            }else{
                System.out.println("Khong tim thay so lien lac");
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());// tra ve ket qua strcmp
            }
        });
    }
}
