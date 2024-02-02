package O6_kontrol_yapilari;

public class ifElseKullanimi {
    public static void main(String[] args) {
        int sayi = -50;

        if(sayi>0){
            System.out.println("sayı pozitiftir");
        }else{
            System.out.println("sayı negatiftir");
        }

        int sayi2 = 75;

        if(sayi2%2==0){
            System.out.println("sayı çifttir");
        }else{
            System.out.println("sayı tektir");
        }

        //sayı onun katıysa ikiyle çarp, değilse de 7 ile çarp
        int sayi3 = 101;
        if(sayi3%10==0){
            System.out.println(sayi3*2);
        }else{
            System.out.println(sayi3*7);
        }
    }
    }

