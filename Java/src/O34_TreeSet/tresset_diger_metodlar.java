package O34_TreeSet;

import java.util.TreeSet;

public class tresset_diger_metodlar {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        TreeSet<Integer> sayilar2 = new TreeSet<>();
        sayilar2.add(45);
        sayilar2.add(56);
        sayilar2.add(-9);
        sayilar2.add(23);

        System.out.println(sayilar2);
        TreeSet <Integer> sayilar3 = (TreeSet<Integer>) sayilar2.clone();
        System.out.println(sayilar3);

        System.out.println(sayilar2.size());

        System.out.println(sayilar2.contains(56));

        sayilar2.clear();
        System.out.println(sayilar2);

        System.out.println(sayilar2.isEmpty());
    }
}
