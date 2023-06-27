package Statics;

public class Main {
    public static void main(String[] args) {
        Innerclass outer = new Innerclass();

        // Create an instance of the private inner class using the factory method
        Innerclass.Testinnerclass inner = outer.print("Inner Instance");

        // Access methods and variables of the inner class
        inner.s();
        String name = inner.getName();

        System.out.println("Name: " + name);
    }
}
