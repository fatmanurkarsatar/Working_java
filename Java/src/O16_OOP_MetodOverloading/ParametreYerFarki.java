package O16_OOP_MetodOverloading;

public class ParametreYerFarki {
    public void sil(int id, String tabloismi) {
        System.out.println(id+tabloismi);
    }

    public void sil(String tabloismi, int id) {
        System.out.println(tabloismi+id);
    }
}
