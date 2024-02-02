package O16_OOP_MetodOverloading;

public class mainClass {
    public static void main(String[] args) {

        farkliTipteParametre farkliparametre = new farkliTipteParametre();
        farkliparametre.sil("murat","kişiler");
        farkliparametre.sil(3, "kişiler");

        ParametreSayisi pr = new ParametreSayisi();
        pr.hesapla(4,5);
        pr.hesapla(2444,5,6);

        ParametreYerFarki yer = new ParametreYerFarki();
        yer.sil("kişiler",3);
        yer.sil(3,"kişiler");
    }
}
