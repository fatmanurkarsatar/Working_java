package O35_LinkedHashSet;

import java.util.LinkedHashSet;

public class eleman_silme {
    public static void main(String[] args) {
        System.out.println("--------------------");

        LinkedHashSet<String> renkler = new LinkedHashSet<>();
        renkler.add("blue");
        renkler.add("red");
        renkler.add("pink");
        renkler.add("purple");
        renkler.add("yellow");
        renkler.add("black");

        System.out.println(renkler);

        System.out.println("-----------------");

        renkler.remove("pink");
        for (String renk:renkler) {
            System.out.println(renk);
        }

        System.out.println("----------------------");

        LinkedHashSet<String> renkler2 = new LinkedHashSet<>();
        renkler2.add("black");
        renkler2.add("blue");

        renkler.removeAll(renkler2);

        for (String renk:renkler) {
            System.out.println(renk);
        }

        System.out.println("-------------------");
        renkler.clear();
        System.out.println(renkler);

    }
}
