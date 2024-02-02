package O33_HashSet_Class;

import java.util.ArrayList;
import java.util.HashSet;

public class eleman_silme {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        HashSet <String> renk = new HashSet<>();
        renk.add("mavi");
        renk.add("mor");
        renk.add("pembe");
        renk.add("yeşil");
        renk.add("turuncu");
        renk.add("kırmızı");
        renk.add("sarı");

        System.out.println(renk);

        renk.remove("mavi");
        System.out.println(renk);

        System.out.println("--------------------");

       HashSet <String> ulke = new HashSet<>();
       ulke.add("turkiye");
       ulke.add("ingiltere");
       ulke.add("fransa");
       ulke.add("almanya");
       ulke.add("kazakistan");
       ulke.add("çin");
        System.out.println(ulke);
        ulke.removeAll(ulke);
        System.out.println(ulke);

        ulke.add("britanya");
        ulke.add("rusya");
        ulke.add("belçika");
        System.out.println(ulke);

        ArrayList <String> silinecekUlkeler = new ArrayList<>();
        silinecekUlkeler.add("rusya");
        silinecekUlkeler.add("britanya");

       ulke.removeAll(silinecekUlkeler);
        System.out.println(ulke);

        ulke.clear();
        silinecekUlkeler.clear();
        renk.clear();
        System.out.println(ulke);
        System.out.println(silinecekUlkeler);
        System.out.println(renk);



    }
}
