package O34_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;
public class elemanlara_erisme {

    public static void main(String[] args) {

        System.out.println("---------------------");
        TreeSet <Integer> sayilar = new TreeSet<>();
        sayilar.add(56);
        sayilar.add(36);
        sayilar.add(91);
        sayilar.add(17);
        sayilar.add(31);

        System.out.println(sayilar);

        Iterator <Integer> iter = sayilar.iterator();

        while(iter.hasNext()){
            System.out.print(iter.next()*10);
            System.out.print(", ");
        }

        System.out.println("-----------------------");
        System.out.println(sayilar);
        for (Integer sayi: sayilar) {
            System.out.println(sayi*10);
        }

        System.out.println("-----------------------------");
        sayilar.forEach(x->{System.out.println(x*10);});

        }
    }

