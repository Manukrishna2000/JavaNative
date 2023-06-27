package Innerclass12;

public class Main {
    public static void main(String[] args) {
        Innerclass outer=new Innerclass();
        Innerclass.Inner inner=new Innerclass.Inner("jjhgdf","dgshgdf");
        System.out.println(inner.getA());
        System.out.println(inner.getB());
    }
}
