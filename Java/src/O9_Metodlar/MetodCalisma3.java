package O9_Metodlar;

public class MetodCalisma3 {

    public static void main(String[] args) {
        System.out.println(topla(5, 9));
        System.out.println(SayiNedur(5));
        System.out.println(Sayii(0));
        System.out.println(kare(5));
         int kareSonuc = kare(5);
         onilecarp(kareSonuc);
    }

    public static int topla(int a, int b) {
        int toplam = a + b;
        return toplam;
    }


    //sayının tek mi çift mi olduğunu
    //boolean döndüren metot yaz
    public static Boolean SayiNedur(int sayi) {
        if (sayi % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //sayı pozitif mi negatif mi bul
    public static String Sayii(int sayi){
        if(sayi<0){
            return "pozitiftir";
        }else if(sayi==0){
            return "sıfıra eşittir";
        }else{
            return "sıfırdan küçüktür";
        }
    }

    //girilen sayının karesini alsın
    public static int kare(int sayi){
        return sayi*sayi;
    }

    public static void onilecarp(int sayi){
        System.out.println(sayi*10);
    }
}


