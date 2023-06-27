public class Phone {
     private String name;
     private int size;
     public void playmusic(String track){
         System.out.println("playing"+track);
     }
     public void setName(String name){
         this.name=name;
     }
     public String getName() {
         return this.name;
     }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
