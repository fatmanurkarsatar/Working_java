package O29_interface;

public class kedi implements canlilar,evcilHayvanlar{

    @Override
    public void beslenme() {
        System.out.println("kedi süt içer");
    }

    @Override
    public void name() {
        System.out.println("kedinin adı minnoş'tur");
    }
}
