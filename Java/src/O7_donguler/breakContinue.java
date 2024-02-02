package O7_donguler;

public class breakContinue {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("-------------------");

        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }

        System.out.println("-------------------");

        for(int i=1;i<=10;i++){
            System.out.println("Döngüye girildi");
            break;
        }
        System.out.println("----------------------------");

        //continue
        for(int i=1;i<=10;i++){
            if(i==6){
                continue;
            }
            System.out.println(i);
        }

    }
}
