package O18_OOP_kalitimdaKurucuMethodSuperKelimesi;

public class insan {
    String isim;
    public insan(String isim) { //kurucu metot
        this.isim = isim;
    }

    public void adyyaz(){
        System.out.println(isim);
    }
}
