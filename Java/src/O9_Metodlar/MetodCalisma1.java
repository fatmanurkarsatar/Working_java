package O9_Metodlar;

public class MetodCalisma1 {

    public static void main(String[] args) {

        CiktiBas();
        ayir();
        topla(12,45);
        ayir();
        nameSurname("Fatma Nur","Karsatar");
        ayir();
        faktoriyelHesapla(5);
        ayir();
        faktoriyelHesapla(7);
        ayir();
        toplam(5);
        ayir();
        toplam(10);

    }
    public static void CiktiBas(){
        System.out.println("kapsamlı java eğitimi");
    }

    public static void ayir(){

        System.out.println("-------------------------------");
    }

    public static void topla(int x, int y){
        System.out.println(x+y);
    }

    public static void nameSurname(String name, String surname){
        System.out.println(name + " "+ surname);
    }

    public static void faktoriyelHesapla(int sayi){
        int faktoriyel = 1;
        for(int i=sayi;i>=1;i--){
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi+ " in faktöriyeli = " + faktoriyel);
    }

    public static void toplam(int sayi){
        int toplam=0;
        for(int i=0;i<=sayi;i++){
            toplam = toplam + i;
        }
        System.out.println(sayi+ " ya kadar ( dahil ) sayıların toplamı = " + toplam);
    }


}
