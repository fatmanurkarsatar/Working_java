package O41_TRY_CATCH;

public class AritmetikExceptionTryCatch {


    public static void main(String[] args) {

        int sayi = 4;
        int sayi2 = 0;

        try{
            int bolme = sayi/sayi2;
            System.out.println(bolme);
        }catch(ArithmeticException e){
            System.out.println("hata"+e);
        }finally {
            System.out.println("program çalışıyo");
        }

    }
}
