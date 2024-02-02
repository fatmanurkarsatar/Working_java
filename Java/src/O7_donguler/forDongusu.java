package O7_donguler;

public class forDongusu {
    public static void main(String[] args) {

        for(int i=0;i<101;i++){
            System.out.println(i);
        }

        System.out.println("--------------------------");

        int ciftToplam=0;
        int tektoplam=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
               ciftToplam = ciftToplam + i;
            }else{
                tektoplam = tektoplam + i;
            }
        }
        System.out.println("çift sayıların toplamı = " + ciftToplam);
        System.out.println("tek sayıların toplamı = " + tektoplam);

        System.out.println("---------------------------");

        //faktöriyel hesaplama

        int faktoriyel =1;
        for(int i=7;i>=1;i--){
            faktoriyel = i*faktoriyel;
        }
        System.out.println("7 nin faktöriyeli = " + faktoriyel);
    }
}
