package O34_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class eleman_silme {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        TreeSet <String> name = new TreeSet<>();
        name.add("fatma");
        name.add("selim");
        name.add("fuat");
        name.add("ayşegül");
        name.add("belkıs");

        System.out.println(name);
        name.remove("selim");
        System.out.println(name);

        HashSet <String> name2 = new HashSet<>();
        name2.add("ayşegül");
        name2.add("fuat");

        name.removeAll(name2);
        System.out.println(name);

        name.clear();
        System.out.println(name);
    }
}
