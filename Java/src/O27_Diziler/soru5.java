package O27_Diziler;

public class soru5 {
    public static void main(String[] args) {

        int[][] futbolcular = new int[5][3];

        //murat için
        futbolcular[0][0] = 14;
        futbolcular[0][1] = 21;
        futbolcular[0][2] = 8;

        //başar için
        futbolcular[1][0] = 5;
        futbolcular[1][1] = 26;
        futbolcular[1][2] = 21;

        //ege için
        futbolcular[2][0] = 20;
        futbolcular[2][1] = 15;
        futbolcular[2][2] = 17;

        //erdi için
        futbolcular[3][0] = 4;
        futbolcular[3][1] = 9;
        futbolcular[3][2] = 11;

        //tamer için
        futbolcular[4][0] = 6;
        futbolcular[4][1] = 31;
        futbolcular[4][2] = 25;

        soru5 nesne = new soru5();
        nesne.golSayisi(futbolcular);
        nesne.gol2017Toplam(futbolcular);
        nesne.EnCok2018DeGolAtan(futbolcular);
        nesne.egeGol(futbolcular);

    }

    // futbolcunun gol sayılarını toplama
    public void golSayisi(int[][] dizi) {
        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 3; k++) {
                toplam = toplam + dizi[i][k];
            }
        }
        System.out.println("toplam gol sayısı = " + toplam);
    }

    //2017 sezonunda atılan toplam gol sayısı
    public void gol2017Toplam(int[][] dizi) {
        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 1; k++) {
                toplam = toplam + dizi[i][k];
            }
        }
        System.out.println("2017 yılındaki toplam gol sayısı = " + toplam);
    }

    //2018 yılında en çok golü kim atmıştır
    public void EnCok2018DeGolAtan(int[][] dizi) {
        int enCokGol = 0;
        int indis = 0;
        for (int i = 0; i < 5; i++) {
            for (int k = 1; k < 2; k++) {
                if (dizi[i][k] > enCokGol) {
                    enCokGol = dizi[i][k];
                    indis = i;
                }
            }
        }
        if (indis == 0) {
            System.out.println("en çok golü atan murat gol sayısı = " + enCokGol);
        } else if (indis == 1) {
            System.out.println("en çok golü atan başar gol sayısı = " + enCokGol);
        } else if (indis == 2) {
            System.out.println("en çok golü atan ege gol sayısı = " + enCokGol);
        } else if (indis == 3) {
            System.out.println("en çok golü atan erdi gol sayısı = " + enCokGol);
        } else if (indis == 4) {
            System.out.println("en çok golü atan tamer gol sayısı = " + enCokGol);
        }
    }

    //ege 3 sezonda toplam kaç gol attı
    public void egeGol(int[][] dizi){
        int toplam = 0;
        for (int i = 2; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                toplam = toplam + dizi[i][k];
            }
        }
        System.out.println("EGENİN toplam gol sayısı = " + toplam);
    }
}
