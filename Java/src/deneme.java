public class deneme {
    public static void main(String[] args) {
        /*
        int sayi = 12;
        String sayi1 = Integer.toString(sayi);
        System.out.println(sayi1);

        String kullaniciAdi = "1256";
        int clinician1 = Integer.parseInt(kullaniciAdi);
        System.out.println(clinician1);

 */
/*
       int vize=45, fınal=80;
       double ort = (float) vize*0.4 + fınal*0.6;

       if(ort>60){
           System.out.println("öğrenci geçmiştir");
       }else if(ort==60){
           System.out.println("şartlı geçti");
       }else{
           System.out.println("kaldı ve şu ortalama ile = " + ort);
       }
*/

        //1-200 arasında bir while döngüsü yapıp çift sayıları 6 ile çarp tekleri 3 ile topla
/*
        int sayi = 1;
        while(sayi<=200){
            if(sayi%2==0){
                int cift = sayi*6;
                System.out.println(cift);
            }else{
                int tek= sayi+3;
                System.out.println(tek);
            }
            sayi++;
        }

 */
        // 1-50 arasındaki sayılardan çift olanları 2 ile çarp, tek olanları 3 ile çarp
/*
        int sayi=1;

        for(int i=1; i<=50;i++){
            if(sayi%2==0){
                System.out.println(i*2);
            }else{
                System.out.println(i*3);
            }
        }
*/
        //1-50 arasındaki asal sayıları buldurma

        //while döngüsü ile 1-10 arasındaki sayıları yazdırma

        int sayi=1;
        while(sayi<=10){
            System.out.print(" " + sayi);
            sayi++;
        }
        System.out.println(" ");

        System.out.println("-----------------------------------");
        System.out.println(" ");
        //for ile 1-10 arasındaki sayıları buldurma
        for(int i=1;i<=10;i++){
            System.out.print(" " + i);
        }

        System.out.println(" ");

        //do while ile 1-10 arasındaki sayıları buldurma
        int sayi1 = 1;
        do{
            System.out.print(" " + sayi1);
            sayi1++;

        }while(sayi1<=10);

        //faktöriyel hesaplatma

        int faktoriyel=1;
        for(int i=sayi;i>=i;i--){
            faktoriyel = faktoriyel * 1;
        }
        System.out.println(sayi + "in faktörieyli = " + faktoriyel);


    }
}
