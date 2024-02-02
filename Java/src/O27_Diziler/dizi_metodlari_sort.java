package O27_Diziler;

import java.util.Arrays;
import java.util.Random;

public class dizi_metodlari_sort {
    public static void main(String[] args) {
        int[] dizi = new int[10];

        for(int i=0;i<dizi.length;i++){
            Random rd = new Random();
            int sayi = rd.nextInt(100)+1;
            dizi[i]=sayi;
            System.out.println(sayi);
    }

        Arrays.sort(dizi);

        System.out.println("---------------------------");


    }
}
