package composition1;

public class Engine {
    private String model;
    private String rpm;

    public Engine(String model, String rpm) {
        this.model = model;
        this.rpm = rpm;
    }


    public String getModel() {
        return model;
    }

    public String getRpm() {
        return rpm;
    }



}
