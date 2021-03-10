package lab.s7;

public class Main {
    public static void main(String[] args){
        News n=new News();
        n.setId(1);
        n.setTitle("ABC");
        n.setPublishDate("12/12/2020");
        n.setAuthor("Jinner");
        n.setContent("ABCDEF");
        n.Display();
        System.out.println("Sau khi danh gia: ");

        n.RateList.add(3);
        n.RateList.add(5);
        n.RateList.add(4);
        n.Calculate();
        n.Display();
    }
}
