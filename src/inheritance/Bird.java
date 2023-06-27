package inheritance;

public class Bird extends Animal{
    private boolean wings;

    public Bird(String name, String color, boolean wings) {
        super(name, color);
        this.wings = wings;
    }

    public boolean getWings() {

        return wings;
    }

}
