import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
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
        int index = 0;
        String[] uued = new String[lause.sonadeArvLauses()];
        for(Sona sona : sonad){
            //Sona sona = new Sona(sona);
            //String temp = sona;
            System.out.println("S6nas '"+ sona.sona +"' esinevate 'a' t2htede arv: " + sona.taheEsinemine("a"));
            uued[index] = sona.sona;
            index++;
        }
        System.out.println("---");
         
        BufferedReader lugeja = new BufferedReader(new FileReader("sonad.txt"));
        int kogus = Integer.parseInt(lugeja.readLine());
        String[] vanad = new String[kogus];
        List<String> lisatavad = new ArrayList<String>();

        for(int i = 0; i < kogus; i++){
            vanad[i] = lugeja.readLine();
            lisatavad.add(vanad[i]);
        }
        for(int i = 0, j = 0; i < index; i++, j++){
            if(kogus != 0){
                if(j == kogus - 1){
                    j = 0;
                }
                String vanaSona = vanad[j];
                String uusSona = uued[j];
                //System.out.println(uusSona);
                //System.out.println(vanaSona);
                if(!uusSona.equals(vanaSona)){
                    //System.out.println(uusSona);
                    lisatavad.add(uued[i]);
                }
            } else {
                lisatavad.add(uued[i]);
            }   
        }

        PrintWriter kirjutaja = new PrintWriter(new FileWriter("sonad.txt"));
        kirjutaja.println(lisatavad.size());
        for (int i = 0; i < lisatavad.size(); i++){
            kirjutaja.println(lisatavad.get(i));
        }
        kirjutaja.close();
        lugeja.close();
    }
}