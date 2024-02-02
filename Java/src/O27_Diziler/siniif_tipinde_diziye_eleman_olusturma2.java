package O27_Diziler;

public class siniif_tipinde_diziye_eleman_olusturma2 {

    public static void main(String[] args) {

        Urun urunler[] = new Urun[3];
        Urun urun1 = new Urun("pantolon",100,"giyim","le cooper");
        Urun urun2 = new Urun("gömlek",200,"giyim","le cooper");
        Urun urun3 = new Urun("kazak",300,"giyim","le cooper");

        urunler[0] = urun1;
        urunler[1] = urun2;
        urunler[2] = urun3;

        for(int i=0;i<urunler.length;i++){
            System.out.println(urunler[i].toString());
        }

    }
}
