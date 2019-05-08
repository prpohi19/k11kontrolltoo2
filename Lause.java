public class Lause implements Liides{
    public String lause;
    public Lause(String sisu){
        lause = sisu;
    }

    public int sonadeArvLauses(){
        lause = lause.toLowerCase();
        String[] sonad = lause.split("\\s+");
        for (int i = 0; i < sonad.length; i++) {
            sonad[i] = sonad[i].replaceAll("[^\\w]", "");
            Sona sona = new Sona(sonad[i]);
        }
        return sonad.length;
    }

    public Sona[] lauseSonad(){
        lause = lause.toLowerCase();
        String[] sonad = lause.split("\\s+");
        Sona[] sonaObjektid = new Sona[sonad.length];
        for (int i = 0; i < sonad.length; i++) {
            sonad[i] = sonad[i].replaceAll("[^\\w]", "");
            sonaObjektid[i] = new Sona(sonad[i]);
            System.out.println(sonaObjektid[i]);
        }
        return sonaObjektid;
    }

    public int taheEsinemine(String c){
        String temp = lause.replaceAll(c, "");
        int mitu = (lause.length()-temp.length())/c.length();
        return mitu;
    }
}