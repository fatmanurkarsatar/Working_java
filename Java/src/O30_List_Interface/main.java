package O30_List_Interface;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> aile = new ArrayList<>();
        aile.add("elif");
        System.out.println(""+aile);

        ogrenci ogrenci1 = new ogrenci(45,"mero");
        ogrenci ogrenci2 = new ogrenci(78,"mehmet");
        ogrenci ogrenci3 = new ogrenci(12,"gülben");

        List<ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);
        ogrenciler.add(ogrenci3);
        System.out.println(""+ogrenciler.toString());

    }
}
