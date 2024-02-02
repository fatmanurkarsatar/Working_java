package O6_kontrol_yapilari;

public class SwitchCaseKullanimi {
    public static void main(String[] args) {

        int gun = 5;

        switch(gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("belirtilen sayıya ait bir gün yoktur");
        }

        String gun2 = "pazar";

        switch(gun2){

            case "Pazartesi":
                System.out.println("1");
                break;
            case "Salı":
                System.out.println("2");
                break;
            case "Çarşamba":
                System.out.println("3");
                break;
            case "Perşembe":
                System.out.println("4");
                break;
            case "Cuma":
                System.out.println("5");
                break;
            case "Cumartesi":
                System.out.println("6");
                break;
            case "Pazar":
                System.out.println("7");
                break;
            default:
                System.out.println("Verilen güne ait rakam bulunmamaktadır");
        }

    }

}
