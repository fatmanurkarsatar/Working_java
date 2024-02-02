package O27_Diziler;

public class diziyle_ilgili_islemler2 {

    public static void main(String[] args) {

        //diziye eleman ekleme

        String [] ogrenciler= new String[5];
        ogrenciler[0] = "ahmet";
        ogrenciler[1] = "serkan";
        ogrenciler[2] = "adnan";
        ogrenciler[3] = "aliye";
        ogrenciler[4] = "feris";
        // ogrenciler[5] = "selis"; hata verir

        //dizinin elemanlarına erişme
        for(int i=0;i<5;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------------------");

        //dizinin eleman sayısını buldurma
        System.out.println("dizinin boyutu = " + ogrenciler.length);
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
    }
}
