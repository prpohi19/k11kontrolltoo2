import java.util.*;

public class Main{
    public static void main(String[] args){
        //Sona sona = new Sona("pere");
        System.out.println("---");
        Scanner sisse = new Scanner(System.in);
        System.out.println("Kirjutage kontrollitav lause: ");
        String saadudLause = sisse.nextLine();
        Lause lause = new Lause(saadudLause);
        Sona[] sonad = lause.lauseSonad();
        System.out.println("Lauses esinevate 'a' t2htede arv: " + lause.taheEsinemine("a"));
        System.out.println("sonaOBJ pikkus: " + sonad.length);
        System.out.println("---");
        for(Sona sona : sonad){
            //Sona sona = new Sona(sona);
            //String temp = sona;
            System.out.println("S6nas '"+ sona.sona +"' esinevate 'a' t2htede arv: " + sona.taheEsinemine("a"));
            
        }
        System.out.println("---");
    }
}