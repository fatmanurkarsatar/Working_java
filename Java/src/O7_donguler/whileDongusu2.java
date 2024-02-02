package O7_donguler;

public class whileDongusu2 {
    public static void main(String[] args) {
        //1-100 arasındaki çift sayıları while ile buldurma
        int sayi=1;
        while(sayi<101){
            if(sayi%2==0){
                System.out.println(sayi);
            }
            sayi++;
        }

        System.out.println("---------------------------------------");

        //1-50 arasındaki 3'ün katlarını buldur

        int sayi1=1;
        while(sayi1<51){
            if(sayi1%3==0){
                System.out.println(sayi1);
            }
            sayi1++;
        }
        System.out.println("------------------------------");

        //1-100 arasındaki sayılardan çift olanları 5 ile çarp tek olanları 10 ile yap
        int sayi2 = 1;
        while(sayi2<=100){
            if(sayi2%2==0){
                int cift = sayi2*5;
                System.out.println(cift);
            }else{
                int tek = sayi2*10;
                System.out.println(tek);
            }
            sayi2++;
        }
        System.out.println("---------------------");
        //1-100 arasındaki çift tek sayıları gör

        int sayi3 = 1;
        while(sayi3<=100){
            if(sayi3%2==0){
                int kare = sayi3*sayi3;
                System.out.println(sayi3 + " karesi = " + kare);
            }else{
                int kup = sayi3*sayi3*sayi3;
                System.out.println(sayi3 + " küpü = " + kup);
            }
            sayi3++;
        }
    }
}
