package composition1;

public class Car {
    private String name;
    private Engine engine;
    private Interior interior;

    public Car(String name, Engine engine, Interior interior) {
        this.name = name;
        this.engine = engine;
        this.interior = interior;
    }

    public void method(){
    System.out.println(this.name);
        System.out.println(this.engine.getModel());
        System.out.println(this.engine.getRpm());
        System.out.println(this.interior.getColor());
        System.out.println(this.interior.getSeat());
}
    public String getName() {

        return name;
    }

    public Engine getEngine() {

        return engine;
    }

    public Interior getInterior() {
        return interior;
    }
}
