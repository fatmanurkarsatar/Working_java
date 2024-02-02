package O34_TreeSet;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class ilk_eleman_son_eleman_alma {
    public static void main(String[] args) {

        System.out.println("------------------------------");
        TreeSet <Integer> sayilar = new TreeSet<>();
        sayilar.add(45);
        sayilar.add(46);
        sayilar.add(12);
        sayilar.add(23);
        sayilar.add(122);
        sayilar.add(630);
        sayilar.add(2);
        sayilar.add(98);
        sayilar.add(35);
        sayilar.add(94);
        sayilar.add(34);


        System.out.println(sayilar.first());
        System.out.println(sayilar.last());

        HashSet <Integer> sayi2 = new HashSet<>();
        sayi2.add(45);
        sayi2.add(11);
        sayi2.add(22);
        sayi2.add(33);

        //sayi2.first(); hata verir hashset sınıfında first ve last metodlarını
        //kullanamayız



    }
}
