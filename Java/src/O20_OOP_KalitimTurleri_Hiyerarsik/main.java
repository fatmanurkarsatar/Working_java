package O20_OOP_KalitimTurleri_Hiyerarsik;
import O20_OOP_KalitimTurleri_Hiyerarsik.*;

public class main {
    public static void main(String[] args) {

        doktor mustafa = new doktor();
        mustafa.ameliyatEt();
        mustafa.nefesAl();
        mustafa.yemekYe();

        System.out.println("-------------------");

        muhendis mhn = new muhendis();
        mhn.YazilimProjesiGelistir();
        mhn.yemekYe();
        mhn.nefesAl();

        System.out.println("-----------------------");

        ogretmen ogrt = new ogretmen();
        ogrt.dersVer();
        ogrt.yemekYe();
        ogrt.nefesAl();

        System.out.println("----------------------");

        tamirci tmr = new tamirci();
        tmr.arabaTamiri();
        tmr.yemekYe();
        tmr.nefesAl();

        System.out.println("----------------------");

        insan in = new insan();
        in.yemekYe();
        in.nefesAl();
    }
}
