package O28_Sting_Siniflar;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        String metin = "Türkiye Cumhuriyeti";
        System.out.println(metin);

        int karakterSayisi = metin.length();
        System.out.println(karakterSayisi);

        System.out.println(metin.charAt(18)); //indeksler sıfırdan başlar

        System.out.println(metin.substring(5));

        System.out.println(metin.substring(3,9));

        System.out.println(metin.concat("Devleti"));

        System.out.println(metin.indexOf("Türkiye"));

        System.out.println(metin.indexOf("y",5));

        System.out.println(metin.lastIndexOf("e"));

        String metin2 = "fatma nur karsatar";

        System.out.println(metin2.equals(metin));

        System.out.println(metin2.trim());

        System.out.println(metin2.toLowerCase());
        System.out.println(metin2.toUpperCase());

       String harf = "c";
       String harf2 = "b";

       int compareTo1 = harf.compareTo(harf2);
        System.out.println(compareTo1);

        String replace = metin2.replace("a","ı");
        System.out.println(replace);




    }
}
