package O27_Diziler;

import java.util.Random;

public class soru1 {
    public static void main(String[] args) {
        //en yüksek ortalamaya sahip öğrenciyi bul

        int ort=0;
        int indis =0;
        int buyuk=0;

        int [][] sinifNotlari = new int[10][3];

        for(int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                Random rd = new Random();
                int not = rd.nextInt(100)+1;
                sinifNotlari[i][j]=not;
            }
        }
        for(int i=0;i<10;i++){
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

                ort = ort + sinifNotlari[i][j];
            }
            ort = ort/3;
            if(ort>buyuk){
                buyuk = ort;
                indis = i+1;
            }
            ort = 0;
        }
        System.out.println("en başarılı öğrenci = " + indis);
        System.out.println("en yüksek ortalama = " + buyuk);
    }
}
