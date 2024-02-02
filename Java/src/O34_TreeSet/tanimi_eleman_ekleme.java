package O34_TreeSet;

import java.util.TreeSet;

public class tanimi_eleman_ekleme {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        TreeSet <Integer> sayilar = new TreeSet<>();
        sayilar.add(5);
        sayilar.add(43);
        sayilar.add(82);
        sayilar.add(55);

        System.out.println(sayilar);

        TreeSet <Integer> sayilar2 = new TreeSet<>();
        sayilar2.add(45);
        sayilar2.add(56);
        sayilar2.add(-9);
        sayilar2.add(23);

        sayilar2.addAll(sayilar); //sayıları sayilar2 ye ekledik
        System.out.println(sayilar2);



    }
}
