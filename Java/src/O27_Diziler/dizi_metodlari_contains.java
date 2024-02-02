package O27_Diziler;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class dizi_metodlari_contains {
    public static void main(String[] args) {

        Integer[] dizi = new Integer[10];
        for(int i=0;i<dizi.length;i++){
            Random rd = new Random();
            int sayi = rd.nextInt(100)+1;
            dizi[i]=sayi;
        }
        for(int i=0;i<dizi.length;i++){
            System.out.println(dizi[i]);
        }
        System.out.println(Arrays.asList(dizi).contains(5));

        System.out.println("--------------------------");
        String[] dizis = new String[3];
        dizis[0] = "kapsamlı";
        dizis[1] = "java";
        dizis[2] = "eğitimi";
        String diziText = Arrays.toString(dizis);
        System.out.println(diziText);

        boolean result = Arrays.asList(dizis).contains("kapsamlı");
        System.out.println(result);

        Double[] dizi3 = new Double[3];
        dizi3[0] = 2.5D;
        dizi3[1] = 4.5D;
        dizi3[2] = 6.5D;
        System.out.println(Arrays.asList(dizi3).contains(2.5D));


    }

}
