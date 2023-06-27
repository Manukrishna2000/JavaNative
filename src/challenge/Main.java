package challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient a = new Patient("manu", 23, new Eye("shortsight", "blue", "left eye", true),
                new Eye("ok", "blue", "right eye", true),
                new Heart("ok", "20"));



        boolean finish = true;
        while (finish) {
            System.out.println("enter your choice" + "\n\t 1:left eye" + "\n\t 2:right eye" + "\n\t 3:Heart"+"\n\t 4:quit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    a.getLefteye().getdetails();
                    break;
                case 2:
                    a.getRighteye().getdetails();
                    break;
                case 3:
                    a.getHeart().getdetails();
                    break;
                case 4:
                    finish=false;
            }





        }
    }
}
