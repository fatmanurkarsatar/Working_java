package O40_Exception;

public class NullPointerException extends Throwable {
    public static void main(String[] args) {

        String isim = null;
        System.out.println(isim.length());
    }
}
