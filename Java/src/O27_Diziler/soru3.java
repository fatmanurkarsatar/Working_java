package O27_Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        //dışarıdan girilen 10 sayıyı küçükten büyüğe doğru
        //sıralayan kod

        int[] dizi = new int[10];
        for(int i=0;i<10;i++){
            Scanner scan = new Scanner(System.in);
            int sayi = scan.nextInt();
            dizi[i]=sayi;
        }
        String text = Arrays.toString(dizi);
        System.out.println(text);

        soru3 nesne = new soru3();
        nesne.sirala(dizi, text);
    }

    public void sirala(int[] dizi,String dizitext){
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi.length-1;j++){
                if (dizi[j] > dizi[j+1]){
                    int gecici = dizi[j+1];
                    dizi[j+1] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        dizitext = Arrays.toString(dizi);
        System.out.println(dizitext);
    }

}

