package O22_OOP_Kapsulleme;

public class main {
    public static void main(String[] args) {
        ogrenci melis = new ogrenci("melis","culfa",45);
        melis.setogrenciSinif(7);
        System.out.println(melis.getogrenciAd());
        System.out.println(melis.getogrenciSoyad());
        System.out.println(melis.getogrenciNo());
        System.out.println(melis.getogrenciSinif());


    }
}
