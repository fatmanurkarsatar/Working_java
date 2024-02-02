package O14_OOP_DefaultKurucuMetod;

public class hayvan {
    public String rengi;
    public int ayakSayisi;
    public String Hayvanismi;
    public hayvan(){ //default kurucu metod herhangi bir parametresi yok
        rengi = "kahverengi";
        ayakSayisi = 4;
        Hayvanismi = "davık";
        cikti();

    }

    public void cikti(){

        System.out.println("default kurucu metod yaz:");
    }
}
