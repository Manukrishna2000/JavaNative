package Composition3;

public class Car {
    private String name;
    private String model;

    private Engine engine;

    public Car(String name, String carmodel, Engine engine) {
        this.name = name;
        this.model = carmodel;
        this.engine = engine;
    }
public void methods(){
    System.out.println(this.name);
    System.out.println(this.model);
    System.out.println();
    System.out.println(this.getEngine().getEnginemodel());
    System.out.println(this.getEngine().getPower());
}

    public String getName() {
        return name;
    }

    public String getCarmodel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
