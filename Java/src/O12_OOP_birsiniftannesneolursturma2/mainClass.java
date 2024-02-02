package O12_OOP_birsiniftannesneolursturma2;

public class mainClass {
    public static void main(String[] args) {
        hesapla hs = new hesapla();

        Boolean asalKontrol = hs.asalSayiKontrol(5);
        System.out.println(asalKontrol);

        int fakSonuc = hs.faktoriyelhesapla(4);
        System.out.println(fakSonuc);

        boolean poznegKontrol = hs.pozitifNegatif(-50);
        System.out.println(poznegKontrol);

        hs.kup(5);
        hs.kare(10);
    }
}
