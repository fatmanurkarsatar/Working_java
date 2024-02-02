package O12_OOP_birsiniftannesneolursturma2;

public class hesapla {
    public int faktoriyelhesapla(int sayi){
        int faktoriyel = 1;
        for(int i=1;i<=sayi;i++){
            faktoriyel = faktoriyel*i;
        }
        return faktoriyel;
    }

    public boolean asalSayiKontrol(int sayi){
        int toplam=0;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                toplam +=i;
            }
        }
        if(toplam==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean pozitifNegatif(int sayi){
        if(sayi>0){
            return true;
        }else{
            return false;
        }
    }

    public void kup(int sayi){
        int kup = sayi*sayi*sayi;
        System.out.println("küp = " + kup);
    }

    public void kare(int sayi){
        int kare = sayi*sayi;
        System.out.println("kare = " + kare);
    }
}
