package O9_Metodlar;

public class MetodCalisma2 {

    public static void main(String[] args) {

        DikUcgenCiz(20);
        ayir();
        NormalUcgen(20);
        ayir();
        kare(20);
        ayir();
        NormalUcgen(10);
        kare(22);
    }

    public static void ayir(){
        System.out.println("------------------------------------------------");
    }

    //kullanıcının girdiği değerle ücgen yaptırma
    public static void DikUcgenCiz(int boyut){

        for(int i=1;i<=boyut;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void NormalUcgen(int boyut){
        for(int i=1;i<=boyut;i++){
            for(int x=boyut;x>=i;x--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void kare(int boyut){
        for(int i=1;i<=boyut;i++){
            for( int k=1;k<=boyut;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
