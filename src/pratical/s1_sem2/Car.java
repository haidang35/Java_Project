package pratical.s1_sem2;

public class Car implements Vehicle{
    private String name;
    @Override
    public float moveMax() {
       return 250;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
       return this.name;
    }
}
