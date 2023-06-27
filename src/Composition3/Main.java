package Composition3;

public class Main {
    public static void main(String[] args) {
        Interior i=new Interior("brown","cotton");
        Engine e=new Engine("2003","23",i);
//        Car volvo=new Car("volvo","sx",new Engine("2001","23",new Interior("black","leather")));
//        System.out.println(volvo.getName()+volvo.getCarmodel()+volvo.getEngine().getEnginemodel()+volvo.getEngine().getPower()+volvo.getEngine().getInterior().getColor()+volvo.getEngine().getInterior().getSeat());
    Car volvo=new Car("volvo","2004",e);
        volvo.methods();
    }
}
