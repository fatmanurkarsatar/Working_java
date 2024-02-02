package O13_OOP_BirSiniftanNesneOlusturma;

public class hayvanlarAlemi {
    public String isim;
    public int yas;

    public static void main(String[] args) {

        hayvanlarAlemi kus = new hayvanlarAlemi(); //nesneyi oluşturduk

        kus.Solunum();
        kus.isim="NECMİ";
        kus.yas= 6;

        System.out.println("--------------------------------------------");

        insan murat = new insan();
        murat.gozrengi="mavi";
        murat.sacRengi="sarı";
        murat.boy=180;
        murat.kilo=65;
        murat.yas=25;

        murat.GozrengiYaz();
        murat.SacRengiYaz();
        murat.BoyYaz();
        murat.KiloYaz();
        murat.yasYAZ();

        System.out.println("----------------------------------");
        insan nisan = new insan();
        nisan.sacRengi="siyah";
        nisan.gozrengi="siyah";
        nisan.kilo=45;
        nisan.boy=175;
        nisan.yas=29;

        nisan.BoyYaz();
        nisan.KiloYaz();
        nisan.SacRengiYaz();
        nisan.GozrengiYaz();
        nisan.yasYAZ();

    }
    public void Solunum(){
        System.out.println("solunum yapıldı");

    }
}
