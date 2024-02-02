package O5_operatorler;

public class operatorler {
    public static void main(String[] args) {
        //atama operötürü
        /*
        int a = 5 , b = 7 , c = 10 , d = 20 , f;
        a=c;
        System.out.println("a'nın değeri = " + a);
        a = a*3;
        b = b-2;
        c = b*3;
        d = d*5/a;
        f=c;

        System.out.println("a,b,c,d,f = "+a+","+b+","+c+","+d+","+f);

        //aritmetik operatörler
        /*
        int a = 50 , b=20 , c= -50 , d=10;
        String name1 = "kapsamlı", name2 = " java", name3=" eğitimi";
        System.out.println(name1 + name2 + name3);
        System.out.println(""+a+(b-c)); //a'yı string bir ifadeyle birleştirdi bu yüzden 50 oldu
        System.out.println(""+a+(b-c)+d); //507010

        int mod = a%b;
        System.out.println(mod);
*/

        //ilişikisel Operatörler
        /*
        int a = 10 , b = 20 , c = 5 , d = 4;
        boolean sonuc = a>c;
        System.out.println(a > (c*d));
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println( b < (a*a));
*/

        //mantıksal operatörler
        /*
        int a=10, b=20, c=3, d=6;
        boolean sonuc;
        System.out.println(a>b && c<d);
        System.out.println(a>b || c>d);
        System.out.println(a>b || c<d);
*/
        //artırma azaltma operatörleri
        int sayi = 100 , sayi2=200;
        int sonuc = --sayi;
        System.out.println(sayi2);
        System.out.println(sonuc);

        int sayi3 = 150;
        sonuc = sayi++;
        System.out.println(sayi3);
        System.out.println(sonuc);

        int sayi4=5;
        sonuc = ++sayi4;
        System.out.println(sayi4);
        System.out.println(sonuc);

    }
}

