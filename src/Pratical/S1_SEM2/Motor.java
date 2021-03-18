package Pratical.S1_SEM2;

public class Motor implements Vehicle{
    private String name;
    @Override
    public float moveMax() {
        float maxSpeed=150;
        return maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
         return this.name;
    }
}
