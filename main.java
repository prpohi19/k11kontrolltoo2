import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("loremipsum.txt"));
        String row = bufferedReader.readLine();
        String totalStr = "";
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        Map<Integer, Integer> mapCounter = new HashMap<Integer, Integer>();
        Map<Integer, List<Integer>> mapStats = new HashMap<Integer, List<Integer>>();

        while (row != null) {
            totalStr += row;
            row = bufferedReader.readLine();
        }
        String[] words = totalStr.split(" ");

        for(int i = 0; i < words.length; i++) {
            int wordLength = words[i].length();

            // Dictionary lisamine
            List<String> list = map.get(wordLength);
            if(list != null) {
                list.add(words[i]);
            } else {
                list = new ArrayList<String>();
                list.add(words[i]);
            }
            map.put(wordLength, list);
            // Dictionary lisamine - END

            // 2. ülesande osa andmete koostamine
            int currentVal = 0;
            if(mapCounter.get(wordLength) == null) {
                mapCounter.put(wordLength, 0);
            }
            currentVal = mapCounter.get(wordLength) + 1;

            if(currentVal % 10 == 0) {
                List<Integer> statslist = mapStats.get(wordLength);
                if(statslist != null) {
                    statslist.add(currentVal);
                } else {
                    statslist = new ArrayList<Integer>();
                    statslist.add(currentVal);
                }
                mapStats.put(wordLength, statslist);
            }
            // 2. ülesande osa andmete koostamine - END

            mapCounter.put(wordLength, currentVal);
        }
        System.out.println("Kolmesõnalisi kokku: "+map.get(3).size());

        Map<Integer, List<Integer>> threeWordStats = new HashMap<Integer, List<Integer>>();
        threeWordStats.put(3, mapStats.get(3));
        printGraphByTen(threeWordStats);

        Map<Integer, List<Integer>> mapSectors = new HashMap<Integer, List<Integer>>();
        String[] parts = new String[] {
            totalStr.substring(0, totalStr.length() / 3),
            totalStr.substring(totalStr.length() / 3, totalStr.length() / 3 * 2),
            totalStr.substring(totalStr.length() / 3 * 2, totalStr.length()),
        };

        for(int i = 0; i < parts.length; i++) {
            String[] ws = totalStr.split(" ");

            for(int x = 0; x < ws.length; x++) {
                int wordLength = ws[x].length();

                List<Integer> statslist = mapSectors.get(wordLength);
                if(statslist != null && i < statslist.size()) {
                    int val = 1;
                    if(statslist.get(i) != null) {
                        val = statslist.get(i) + 1;
                    }
                    statslist.set(i, val);
                    //System.out.println("ADDED: "+wordLength+" --- "+i+" --- "+val);
                } else {
                    statslist = new ArrayList<Integer>() {};
                    statslist.add(1);
                    statslist.add(1);
                    statslist.add(1);
                }
                mapSectors.put(wordLength, statslist);
            }
        }

        System.out.println("1-10 Sõnade statistika:");
        printGraphByWords(mapSectors);
    }
    public static void printGraphByWords(Map<Integer, List<Integer>> stats) {
        // Käime terve mapi läbi, et näha mis on max value.
        int maxWordCount = 0;

        for (Map.Entry<Integer, List<Integer>> entry : stats.entrySet()) {
            //for(int i = 0; i < stats.size(); i++) { // per sõnade pikkus
            Integer key = entry.getKey();
            List<Integer> ss = entry.getValue(); // stats get i == stats

            if (ss == null) {
                continue;
            }
            int statSize = ss.size();
            for (int x = 0; x < statSize; x++) { // per 10
                if (ss.get(x) > maxWordCount) {
                    maxWordCount = ss.get(x);
                }
            }
        }

        double cellVal = maxWordCount / 30.0;
        double sectors = maxWordCount / 3.0;
        int sectorVal = (int) Math.round(sectors);

        for(int y = 0; y < 30; y++) {
            String header = "";
            String content = "";
            for (Map.Entry<Integer, List<Integer>> entry : stats.entrySet()) {
                Integer key = entry.getKey();
                List<Integer> ss = entry.getValue(); // stats get i == stats

                if(key <= 10 && y == 0) { // Print header
                    header += key+" "+key+" "+key+" ";
                } else if(key >= 1 && key <= 10) { // Print content
                    double bVal = Math.round(y * cellVal * 1.0); // ehk palju peab olema et tuleks X

                    for(int n = 0; n < ss.size(); n++) {
                        double columnStatVal = Math.round(maxWordCount / ss.get(n) * cellVal * 1.0);
                        //System.out.println(bVal +" < " + columnStatVal + " y "+y+" cellval "+cellVal);
                        if(columnStatVal < bVal) {
                            content += "X ";
                            if(key.toString().length() > 1) {
                                content += " ";
                            }
                        } else {
                            content += "- ";
                            if(key.toString().length() > 1) {
                                content += " ";
                            }
                        }
                    }

                }
            }

            if(y == 0) {
                System.out.println(header);
            } else {
                System.out.println(content);
            }
        }
    }

    public static void printGraphByTen(Map<Integer, List<Integer>> stats) {
        // Käime terve mapi läbi, et näha mis on max value.
        int maxWordCount = 0;

        for(Map.Entry<Integer, List<Integer>> entry : stats.entrySet()) {
        //for(int i = 0; i < stats.size(); i++) { // per sõnade pikkus
            Integer key = entry.getKey();
            List<Integer> ss = entry.getValue(); // stats get i == stats

            if(ss == null) { continue; }
            int statSize = ss.size();
            for(int x = 0; x < statSize; x++) { // per 10
                if(ss.get(x) > maxWordCount) {
                    maxWordCount = ss.get(x);
                }
            }
        }
        System.out.println("Max word count: "+maxWordCount);
        double onecell = (1.0/30.0 * maxWordCount);
        System.out.println("One cell 1: "+onecell);
        int oneCellValue = (int)Math.round(onecell);
        System.out.println("One cell 2: "+oneCellValue);

        // Graphi välja print

        for(Map.Entry<Integer, List<Integer>> entry : stats.entrySet()) {
        //for(int i = 0; i < stats.size(); i++) { // per sõnade pikkus
            Integer key = entry.getKey();
            List<Integer> ss = entry.getValue(); // stats get i == stats
            System.out.println("Sõnade tähtede pikkused: "+key);

            if(ss == null) { continue; }
            //System.out.print(ss+"|");
            int statSize = ss.size();
            String header = "";
            String content = "";
            for(int x = 0; x < statSize; x++) { // per 10
                if(ss.get(x) != null) {
                    int wordCountSoFar = ss.get(x);
                    if(wordCountSoFar == 0) { continue; }
                    for(int y = 1; y < 31; y++) {
                        //System.out.print(wordCountSoFar % oneCellValue+" == " + y % oneCellValue);
                        if(wordCountSoFar % oneCellValue == y % oneCellValue) {
                            //System.out.print("X");
                            int cellVal = y * oneCellValue;
                            header += cellVal;
                            content += "X";
                            int cellLength = (cellVal+"").length();
                            for(int l = 0; l < cellLength-1; l++) {
                                content += "-";
                            }
                        } else {
                            header += "-";
                            content += "-";
                        }
                        if(y == 30) {
                            header += "|<";
                            content += "|<";
                        }
                    }
                    break;
                }
            }
            System.out.println(header);
            System.out.println(content);
        }


    }
}
