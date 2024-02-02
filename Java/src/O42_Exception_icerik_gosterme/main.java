package O42_Exception_icerik_gosterme;

public class main {
    public static void main(String[] args) {

        //printstacktrace örneği
/*
        try{
            int sonuc = 30/0;
        }catch(Exception e){
            e.printStackTrace();
        }

        //toString örneği
        try{
            int sonuc = 40 / 0;
        }catch(Exception e){
            System.out.println(e.toString());
        }

 */
        //getmessage orneği
        try{
            int sonuc = 40 / 0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
