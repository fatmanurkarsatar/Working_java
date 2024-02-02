import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tarih_buldurma {
    public static void main(String[] args) throws ParseException {
        //kullanıcıdan iki tane tarih al birbirinden çıkar arada kaç ay yıl gün var hesapla

        int a_yil, a_ay, a_gun, b_yil, b_ay, b_gun, c_yil, c_ay, c_gun;
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen ilk yılı giriniz: ");
        a_yil= scan.nextInt();
        System.out.println("lütfen ilk ayı giriniz: ");
        a_ay= scan.nextInt();
        System.out.println("lütfen ilk günü giriniz: ");
        a_gun= scan.nextInt();

        System.out.println("lütfen ikinci yılı giriniz:");
        b_yil = scan.nextInt();
        System.out.println("lütfen ikinci ayı giriniz: ");
        b_ay = scan.nextInt();
        System.out.println("lütfen ikinci günü giriniz: ");
        b_gun= scan.nextInt();

        c_yil = b_yil - a_yil;
        c_ay = b_ay - a_ay;
        c_gun = b_gun - a_gun;

        System.out.println("iki tarih arasındaki fark = " + c_gun + " gun" + "/" + c_ay + " ay" + "/" + c_yil + " yıl ");



        
    }
    }

