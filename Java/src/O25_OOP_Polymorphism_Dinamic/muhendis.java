package O25_OOP_Polymorphism_Dinamic;

public class muhendis extends CalisanInsan {

    private int maas;
    private int vergi;

    public muhendis(int maas){
        this.maas=maas;


    }
    @Override
    public void maasHesabi() {
        maas = maas - vergi;
        System.out.println("net maaş = " + maas);
    }

    @Override
    public void vergiOde() {
        vergi = ((maas*30)/100);
        System.out.println("ödenen vergi = " + vergi);
    }


}
