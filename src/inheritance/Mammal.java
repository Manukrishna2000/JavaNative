package inheritance;

public class Mammal extends Animal {
    private int x;
    public Mammal(String name, String color,int x) {
        super(name, color);
        this.x=x;
    }

    public int getX() {
        return x;
    }
}
