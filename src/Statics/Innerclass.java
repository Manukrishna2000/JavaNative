package Statics;

public class Innerclass {
    private String x;
    class Testinnerclass{
        private String name;

        Testinnerclass(String name) {

            this.name = name;
        }


        public String getName() {
            return name;

        }
        public void s(){

            System.out.println(x);
        }
    }
    public void ex(){

    }
    public Testinnerclass print(String name){

        return new Testinnerclass(name);
    }

    public String getX() {
        return x;
    }
}
