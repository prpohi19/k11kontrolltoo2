public class Sona implements Hulk {
    String sona;

    public Sona(String sona) {
        this.sona = sona;
    }

    @Override
    public int TahtedeEsinemine(char taht) {
        int hulk = 0;

        for (int i = 0; i < sona.length(); i++) {
            if (sona.toLowerCase().charAt(i) == taht)
                hulk++;
        }

        return hulk;
    }
}
