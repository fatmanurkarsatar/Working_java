package O41_TRY_CATCH;

public class ArrayIndexOutOfBoundsExceptionTryCatch {
    public static void main(String[] args) {
        System.out.println("--------------------");

        int[] dd = new int[2];
        try {
            dd[0] = 10;
            dd[1] = 20;
            dd[2] = 30;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("program diyrum çalışay");
        }


    }
}
