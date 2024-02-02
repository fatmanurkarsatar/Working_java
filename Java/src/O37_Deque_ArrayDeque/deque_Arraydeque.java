package O37_Deque_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class deque_Arraydeque {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        //nesne oluşturma
        ArrayDeque <String> names = new ArrayDeque<>();
        //eleman ekleme
        names.add("fatma");
        names.add("pedri");
        names.add("cillian");
        names.add("altay");
        System.out.println(names);
        names.addFirst("Brad");
        names.addLast("george");
        System.out.println(names);

        //eleman ekleme - offer
        names.offer("gavi");
        names.offerFirst("mert hakan");
        names.offerLast("Zeliş");
        System.out.println(names);

        System.out.println("------------------");

        //get metodu kullanımı değer döndürme
        String ilkname = names.getFirst();
        String sonisim = names.getLast();
        System.out.println("ilk isim = " + ilkname + " " +  " son isim = " + sonisim);

        System.out.println("------------------");

        //peek metodu kullanımı
        String ilkisim = names.peekFirst();
        String sonisim2 = names.peekLast();
        System.out.println("ilk isim = " + ilkisim + " " + " son isim = " + sonisim2);

        System.out.println("------------------");

        //remove metodu kullanımı
        String ilksilinenisim = names.removeFirst();
        String sonsilinenisim = names.removeLast();
        System.out.println("ilk silinen isim = " + ilksilinenisim + " " + " son silinen isim = " + sonsilinenisim);
        System.out.println(names);

        System.out.println("------------------");

        //pool metodu kullanımı
        String ilksilinenisim2 = names.pollFirst();
        String sonsilinenisim2 = names.pollLast();
        System.out.println("ilk silinen isim = " + ilksilinenisim2 + " " + " son silinen isim = " + sonsilinenisim2);
        System.out.println(names);

        System.out.println("------------------");

        //iterator kullanımı - listeleme işlemi - elemaman erişim
        Iterator <String> iter = names.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("------------------------");

        names.add("ayşe");
        names.add("aliye");
        names.addFirst("arda");
        names.addLast("ahmet");
        Iterator <String> iter2 = names.descendingIterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }

    }
}
