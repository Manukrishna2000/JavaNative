package inheritance1;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void x(){
        System.out.println(this.name);
        System.out.println(this.color);
    }

    public String getName(){

        return name;
    }
    public String getColor(){
        return color;
    }
}
