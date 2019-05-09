import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    private static int kogus(String s) {
        return Integer.parseInt(s.split(" ")[1]);
    }

    public static void main(String[] arg) throws Exception {

        String sisend = "sisend.txt";
        String valjund = "valjund.txt";
        String valjund2 = "main.html";
        String failitekst = "";
        ArrayList < String > lastLetters = new ArrayList < > ();
        Map < String, Long > occurrence;
        ArrayList < String > wordsWithOccurrence = new ArrayList < > ();

        File file = new File(sisend);

        BufferedReader reader = new BufferedReader(new FileReader(sisend));
        List < String > sonad = new ArrayList < > ();

        Map<Character, List<String>> puhver=new HashMap();

        String rida;
        while ((rida = reader.readLine()) != null) {
            List < String > sonadreal = Arrays.asList(rida.split(" "));
            for (String sona: sonadreal) {
                sonad.add(sona);
            }
        }

        reader.close();

        Scanner scan = new Scanner(file);

        while (scan.hasNext()) {
            String s = scan.next();
            if (s.length() > 1) {
                lastLetters.add(s
                    .toLowerCase()
                    .substring(s.length() - 1));
            }
        }
        scan.close();

        occurrence = lastLetters.stream()
            .collect(groupingBy(Function.identity(), counting()));

        for (Map.Entry < String, Long > entry: occurrence.entrySet()) {
            wordsWithOccurrence.add(entry.getKey() + " " + entry.getValue());
        }

        for(int i = 0; i < wordsWithOccurrence.size(); i++) {
            for(int j = 0; j < sonad.size(); j++) {
                if(puhver.get(wordsWithOccurrence.get(i).split(" ")[0].charAt(0))==null){ // kui tähte puhvris pole
                    puhver.put(wordsWithOccurrence.get(i).split(" ")[0].charAt(0), new ArrayList<String>());
                }
                if(sonad.get(j).length() > 1){
                    if(sonad.get(j).substring(sonad.get(j).length() - 1).equals(wordsWithOccurrence.get(i).split(" ")[0])){ // kui viimane täht == otsitu
                        puhver.get(wordsWithOccurrence.get(i).split(" ")[0].charAt(0)).add(sonad.get(j));
                    }
                }
            }
        }

        PrintWriter kirjutaja = new PrintWriter(new FileWriter(valjund));
        wordsWithOccurrence
            .stream()
            .sorted((s1, s2) -> kogus(s2) - kogus(s1))
            .collect(Collectors.toList())
            .forEach(kirjutaja::println);
        kirjutaja.close();

        failitekst += "<!DOCTYPE html><html><body><ul>";
        for (int i = 0; i < wordsWithOccurrence.size(); i++) {
            failitekst += "<li><a href='" + wordsWithOccurrence.get(i).split(" ")[0] + ".html'>" + wordsWithOccurrence.get(i) + "</a></li>";
        }
        failitekst += "</ul></body></html>";
        BufferedWriter writer2 = new BufferedWriter(new FileWriter(valjund2));
        writer2.write(failitekst);
        writer2.close();


        for(int i = 0; i < lastLetters.size(); i++) { 
            BufferedWriter writer3 = new BufferedWriter(new FileWriter(lastLetters.get(i) + ".html"));
            List<String> currentLetterWords = puhver.get(lastLetters.get(i).charAt(0));

            for(String word : currentLetterWords){
                writer3.write(word + "<br>");
            }
            writer3.close();
        }
    }
}