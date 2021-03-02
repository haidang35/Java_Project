package assignment.s4;

public class Main {
  public static void main(String[] args){
      Account ac1= new Account();
      ac1.setId(1);
      ac1.setName("Nguyen Hai Dang");
      ac1.setSoDu(60000);

      Account ac2 = new Account();
      ac2.setId(2);
      ac2.setName("Jinner");
      ac2.setSoDu(20000);

      ac1.Credit(10000);
      ac1.Debit(25000);
      ac1.TranferTo(ac2, 20000);
      System.out.println("So tien cua tai khoan "+ ac1.getName()+": "+ac1.getSoDu());
      System.out.println("So tien cua tai khoan "+ ac2.getName()+": "+ac2.getSoDu());
  }

}
