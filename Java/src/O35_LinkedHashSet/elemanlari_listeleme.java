package O35_LinkedHashSet;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class elemanlari_listeleme {
    public static void main(String[] args) {
        System.out.println("--------------------");
        LinkedHashSet <String> renkler = new LinkedHashSet<>();
        renkler.add("blue");
        renkler.add("red");
        renkler.add("pink");
        renkler.add("purple");
        renkler.add("yellow");
        System.out.println(renkler);

        System.out.println("------------------");
        Iterator <String> iter = renkler.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("-------------------");
        for (String renk:renkler) {
            System.out.println(renk);

        }

        System.out.println("-------------------");
        renkler.forEach(System.out::println);

        System.out.println("-------------------");



    }
}
