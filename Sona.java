public class Sona implements Liides{
    public String sona;
    public Sona(String sisu){
        sona = sisu;
    }
    public int taheEsinemine(String c){
        String temp = sona.replaceAll(c, "");
        int mitu = (sona.length()-temp.length())/c.length();
        return mitu;
    }
}