package O41_TRY_CATCH;

import java.util.Scanner;

public class NumberFormatExceptionTryCatch {
    public static void main(String[] args) {
        System.out.println("----------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        String sayi = scan.nextLine();

        try {
            int sayi2 = Integer.parseInt(sayi);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("program çalışay bea");
        }

    }
}
