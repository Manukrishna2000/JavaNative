package Innerclass12;

public class Innerclass {
    private  String name;
    private String age;


     static class Inner{
        private String a;
        private String b;

        public void method(){
            System.out.println();

        }

        public Inner(String a, String b) {
            this.a = a;
            this.b = b;
        }

        public String getA() {
            return a;
        }

        public String getB() {
            return b;
        }
    }

}
