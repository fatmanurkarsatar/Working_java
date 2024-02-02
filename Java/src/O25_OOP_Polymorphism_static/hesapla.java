package O25_OOP_Polymorphism_static;

public class hesapla {

    public void topla(int sayi1, int sayi2){
        System.out.println("toplama = " + (sayi1+sayi2));
    }
    public void topla(String sayi1, String sayi2){
        int s1 = Integer.parseInt(sayi1);
        int s2 = Integer.parseInt(sayi2);
        System.out.println("toplam = " + (s1+s2));
    }
}
