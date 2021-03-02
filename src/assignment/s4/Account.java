package assignment.s4;

public class Account {
    int id;
    String name;
    double soDu;

    public Account() {
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

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public boolean Credit(int amount){
        if(amount > 0){
            setSoDu(getSoDu()+amount);
            return true;
        }
        return false;
    }

    public void Debit(int amount){
        if(amount<getSoDu() && amount>0){
            setSoDu(getSoDu()-amount);
            System.out.println("Thanh toan thanh cong");
        }else
        System.out.println("Thanh toan khong thanh cong");
    }

    public void TranferTo(Account account, int tienChuyen){
        if(this.getSoDu()>tienChuyen && tienChuyen>0){
           Debit(tienChuyen);
           account.Credit(tienChuyen);

        }else
        System.out.println("Chuyen tien khong thanh cong");
    }

}
