package interface1;

public class Electriccar implements Carinterface,Testinterface{

    @Override
    public void start() {
        System.out.println("started");
    }

    @Override
    public void move(int speed) {
        System.out.println("speed "+speed);

    }

    @Override
    public void print(String name) {
        System.out.println("name");
    }
}
