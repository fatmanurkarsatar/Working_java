package O26_OOP_AbstractClass;

public abstract class hayvan {
    private String renk;
    public hayvan(String renk){
        this.renk=renk;
    }

    abstract void bacakSayisi(int sayi);
    public void renkYaz(){
        System.out.println(renk);
    }

}
