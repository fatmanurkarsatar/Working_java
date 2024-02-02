package O33_HashSet_Class;

import java.util.HashSet;

public class arama_boyut_alma {
    public static void main(String[] args) {
        System.out.println("------------------------");
        HashSet <Integer> sayilar = new HashSet<>();
        sayilar.add(5);
        sayilar.add(43);
        sayilar.add(16);
        sayilar.add(62);
        sayilar.add(95);

        System.out.println(sayilar.contains(42));

        boolean kontrol = sayilar.contains(6);
        System.out.println(kontrol);

        int boyut = sayilar.size();
        System.out.println(boyut);

        HashSet <String> insanlar = new HashSet<>();
        insanlar.add("melis");
        insanlar.add("fuat");
        insanlar.add("murat");
        insanlar.add("fatih");
        insanlar.add("aybars");

        int boyut2 = insanlar.size();
        System.out.println(boyut2);

        if(boyut>boyut2){
            System.out.println("birinci hashSet'in boyutu daha büyük");
        }else if(boyut==boyut2){
            System.out.println("iki hashsetin boyutları eşittir");
        }else{
            System.out.println("ikinci hashSet'in boyutu daha büyük");
        }

    }
}
