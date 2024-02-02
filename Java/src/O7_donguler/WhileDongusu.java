package O7_donguler;

public class WhileDongusu {
    public static void main(String[] args) {

        int sayi=0;

        boolean sonuc = true;

        while(sayi<5){
            System.out.println("Kapsamlı java eğitimi");
            sayi = sayi+1;

        }

        int sayi2=1;
        while(sonuc==true){

            System.out.println("halo earth");
            if(sayi2==20){
                sonuc=false;
            }
            sayi2 = sayi2 + 1; //döngü her döndüğünde sayi2 bir artıyor

        }
        int sayi3 = 0;
        while(sayi3<100){
            sayi3++;
            System.out.print(sayi3);
        }

        int sayi4 = 10;

        while(sayi4<5){
            System.out.println("selam"); //while içindeki şart sağlanmadığı için döngüye hiç girilmedi
        }


    }
}
