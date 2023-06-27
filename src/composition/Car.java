package composition;

public class Car {
    private String name;
    private String color;

    private Engine engine;

    public Car(String name, String color, Engine engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }
    public void method(String year){
        System.out.println(year);

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }
}
