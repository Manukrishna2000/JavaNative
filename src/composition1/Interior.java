package composition1;

public class Interior {
    private String color;
    private String seat;

    public Interior(String color, String seat) {
        this.color = color;
        this.seat = seat;
    }

    public String getColor() {
        return color;
    }

    public String getSeat() {
        return seat;
    }
}
