package O27_Diziler;

import java.util.Arrays;
import java.util.Random;

public class cok_boyutlu_dizi {
    public static void main(String[] args) {
        //1 mat, 2 türkçe , 3 fen
        int [][] sinifNotlari = new int[5][3];


        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                Random rd = new Random();
                int not = rd.nextInt(100)+1;
                sinifNotlari[i][j]=not;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                String dersIsmi="";
                if(j==0){
                    dersIsmi = "matematik";
                }else if(j==1){
                    dersIsmi = "türkçe";
                }else{
                    dersIsmi = "fen";
                }
                System.out.println((i+1) + " . öğrencimizin " + dersIsmi + " dersinin notu = " + sinifNotlari[i][j]);
            }
        }
    }
}
