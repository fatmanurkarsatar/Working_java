package O41_TRY_CATCH;


public class nullpointertrycatch {

    public static void main(String[] args) {
        System.out.println("--------------------");

        try {
            String isim = null;
            System.out.println(isim.length());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("program çalışıyor");
        }
    }
}
