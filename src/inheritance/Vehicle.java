package inheritance;

public class Vehicle {
      private String name;
     private String color;
     private String model;



    public Vehicle(String name, String color, String model){
         this.name=name;
         this.color=color;
         this.model=model;

     }

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public static void view(String name, String color, String model){
         System.out.println(name);
         System.out.println(color);
         System.out.println(model);
     }
     public String getName(){

        return name;
     }
     public String getColor(){

        return color;
     }
     public String getModel(){

        return model;
     }

}
