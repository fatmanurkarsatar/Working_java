package O18_OOP_kalitimdaKurucuMethodSuperKelimesi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();
        muhendis nur = new muhendis(isim);
        nur.adyyaz();

    }
}
