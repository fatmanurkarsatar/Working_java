package O32_ArrayList_JavaSinifi;

public class kisi {
    private String isim;
    private String meslek;
    private int yas;
    private int maas;

    public  kisi(String isim, String meslek, int yas, int maas){
        this.isim = isim;
        this.meslek = meslek;
        this.yas = yas;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public String getMeslek() {
        return meslek;
    }

    public int getYas() {
        return yas;
    }

    public int getMaas() {
        return maas;
    }

    @Override
    public String toString(){
        return "kisi {" + " isim = " + isim + " , meslek =" + meslek + ", yas = " + yas + ", maas = " + maas;
    }
}
