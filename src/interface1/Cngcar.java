package interface1;

public class Cngcar implements Carinterface,Testinterface{
    private String name;

    public Cngcar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {

    }

    @Override
    public void move(int speed) {

    }

    @Override
    public void print(String name) {

    }
}
