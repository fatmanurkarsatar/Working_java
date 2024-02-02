package O36_QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class tanimi_metodlar {
    public static void main(String[] args) {

        System.out.println("---------------------------");
        Queue <String> kuyruk = new LinkedList<>();
        kuyruk.offer("kapsamlı");
        kuyruk.offer("java");
        kuyruk.offer("eğitimi");
        kuyruk.offer("Fatma Nur Karsatar");

        System.out.println(kuyruk.toString());

        String bas = kuyruk.peek(); //kuyruğun başını yazdı
        System.out.println(bas);

        String silinenEleman = kuyruk.poll();
        System.out.println(silinenEleman);
        System.out.println(kuyruk.toString());

    }

}
