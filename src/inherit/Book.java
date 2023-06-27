package inherit;

public class Book {

   private String name;
   private int b;

   private String publish;

   public Book(String name,int b,String publish){
       this.name=name;
       this.b=b;
       this.publish=publish;
   }

   public void method1(String author){
       System.out.println(author);
   }
   public void method1(int d){
       System.out.println(d);
   }
    public Book(String name) {
        this.name = name;
    }
    //    public Book(String name) {
//        this.name = name;
//    }

    public String getName(){

       return name;
   }
   public String getPublish(){
       return publish;
   }

    public int getB() {
        return b;
    }


}
