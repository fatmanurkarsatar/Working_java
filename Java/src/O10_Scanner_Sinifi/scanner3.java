package O10_Scanner_Sinifi;

import java.util.Scanner;

public class scanner3 {

    public static void main(String[] args) {

        System.out.println("birinci sayıyı giriniz:");
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();

        System.out.println("ikinci sayıyı giriniz:");
        int sayi2 = scan.nextInt();

        topla(sayi1,sayi2);
        carp(sayi1,sayi2);
        bol(sayi1,sayi2);
        cikar(sayi1,sayi2);
    }

    public static void topla(int sayi1, int sayi2){
        System.out.println("sayıların toplamı = " + (sayi1+sayi2));
    }

    public static void carp(int sayi1, int sayi2){
        System.out.println("sayıların çarpımı = " + (sayi1*sayi2));
    }

    public static void bol(int sayi1, int sayi2){
        double d1 = Double.parseDouble("" + sayi1);
        double d2 = Double.parseDouble("" + sayi2);
        System.out.println("sayıların bölümü = " + (d1/d2));
    }

    public static void cikar(int sayi1, int sayi2){
        System.out.println("sayıların çıkarımı = " + (sayi1-sayi2));
    }
}
