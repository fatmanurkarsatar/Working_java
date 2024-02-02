package O33_HashSet_Class;

import java.util.ArrayList;
import java.util.HashSet;

public class eleman_ekleme {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        HashSet <String> dersler = new HashSet<>();
        dersler.add("matematik");
        dersler.add("fen");
        dersler.add("türkçe");
        dersler.add("fizik");
        dersler.add("edebiyat");
        dersler.add("matematik");

        System.out.println(dersler);

        ArrayList <String> kisi = new ArrayList<>();
        kisi.add("murat");
        kisi.add("melis");
        kisi.add("murat");
        kisi.add("fatma");

        System.out.println(kisi);

        System.out.println("--------------------");

        HashSet <Integer> sayi = new HashSet<>();
        sayi.add(5);
        sayi.add(15);
        sayi.add(45);
        sayi.add(45);
        sayi.add(95);
        sayi.add(100);

        System.out.println(sayi);

    }
}
