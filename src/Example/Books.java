package Example;

public class Books {
    private String name;
    private int rate;

    public Books(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}

