package composition;

public class Main {
    public static void main(String[] args) {
        Car a=new Car("bmw","black",new Engine("x","2000"));
        System.out.println(a.getEngine().getModel());
        System.out.println(a.getEngine().getRpm());

    }
}
