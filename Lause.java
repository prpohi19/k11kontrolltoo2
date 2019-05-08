public class Lause implements Hulk {
    String lause;

    public Lause(String lause) {
        this.lause = lause;
    }

    @Override
    public int TahtedeEsinemine(char taht) {
        int hulk = 0;

        for (int i = 0; i < lause.length(); i++) {
            if (lause.toLowerCase().charAt(i) == taht)
                hulk++;
        }

        return hulk;
    }

    public int SonadeArv(){
        return SonadeMassiiv().length;
    }

    public Sona[] SonadeMassiiv(){
        String[] sonad = lause.split(" ");
        Sona[] sonaKlassid = new Sona[sonad.length];

        for(int i = 0; i < sonad.length; i++){
            sonaKlassid[i] = new Sona(sonad[i].toLowerCase().replaceAll("[^a-zA-Z]", "")); // väiketähed, kirjavahemärkideta
        }

        return sonaKlassid;
    }
}
