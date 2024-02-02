package O19_OOP_DERS18ORNEK;

public class SekilCiz {
    public int sekilTipi;

    public SekilCiz(int sekilTipi) {
        this.sekilTipi = sekilTipi;
    }

    public SekilCiz() {
    }

    public void ciz(){
        if(sekilTipi==1){
            kare(5);
        }else if(sekilTipi==2){
            NormalUcgen(5);
        }else{
            System.out.println("birşey çizemiyorum");
        }
    }

    public static void kare(int boyut) {
        for (int i = 1; i <= boyut; i++) {
            for (int k = 1; k <= boyut; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void NormalUcgen(int boyut) {
        for (int i = 1; i <= boyut; i++) {
            for (int x = boyut; x >= i; x--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
