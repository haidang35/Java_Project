package Pratical.S1_SEM2;

public class Motor implements Vehicle{
    private String name;
    @Override
    public float moveMax() {
        return 150;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
         return this.name;
    }
}
