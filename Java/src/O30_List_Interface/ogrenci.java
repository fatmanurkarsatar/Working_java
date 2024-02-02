package O30_List_Interface;

public class ogrenci {

    private int ogrenciNo;
    private String isim;
    public ogrenci(int ogrenciNo, String isim){
        this.isim=isim;
        this.ogrenciNo=ogrenciNo;
    }

    @Override
    public String toString(){
        return  "" + ogrenciNo + "" + isim ;
    }
}
