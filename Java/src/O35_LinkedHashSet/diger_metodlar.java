package O35_LinkedHashSet;

import java.util.LinkedHashSet;

public class diger_metodlar {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        LinkedHashSet <Integer> sayilar = new LinkedHashSet<>();
        sayilar.add(45);
        sayilar.add(88);
        sayilar.add(32);
        sayilar.add(15);
        System.out.println(sayilar.toString());

        LinkedHashSet <Integer> sayilar2 = new LinkedHashSet<>();
        sayilar2.add(95);
        sayilar2.add(82);
        sayilar2.add(11);
        System.out.println(sayilar2);

        sayilar.addAll(sayilar2);
        System.out.println(sayilar);


        System.out.println(sayilar.contains(45));

        System.out.println(sayilar.isEmpty());

        System.out.println(sayilar.clone());


    }
}
