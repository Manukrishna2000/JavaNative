package inherit;


import inheritance.Animal;

public class Main {
    public static void main(String[] args) {
        Book a=new Book("HARRY POTTER",200,"published");
        Book b=new Book("another book");
a.method1("kjhkjhdfa");
a.method1(20);

//        Book b=new Book("manu");
        System.out.println(a.getName());
        System.out.println(a.getB());
        System.out.println(b.getName());
        System.out.println(a.getPublish());
//        a.name="another book";
//        System.out.println(a.name);
    }
}
