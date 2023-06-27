package interface1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Electriccar a=new Electriccar();
        a.print("manu");
        a.move(23);
        a.start();

        Testinterface t=new Electriccar();
        t.print("sucess");


        Carinterface carinterface=new Electriccar();
        carinterface.start();
        carinterface.move(60);

    }


}
