public class Oop {
    public String name;

    public Oop(String name) {
        this.name = name;
    }

    public void playmusic(String trackname){
        System.out.println("playing"+trackname);
    }
    public void setName (String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

}
