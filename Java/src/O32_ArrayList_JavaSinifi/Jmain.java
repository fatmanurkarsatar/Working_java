package O32_ArrayList_JavaSinifi;

import java.util.ArrayList;

public class Jmain {
    //murat yazılım mühendisi yaşı 27 maaşı 50.000
    public static void main(String[] args) {

        kisi kisi1 = new kisi("fatma","yazılım geliştirici", 25, 25000);
        kisi kisi2 = new kisi("abdullah","yazılım mühendisi", 27, 45000);
        kisi kisi3 = new kisi("Zişan","yazılım mühendisi", 25, 35000);
        kisi kisi4 = new kisi("Nurullah","yazılım geliştirici", 29, 45000);
        kisi kisi5 = new kisi("ömer","yazılım geliştirici", 24, 25000);

        ArrayList <kisi> Kisiler = new ArrayList<>();
        Kisiler.add(kisi1);
        Kisiler.add(kisi2);
        Kisiler.add(kisi3);
        Kisiler.add(kisi4);
        Kisiler.add(kisi5);

        System.out.println(Kisiler.toString());

        for(int i=0;i<Kisiler.size();i++){
            System.out.println(Kisiler.get(i).getIsim());
            System.out.println(Kisiler.get(i).getMeslek());

        }

    }
}
