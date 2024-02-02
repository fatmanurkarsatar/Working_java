package O40_Exception;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
/*
        String sayi = "78";
        int sayiint = Integer.parseInt(sayi);
        System.out.println(sayiint+10);

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        String sayi = scan.nextLine();

        int sayiInt = Integer.parseInt(sayi);
        System.out.println(sayiInt);
    }
}
