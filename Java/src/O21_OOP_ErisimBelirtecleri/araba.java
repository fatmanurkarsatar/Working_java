package O21_OOP_ErisimBelirtecleri;

public class araba {
    public void yakitTipi(String tip){
        System.out.println("yakıt tipi = " + tip);
    }
    protected void model(int yil){
        System.out.println("model = " + yil);
    }
    private void renk(String renk){
        System.out.println("renk = " + renk);
    }
    void vitestipi(String tip){
        System.out.println("vites tipi = " + tip);
    }
}
