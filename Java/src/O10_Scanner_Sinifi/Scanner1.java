package O10_Scanner_Sinifi;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        System.out.println("klavyeden veri girişi yapınız : ");
        Scanner scan = new Scanner(System.in);
        String veri = scan.nextLine();
        StringVeriTipi(veri);
        System.out.println("klavyeden veri girişi yapınız : ");
        Scanner sc = new Scanner(System.in);
        int veri2 = scan.nextInt();
        intVeriTipi(veri2);

    }

    public static void StringVeriTipi(String veri){
        System.out.println("Klavyeden girilen veri = " + veri);
    }

    public static void intVeriTipi(int veri2){
        System.out.println("50X" + veri2+ "=" + veri2*50);
    }
}
