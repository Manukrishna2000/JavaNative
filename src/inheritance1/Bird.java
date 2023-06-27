package inheritance1;

public class Bird extends Animal{

    private boolean wings;

    public Bird(String name, String color,boolean wings) {
        super(name, color);
        this.wings=wings;
    }

    @Override
    public void x() {
        super.x();
        System.out.println(this.isWings());
    }

    public boolean isWings() {
        return wings;
    }
}
