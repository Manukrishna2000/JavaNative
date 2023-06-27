package collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {



        Map<String,String> emails=new HashMap<>();
        emails.put("manu","manu@gmail.com");
        emails.put("abc","abc@gmail.com");
        emails.put("jhh","isgds");
        System.out.println(emails.get("manu"));


        for (Map.Entry<String, String>entry:emails.entrySet())
        {
            String key= entry.getKey();
            String values= entry.getValue();
            System.out.println("key "+key+"  value "+values);

        }


//
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.forEach((i)-> System.out.println(i));
        System.out.println(colors.indexOf("red"));

        System.out.println(colors.contains("black"));
//        colors.remove("red");

//        colors.clear();
        System.out.println(colors.get(0));

        String[] names = {"red", "black", "orange", "white" };
        System.out.println(names[0]);

        String[] newnames=new String[5];

        for (int i=0;i<names.length;i++){
            newnames[i]=names[i];

        }
        newnames[4]="yellow";
        System.out.println(newnames[0]);
    }
}
