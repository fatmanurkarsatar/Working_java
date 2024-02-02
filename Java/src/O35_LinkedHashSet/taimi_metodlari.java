package O35_LinkedHashSet;

import java.util.LinkedHashSet;

public class taimi_metodlari {
    public static void main(String[] args) {
        System.out.println("----------------------");
        LinkedHashSet <Integer> sayi = new LinkedHashSet<>();
        sayi.add(56);
        sayi.add(63);
        sayi.add(32);
        sayi.add(97);
        sayi.add(63);
        sayi.add(null);
        sayi.add(96);

        System.out.println(sayi.toString());

    }
}
