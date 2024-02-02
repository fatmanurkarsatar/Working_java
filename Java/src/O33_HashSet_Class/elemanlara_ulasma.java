package O33_HashSet_Class;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class elemanlara_ulasma {
    public static void main(String[] args) {

        HashSet <String> hayvanlar = new HashSet<>();
        hayvanlar.add("köpek");
        hayvanlar.add("kedi");
        hayvanlar.add("kuş");
        hayvanlar.add("balık");
        hayvanlar.add("yılan");
        hayvanlar.add("sinek");

        System.out.println("----------iterator-while--------------");

        Iterator<String> iter = hayvanlar.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("---------for-each--------");

        for(String hayvan : hayvanlar){
            System.out.println(hayvan);

        }

        System.out.println("-----java 8 for each metodu-------");

        hayvanlar.forEach(System.out::println);

        ArrayList <String> hayvanlist = new ArrayList<>();
        hayvanlist.add("fok");
        hayvanlist.add("zebra");
        hayvanlist.add("zürafa");
        hayvanlist.add("kaplumbağa");
        hayvanlist.add("kurbağa");


        hayvanlist.forEach(System.out::println);



    }
}
