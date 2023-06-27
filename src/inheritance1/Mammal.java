package inheritance1;

public class Mammal extends Bird {

    private int l;

    public Mammal(String name, String color, boolean wings, int l) {
        super(name, color, wings);
        this.l = l;
    }

    @Override
    public void x() {
        super.x();
        System.out.println(this.l);
    }

    public int getL() {
        return l;
    }
}
