package O15_OOP_ParametreliKurucuMetotThisKullanimi;

public class mainclass {
    public static void main(String[] args) {
        insan in1 = new insan("furkan",28);
        System.out.println(in1.name);
        System.out.println(in1.age);

        System.out.println("--------------------------");

        insan in2 = new insan(180,75,25000);
        System.out.println(in2.height);
        System.out.println(in2.weight);
        System.out.println(in2.salary);
    }
}
