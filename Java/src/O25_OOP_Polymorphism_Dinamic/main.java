package O25_OOP_Polymorphism_Dinamic;

import org.w3c.dom.html.HTMLOptGroupElement;

public class main {
    public static void main(String[] args) {
        CalisanInsan cs = new CalisanInsan();
        cs.vergiOde();
        cs.maasHesabi();

        System.out.println("------------------------");

        cs = new muhendis(15000);
        cs.vergiOde();
        cs.maasHesabi();

        System.out.println("--------------------------------");

        cs = new ogretmen(7000);
        cs.vergiOde();
        cs.maasHesabi();
        cs.belgeNo();



    }
}
