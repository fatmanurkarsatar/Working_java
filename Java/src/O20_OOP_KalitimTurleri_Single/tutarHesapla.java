package O20_OOP_KalitimTurleri_Single;

public class tutarHesapla {
    public String urunAdi;
    public int urunAdedi;
    public int urunFiyat;
    public double kdvOran;
    public double tutar;

    public tutarHesapla(String urunAdi,int urunAdedi, int urunFiyat, double kdvOran, double tutar){
        this.urunAdi=urunAdi;
        this.urunAdedi=urunAdedi;
        this.urunFiyat=urunFiyat;
        this.kdvOran=kdvOran;
        this.tutar=tutar;
    }

    public void fiyatHesabi(){
        tutar = Double.valueOf(urunFiyat * urunAdedi) + (urunFiyat * urunAdedi * kdvOran);
    }

    public void fisYaz(){
        System.out.println(urunAdi + " isimli üründen " + urunAdedi + " tane alınmıştır. Ödenecek tutar = " + tutar);
    }
}
