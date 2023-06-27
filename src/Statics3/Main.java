package Statics3;

public class Main {
    public static void main(String[] args) {
        Example.name="abc";
        Example a = new Example("23");
        Example b=new Example("24");
        System.out.println(a.getAge()+b.getAge());
        System.out.println(b.getName());

    }
}
