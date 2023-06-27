package Composition3;

public class Engine {
    private String model;
    private String power;
    private Interior interior;

    public Engine(String enginemodel, String power, Interior interior) {
        model = enginemodel;
        this.power = power;
        this.interior = interior;
    }

    public String getEnginemodel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public Interior getInterior() {
        return interior;
    }
}
