package O7_donguler;

public class DoWhileDongusu {
    public static void main(String[] args) {
        int sayi=1;
        while(sayi<12){
            System.out.println(sayi);
            sayi++;
        }
        System.out.println("---------------------");

        sayi=1;
        do{
            System.out.println(sayi);
            sayi++;
        }while(sayi<10);

        System.out.println("----------While Başladı------------");

        sayi=15;
        while(sayi<10){
            System.out.println(sayi);
            sayi++;
        }
        System.out.println("-----------Do-While Başladı-------------------");
        do{
            System.out.println(sayi);
            sayi++;
        }while(sayi<10);


        sayi = 5;
        int i = 1;
        int faktoriyel= 1;
        do{
            faktoriyel = i * faktoriyel;
            i++;
        }while(i<=sayi);
        System.out.println("faktöriyel = " + faktoriyel);

        sayi=5;
        faktoriyel = 1;
        do{
            faktoriyel = sayi*faktoriyel;
            sayi--;
        }while(sayi>=1);
        System.out.println("faktöriyel = " + faktoriyel);


        //sayı asal mı değil mi bulma
        sayi=5;
        i = 2;
        int toplam = 0;
        do{
            if(sayi%i==0){
                toplam++;
            }
            i++;
            if(sayi==2){
                toplam = 0;
            }
        }while(i<sayi);
        if(toplam==0){
            System.out.println("asal sayıdır");
        }else{
            System.out.println("asal sayı değildir");
        }

    }


    }

