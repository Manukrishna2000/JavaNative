package challenge;

public class Patient {
    private String name;
    private int age;
    private Eye lefteye;
    private Eye righteye;
    private Heart heart;

    public Patient(String name, int age, Eye lefteye, Eye righteye, Heart heart) {
        this.name = name;
        this.age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.heart = heart;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eye getLefteye() {
        return lefteye;
    }

    public Eye getRighteye() {
        return righteye;
    }

    public Heart getHeart() {
        return heart;
    }
}
