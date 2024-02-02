package O10_Scanner_Sinifi;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı iste ve bunları karşılaştır

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int sayi1 = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = scan.nextInt();

        karsilastir(sayi1,sayi2);

    }
        public static void karsilastir(int sayi1, int sayi2){
            if(sayi1>sayi2){
                System.out.println(sayi1 + " büyüktür " + sayi2 + " den ");
            }else if(sayi1==sayi2){
                System.out.println("sayılar birbirine eşit");
            }else{
                System.out.println(sayi2 + " büyüktür " + sayi1 + " den ");
            }
        }


    }

