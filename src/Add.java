import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        System.out.println("hai");
        System.out.println("enter a number");
        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        System.out.println("enter another number");
        double b=scanner.nextDouble();
        double c=a+b;
        System.out.println("sum of two numbers is "+c);
    }
}
