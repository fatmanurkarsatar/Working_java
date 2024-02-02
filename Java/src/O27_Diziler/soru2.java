package O27_Diziler;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
       //dışarıdan girilen 10 sayıyı büyükten küçüğe doğru
       //sıralayan kod

        int[] dizi = new int[10];
        for(int i=0;i<10;i++){
            Scanner scan = new Scanner(System.in);
            int sayi = scan.nextInt();
            dizi[i]=sayi;
        }
        String text = Arrays.toString(dizi);
        System.out.println(text);

        soru2 nesne = new soru2();
        nesne.sirala(dizi, text);
    }

    public void sirala(int[] dizi,String dizitext){

        for(int i=0;i<dizi.length;i++){
            for(int k=0;k<dizi.length-1;k++){
                if (dizi[k] > dizi[k+1]){
                    int gecici = dizi[k+1];
                    dizi[k+1] = dizi[k];
                    dizi[k] = gecici;
                }
            }
        }
        dizitext = Arrays.toString(dizi);
        System.out.println(dizitext);
    }

}
