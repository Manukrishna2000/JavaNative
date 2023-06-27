package Collection;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        String [] a={"red","black","green","brown","orange"};
//        System.out.println(a[0]);
//        String[] b=new String[6];
//        for (int i=0;i<a.length;i++){
//            b[i]=a[i];
//
//        }
//        b[5]="hhdf";
//        System.out.println(b[1]+b[5]);

//        ArrayList<String>names=new ArrayList<>();
//        names.add("ddfd");
//        names.add("hjhgjh");
//
//        names.remove("ddfd");
//        System.out.println(names.get(0));
//        System.out.println(names.contains("hjhgjh"));

        Map<String, Long> contacts=new HashMap<>();
        contacts.put("manu",894339723231L);
        contacts.put("jishnu",9048335932L);

        for(Map.Entry<String,Long> entry: contacts.entrySet()){
            String key= entry.getKey();
            Long value=entry.getValue();
            System.out.println("key:"+key+", value:"+value);
        }

        ArrayList<Emails> student=new ArrayList<>();
        student.add(new Emails("manu","1"));
        student.add(new Emails("x","2"));
        for (Emails s: student) {
            System.out.println(s.getName()+""+s.getId());

        }
    }
}
