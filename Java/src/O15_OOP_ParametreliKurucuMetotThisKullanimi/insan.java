package O15_OOP_ParametreliKurucuMetotThisKullanimi;

public class insan {
    public String name;
    public int age;
    public int height;
    public int weight;
    public int salary;
    public String eyecolor;

    public insan(String isim, int yas) {
        this.name = isim;
        this.age = yas;

    }

    public insan(int boy, int kilo, int maas) {
        this.height = boy;
        this.weight = kilo;
        this.salary = maas;
    }
}
