package O22_OOP_Kapsulleme;

public class ogrenci {
    private String ogrenciAd;
    private String ogrenciSoyad;
    private int ogrenciNo;
    private int ogrenciSinif;

    public ogrenci(String ogrenciAd, String ogrenciSoyad, int ogrenciNo){
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogrenciNo = ogrenciNo;
    }

    public String getogrenciAd(){
        return ogrenciAd;
    }


    public String getogrenciSoyad(){
        return ogrenciSoyad;
    }

    public int getogrenciNo(){
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo){
        this.ogrenciNo=ogrenciNo;
    }

    public int getogrenciSinif(){
        return ogrenciSinif;
    }
    public void setogrenciSinif(int ogrenciSinif){
        this.ogrenciSinif = ogrenciSinif;
    }




}
