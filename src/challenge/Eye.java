package challenge;

public class Eye extends Organ {
    private String color;
    private String eyename;

    private boolean isopened;

    public Eye( String medicalcond, String color, String eyename,boolean isopened) {
        super(medicalcond);
        this.color = color;
        this.eyename = eyename;
        this.isopened=isopened;
    }

    public void open(){
        this.setIsopened(true);
    }

    public void setIsopened(boolean isopened) {
        this.isopened = isopened;
    }


    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("eye color "+ this.color);
        System.out.println("eye name "+ this.eyename);
    }

    public String getColor() {
        return color;
    }

    public String getEyename() {
        return eyename;
    }

    public boolean isIsopened() {
        return isopened;
    }
}
