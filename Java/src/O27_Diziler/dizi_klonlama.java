package O27_Diziler;

import java.util.Arrays;
import java.util.Random;

public class dizi_klonlama {
    public static void main(String[] args) {

        int[] dizi = new int[100];
        for(int i=0;i<dizi.length;i++) {
            Random rd = new Random();
            int sayi = rd.nextInt(1000) + 100;
            dizi[i] = sayi;
        }

        String Textt = Arrays.toString(dizi);
        System.out.println(Textt);
        int []clonedizi = dizi.clone();
        Textt = Arrays.toString(clonedizi);
        System.out.println(Textt);
        System.out.println(dizi[5]==clonedizi[5]);
        System.out.println(dizi[12]==clonedizi[12]);
        System.out.println(dizi[7]==clonedizi[7]);
        System.out.println(dizi[70]==clonedizi[70]);
        System.out.println(dizi[58]==clonedizi[58]);
        System.out.println(dizi[45]==clonedizi[45]);

        System.out.println(dizi==clonedizi);

    }
}
