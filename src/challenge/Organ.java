package challenge;

public class Organ {
    private String medicalcond;

    public Organ( String medicalcond) {

        this.medicalcond = medicalcond;
    }

public void getdetails(){
    System.out.println("medical condition "+this.medicalcond);


}

    public String getMedicalcond() {

        return medicalcond;
    }
}
