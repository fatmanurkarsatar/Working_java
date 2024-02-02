package O8_local_global_degiskenler;

public class localAndGlobalDegiskenler {
    static int sonuc=0;
    public static void main(String[] args) {

        //local değişken örneği
        for(int i=1; i<=100;i++){
            int sonuc = 0;
            sonuc = sonuc + i;
        }
        System.out.println(sonuc);
    }
}
