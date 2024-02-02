package O34_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class ortakOlan_OrtakOlmayan_metodlar {
    public static void main(String[] args) {
        System.out.println("------------------");
        TreeSet <Integer> sayilar = new TreeSet<>();
        sayilar.add(89);
        sayilar.add(95);
        sayilar.add(47);
        sayilar.add(96);
        sayilar.add(35);
        sayilar.add(25);
        sayilar.add(52);
        sayilar.add(93);

        System.out.println(sayilar);
        TreeSet <Integer> sayilar2 = new TreeSet<>();
        sayilar2.add(96);
        sayilar2.add(65);
        sayilar2.add(35);
        sayilar2.add(12);
        sayilar2.add(39);
        sayilar2.add(52);
        sayilar2.add(69);
        sayilar2.add(23);

        System.out.println(sayilar2);

        System.out.println("-------------ortak elemanlar-----------");
        //sayilar.retainAll(sayilar2);
        //System.out.println("ortak elemanlar = " + sayilar);

        System.out.println("---------ortak olmayan elemanlar---------");
        sayilar.removeAll(sayilar2);
        System.out.println("ortak olmayan elemanlar = " + sayilar);


        System.out.println("------------------------------");
        HashSet <String> surname = new HashSet<>();
        surname.add("yılmaz");
        surname.add("çıkrıkçı");
        surname.add("karsatar");
        surname.add("halil");

        System.out.println(surname);

        HashSet <String> name = new HashSet<>();
        name.add("feriha");
        name.add("yılmaz");
        name.add("halil");
        name.add("ahmet");

        System.out.println(name);

        surname.retainAll(name);
        System.out.println("ortak olan elemanlar = " + surname);



    }
}
