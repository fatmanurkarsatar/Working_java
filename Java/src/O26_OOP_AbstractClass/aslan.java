package O26_OOP_AbstractClass;

public class aslan extends hayvan{

    public aslan(String renk){
        super(renk);
    }
    @Override
    void bacakSayisi(int sayi) {
        System.out.println("bacak sayısı = " + sayi);
    }
}
