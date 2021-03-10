package lab.s6;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> PhoneNumberList;
    public PhoneNumber(){
        PhoneNumberList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addPhone(String phone){
        this.PhoneNumberList.add(phone);
    }

    public void removePhone(String phone){
        this.PhoneNumberList.remove(phone);
    }
}
