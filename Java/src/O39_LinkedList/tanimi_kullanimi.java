package O39_LinkedList;

import java.util.*;

public class tanimi_kullanimi {
    public static void main(String[] args) {
        System.out.println("---------------------------");

        LinkedList <Integer> linkedlist = new LinkedList<>();
        List<Integer> listInterface = new LinkedList<>();
        Queue <Integer> queueInterface = new LinkedList<>();
        //add ve addAll metodları var sadece queue de
        //queue da get metodu yok
        Deque <Integer> dequeInterface = new LinkedList<>();
        //queue de get metodu yok

        linkedlist.add(445);
        linkedlist.add(45);
        linkedlist.add(4);
        linkedlist.add(5);

        listInterface.add(776);
        listInterface.add(76);
        listInterface.add(7);
        listInterface.add(6);

        queueInterface.add(889);
        queueInterface.add(89);
        queueInterface.add(8);
        queueInterface.add(9);

        dequeInterface.add(112);
        dequeInterface.add(12);
        dequeInterface.add(1);
        dequeInterface.add(2);

        System.out.println("--------------------");

        Iterator <Integer> iterlinkedlist = linkedlist.iterator();
        Iterator <Integer> iterlistInterface = listInterface.iterator();
        Iterator <Integer> iterqueueInterface = queueInterface.iterator();
        Iterator <Integer> iterdequeInterface = dequeInterface.iterator();


        while(iterlinkedlist.hasNext()){
            System.out.println(iterlinkedlist.next());
        }
        System.out.println("--------------------");
        while(iterlistInterface.hasNext()){
            System.out.println(iterlistInterface.next());
        }
        System.out.println("--------------------");
        while(iterqueueInterface.hasNext()){
            System.out.println(iterqueueInterface.next());
        }
        System.out.println("--------------------");
        while(iterdequeInterface.hasNext()){
            System.out.println(iterdequeInterface.next());
        }


        System.out.println("-----------------------");
        System.out.println("-----------------------");

        ListIterator <Integer> iterlinkedlist2 = linkedlist.listIterator();
        ListIterator <Integer> iterlist2 = listInterface.listIterator();
        //ListIterator <Integer> iterqueue2 = iterqueueInterface.listIterator(); bu yeteneğe sahip değil
        //ListIterator <Integer> iterdeque2 = iterdequeInterface.listIterator(); bu yeteneğe sahip değil

        while(iterlinkedlist2.hasPrevious()){
            System.out.println(iterlinkedlist2.previous());
        }
        System.out.println("--------------------");
        while(iterlist2.hasPrevious()){
            System.out.println(iterlist2.previous());
        }

        linkedlist.remove();
        listInterface.remove(1);
        queueInterface.remove();
        dequeInterface.remove();

        linkedlist.removeFirst();
        //listInterface.removeFirst(); bu yeteneğe sahip değil
        //queueInterface.removeFirst(); //bu yeteneğe sahip değil
        dequeInterface.removeFirst();


    }
}
