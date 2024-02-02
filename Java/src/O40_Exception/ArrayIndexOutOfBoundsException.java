package O40_Exception;

import java.util.ArrayList;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        int[] array = new int[4];
        array[0]=5;
        array[1]=10;
        array[2]=15;
        array[3]=20;
        //array[4]=25; hata verir

        System.out.println(array);

    }
}
