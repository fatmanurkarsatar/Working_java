package O20_OOP_KalitimTurleri_Multilevel;
import O20_OOP_KalitimTurleri_Multilevel.*;
public class main {
    public static void main(String[] args) {

        jetta j = new jetta();
        j.hiz(145);
        //j.marka();
        j.model(2017);
        j.renk("beyaz");
        j.YakitTipi("benzin");

        System.out.println("-----------------------");

        wolkswagen wlk = new wolkswagen();
        //wlk.marka();
        wlk.model(2015);
        wlk.renk("kırmızı");
        wlk.YakitTipi("dizel");

        System.out.println("--------------------------");

        araba car = new araba();
        car.model(2013);
        car.renk("bordo");
        car.YakitTipi("gaz");

    }
}
