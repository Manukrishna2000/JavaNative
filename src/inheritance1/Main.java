package inheritance1;

import inheritance.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter animal name");
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        System.out.println(name);
        System.out.println("enter Color");
        Scanner color=new Scanner(System.in);
        String col=color.next();


//        Animal b=new Animal("dog","brown");
        Bird a=new Bird(name,col,true);
        Mammal x=new Mammal("humane","brown",false,23);

        a.x();


    }
}
