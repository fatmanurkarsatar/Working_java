package O31_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        ArrayList <String> isimler= new ArrayList<>();

        System.out.println("------------Add Metodu-------------------");
        isimler.add("elif");
        isimler.add("başak");
        isimler.add("enes");
        isimler.add("ege");
        isimler.add("zeyd");
        System.out.println(""+isimler);
        System.out.println("Boyut = "+isimler.size());

        System.out.println("-----------AddAll metodu--------");
        ArrayList <String> isimler2 = new ArrayList<>();
        isimler2.add("aliye");
        isimler2.add("zerda");
        isimler2.add("ece");
        isimler.addAll(isimler2);

        System.out.println("----------size metodu-----------");
        System.out.println(""+isimler.size());

        System.out.println("------------get metodu----------");
        String eleman = isimler.get(2);
        System.out.println("3.eleman = " + eleman);

        System.out.println("------------iterator while-------");
        Iterator <String> iter =  isimler.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("-----------iterator for---------------");
        for(int i=0;i<isimler.size();i++){
            System.out.println(isimler.get(i));
        }

        System.out.println("-----------ornek--------------");
        ArrayList <Integer> sayi = new ArrayList<Integer>();
        sayi.add(5);
        sayi.add(4);
        sayi.add(3);
        sayi.add(2);

        for(int i=0;i< sayi.size();i++){
            int carp = sayi.get(i)*5;
            System.out.println(carp);
        }

        System.out.println("----------------------");
        Iterator <Integer> iter2 = sayi.iterator();
            while(iter2.hasNext()){
                int islem = iter2.next()*5;
                System.out.println(islem);
            }

        System.out.println("--------set metodu-------");

            isimler.set(2,"elife");
        System.out.println(""+ isimler);

        //set metodu kullanarak sayılar sınıfındaki elemanları
        //10 ile çarparak güncelle

        for(int i=0;i<sayi.size();i++){
            sayi.set(i,sayi.get(i)*10);
            System.out.println(sayi);
        }

        System.out.println("--------remove metodu--------------");
        isimler.remove(2);
        System.out.println(""+isimler);

        System.out.println("--------removeAll metodu------------");
        isimler.removeAll(isimler);
        System.out.println(""+isimler);

        System.out.println("--------clear metodu--------------");
        sayi.clear();
        System.out.println(sayi);

        System.out.println("----------döngüler----------");

        ArrayList <String> ulkeler = new ArrayList<>();
        ulkeler.add("Türkiye");
        ulkeler.add("Azerbaycan");
        ulkeler.add("Türkmenistan");
        ulkeler.add("Kırgızistan");

        System.out.println("------------döngüler-While------------");
        Iterator<String> iter3 = ulkeler.iterator();
        while(iter3.hasNext()) {
            System.out.println(iter3.next());
        }

        System.out.println("------------döngüler-For------------");
        for(int i=0;i< ulkeler.size();i++){
            System.out.println(ulkeler.get(i));
            }

        System.out.println("------------döngüler-Foreach------------");
        for(String ulke: ulkeler){
            System.out.println(ulke);
        }

        System.out.println("---------ArrayList-Array--------------");
        ArrayList <Integer> ogrenciNumaraArrayList = new ArrayList<>();
        ogrenciNumaraArrayList.add(5);
        ogrenciNumaraArrayList.add(7);
        ogrenciNumaraArrayList.add(54);
        ogrenciNumaraArrayList.add(596);

        Object[] ogrenciNumaraArray =ogrenciNumaraArrayList.toArray();
        for(int i=0;i<ogrenciNumaraArray.length;i++){
            System.out.println(""+ogrenciNumaraArray[i]);
        }

        System.out.println("-----------------------------");

        Integer[] ogrenciNumara2 =
                ogrenciNumaraArrayList.toArray(new Integer[ogrenciNumaraArrayList.size()]);

        for(int i=0;i<ogrenciNumara2.length;i++){
            System.out.println(""+ogrenciNumaraArray[i]);
        }

        System.out.println("----------Array-ArrayList---------------- ");

        ArrayList <Integer> ogrenciNumaraArrayList2 = new ArrayList<>(Arrays.asList(ogrenciNumara2));

        for(int i=0;i<ogrenciNumaraArrayList2.size();i++){
            System.out.println(""+ogrenciNumaraArrayList2.get(i));
        }

        System.out.println("----------ArrayList-String--------");

        String StringArrayList = ogrenciNumaraArrayList2.toString();
        System.out.println(StringArrayList);
        }

            }








