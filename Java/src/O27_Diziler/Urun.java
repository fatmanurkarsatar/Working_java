package O27_Diziler;

public class Urun {
    public String urunAdi;
    public int urunFiyat;
    public String kategori;
    public String saticiFirma;

    public Urun(String urunAdi, int urunFiyat, String kategori, String saticiFirma) {
        this.urunAdi=urunAdi;
        this.urunFiyat=urunFiyat;
        this.kategori=kategori;
        this.saticiFirma=saticiFirma;
    }

    @Override
    public String toString(){
        return "Urun{" + "urun Adi=" + urunAdi + "urun Fiyat=" + urunFiyat + "kategori=" + kategori + "satici Firma=" + saticiFirma;
    }
}
