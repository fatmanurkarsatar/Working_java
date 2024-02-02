package O6_kontrol_yapilari;

public class ifKullanimi {
    public static void main(String[] args) {
        int sayi=10;
        if(sayi>0){
            System.out.println("pozitif bir sayıdır");

        }
        System.out.println("çalışma bitmiştir");

        int sayi2 = 45;
        int sayi3 = 10;
        if(sayi2>0){
            int sonuc = sayi2+sayi3;
            System.out.println(sonuc);
            System.out.println(sayi3-sayi2);
        }

        int sayi4 = 4512360;
        if(sayi4%2==0){
            int sonuc = sayi;
            System.out.println("sayı çifttir ve sonucu = " + sonuc);
        }

        //sayi5 eğer 10'un katıysa karesini al
        int sayi5 = 70;
        if(sayi5%10==0){
            int kare = sayi5*sayi5;
            System.out.println(kare);
        }

        //sayı hem 10 dan büyük hem de ikinin katı olacak

        int sayi6 = 55;
        if(sayi6>10 && sayi6%2==0){
            System.out.println("sayı hem 10'dan büyük hem de ikinin katı");
        }

        //sayı 0'dan küçük veya ikinin katıysa;
        int sayi7 = 45;
        if(sayi7<0 || sayi7%2==0){
            System.out.println("sayı hem 0 dan küçük hem de ikinin katı");
        }
        System.out.println("program çalışmadı bloğun yanlış");
    }
    }

