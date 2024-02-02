package O6_kontrol_yapilari;

public class ifKullanimi2 {
    public static void main(String[] args) {
        int sayi1 = 15 , sayi2=20, sayi3=50;
        if(sayi1>0){
            System.out.println("sayi1 0 dan büyüktür");
            if(sayi1%3==0){
                System.out.println("sayi1 3'e tam bölünür");
                if(sayi2%2==0){
                    System.out.println("sayi2 çift sayıdır");
                    if((sayi3/10)%2==0){
                        System.out.println("sayı3'ün 10'a bölümü çifttir");

                    }
                }
            }
        }

        if(sayi1%sayi2==0)
        {
            int carpim = sayi3*sayi2;
            if(carpim%5==0)
            {
                System.out.println("şartlar sağlanmıştır");
            }
            System.out.println("sayı1 tek sayıdır");

        }
    }
}
