import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        LauseRakendus("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "lorem.txt");
    }

    public static void LauseRakendus(String lause, String failitee) throws IOException {
        BufferedWriter kirjutaja = new BufferedWriter(new FileWriter(failitee, true));
        List<String> uuedsonad = new ArrayList<>();
        List<String> vanadsonad = new ArrayList<>();

        Lause lauseobj = new Lause(lause);
        int lauseasid = lauseobj.TahtedeEsinemine('a');
        System.out.println("Lauses " + lause + " on " + lauseasid + " a-tähte.");

        Sona[] lausesonad = lauseobj.SonadeMassiiv();
        for(Sona sonaobj : lausesonad){
            System.out.println("Sõnas " + sonaobj.sona + " on " + sonaobj.TahtedeEsinemine('a') + " a-tähte.");
            if(OtsiSona(sonaobj.sona, failitee)){
                vanadsonad.add(sonaobj.sona);
            }
            else {
                uuedsonad.add(sonaobj.sona);
                kirjutaja.append(sonaobj.sona).append("\n");
            }
        }

        System.out.println("Uued sõnad on: " + Arrays.toString(uuedsonad.toArray()));
        System.out.println("Vanad sõnad on: " + Arrays.toString(vanadsonad.toArray()));

        kirjutaja.close();
    }

    public static boolean OtsiSona(String sona, String failitee) throws IOException {
        BufferedReader lugeja = new BufferedReader(new FileReader(failitee));
        List<String> read = new ArrayList<>();
        String rida;

        while((rida = lugeja.readLine()) != null) {
            read.add(rida);
        }
        lugeja.close();

        return read.stream().anyMatch(str -> str.trim().equals(sona));
    }
}
