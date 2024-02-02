package O38_Priority_queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        System.out.println("------------------");

        PriorityQueue <Integer> numbers = new PriorityQueue<>();
        numbers.add(5);
        numbers.add(8);
        numbers.offer(12);
        numbers.add(1);
        numbers.offer(4);
        System.out.println(numbers);

        System.out.println("------------------");

        System.out.println(numbers);
        Iterator <Integer> iter = numbers.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()*5);
        }
        System.out.println("------------------");
        System.out.println(numbers);
        System.out.println("ilk eleman = " + numbers.peek());

        System.out.println("----------eleman silme--------");
        System.out.println(numbers);
        System.out.println("ilk eleman = " + numbers.poll());
        //pool ile ilk elemana eriştik ve sildik

        System.out.println(numbers.toString());
        System.out.println(numbers.remove(5));
        System.out.println(numbers);

        System.out.println("------------------");
        iter=numbers.iterator();
        while(iter.hasNext()){
            System.out.println(numbers.poll());
        }
        System.out.println(numbers.toString());
    }
}
