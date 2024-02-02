package O16_OOP_MetodOverloading;

public class farkliTipteParametre {
    public void sil(int id, String tabloisim){

        System.out.println(id+ " id li kayıt " + tabloisim + "tablosundan silinmiştir");
    }

    public void sil(String kisi , String tabloisim){

        System.out.println(kisi+ " isimli kayıtlar " + tabloisim + "tablosundan silinmiştir");
    }
}
