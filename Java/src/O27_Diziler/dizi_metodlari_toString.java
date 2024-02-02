package O27_Diziler;

import java.util.Arrays;
import java.util.Random;

public class dizi_metodlari_toString {
    public static void main(String[] args) {

        int [] dizi = new int[10];
        for(int i=0;i<dizi.length;i++){
            Random rd = new Random();
            int sayi = rd.nextInt(100)+1;
            dizi[i]=sayi;
        }
        String text = Arrays.toString(dizi);
        System.out.println(text);

        Arrays.sort(dizi);
        System.out.println("------------------------");

        String text2 = Arrays.toString(dizi);
        System.out.println(text2);
    }
}
