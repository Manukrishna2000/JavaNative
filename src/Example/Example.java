package Example;

public class Example {
    public static void main(String[] args) {
        Books fiction=new Books("harrypotter",2);
        Books novel=new Books("2 states",200);

        System.out.println(fiction.getName());
        System.out.println(novel.getName());
        System.out.println(novel.getRate());



        System.out.println(fiction.getRate());

    }
}
