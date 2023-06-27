package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle car=new Vehicle("volvo","black","2016");
        Vehicle.view(car.getName(), car.getColor(), car.getModel());

        Animal a=new Animal("Dog","brown");
        System.out.println(a.getName() + a.getColor());
        Bird b=new Bird("Sparrow","black",true);
        System.out.println(b.getName()+" " + b.getWings() +" "+  b.getColor());

        Mammal m=new Mammal("Human","brown",2);
        System.out.println(b.getName()+b.getColor()+b.getWings());

        Vehicle truck=new Vehicle("dfdf","black");
        System.out.println(truck.getName()+truck.getColor());


    }
}