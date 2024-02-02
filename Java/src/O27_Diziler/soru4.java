package O27_Diziler;

import java.util.Arrays;
import java.util.Random;

public class soru4 {
    public static void main(String[] args) {
        //5 elemanlı bir dizi tanımla dizinin tersten değerleri
        //aynı ise aynı farklı ise farklı yaz

        int[] dizi = new int[5];
        dizi[0] = 5;
        dizi[1] = 6;
        dizi[2] = 4;
        dizi[3] = 5;
        dizi[4] = 5;

/*
        System.out.println("----------------------");
        for(int i=dizi.length-1;i>=0;i--){ //diziyi tersten yazdırdı
            System.out.print(dizi[i]);

        }

 */
        boolean result=true;
        for(int i=0;i<(dizi.length/2);i++){
            int indis = dizi.length-(i+1);
            if(dizi[i]==dizi[indis]){

            }else{
                result = false;
            }
        }if(result==false){
            System.out.println("farklı");
        }else{
            System.out.println("aynı");
        }


    }
}
