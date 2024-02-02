package O27_Diziler;

import java.util.Arrays;
import java.util.Random;

public class dizi_metodlari_indexOf {
    public static void main(String[] args) {
        Integer[] dizi = new Integer[10];

        for (int i = 0; i < dizi.length; i++) {
            Random rd = new Random();
            int sayi = rd.nextInt(100) + 1;
            dizi[i] = sayi;
            System.out.println(sayi);
        }
        String diziText = Arrays.toString(dizi);
        System.out.println(diziText);
        int result = Arrays.asList(dizi).indexOf(2);
        System.out.println(result);

        String []dizi2 =new String[5];
        dizi2[0] = "m";
        dizi2[1] = "e";
        dizi2[2] = "l";
        dizi2[3] = "i";
        dizi2[4] = "s";

        String diziText2 = Arrays.toString(dizi2);
        System.out.println(diziText2);

        result = Arrays.asList(dizi2).indexOf("e");
        System.out.println(result);
    }
}
