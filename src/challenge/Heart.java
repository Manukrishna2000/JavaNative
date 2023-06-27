package challenge;

public class Heart extends Organ {
    private String heartrate;

    public Heart( String medicalcond, String heartrate) {
        super( medicalcond);
        this.heartrate = heartrate;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("heart rate "+this.heartrate);
    }

    public String getHeartrate() {
        return heartrate;
    }
}
