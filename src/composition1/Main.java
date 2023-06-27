package composition1;

public class Main {
    public static void main(String[] args) {
        Car a=new Car("volvo",new Engine("x","1000"),new Interior("black","leather"));
//        System.out.println(a.getEngine().getModel()+a.getEngine().getRpm()+a.getName()+a.getInterior().getColor()+a.getInterior().getSeat());
        a.method();
    }
}
