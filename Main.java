package tund11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static int[] letters = new int[26];
    static String[] words = new String[26];

    public static void sortArray(){

        int tempValue;
        String tempSomething;

        for(int x = 0; x < letters.length; x++){
            for(int y = 0; y < letters.length; y++){
                if(letters[x] < letters [y]) {
                    tempValue = letters[y];
                    tempSomething = words[y];

                    letters[y] = letters[x];
                    words[y] = words[x];

                    letters[x] = tempValue;
                    words[x] = tempSomething;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        List<String> list;

        list = Files.readAllLines(Paths.get("AlanWatts.txt")).
                stream().
                flatMap(line -> Stream.of(line.replaceAll("[^a-zA-Z’]", " ").split(" "))).
                collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() == 0 || list.get(i) == "" || list.get(i) == " "){
                list.remove(i);
                i--;
            }
        }

        char lastLetter;
        int ascii;

        for (String word : list){
            lastLetter = word.toLowerCase().charAt(word.length()-1);
            ascii = lastLetter;

            letters[ascii-97] += 1;
            words[ascii-97] += word.toLowerCase() + " ";
        }

        for (int i = 0; i < letters.length; i++){
            if (words[i] != null){
                words[i] = words[i].substring(4);
            }
        }

        sortArray();

        PrintWriter links = new PrintWriter(new FileWriter("links.html"));

        for (String x : words){
            if (x != null){
                //System.out.println(x.split(" ").length + " " + x.split(" ")[0].charAt(x.split(" ")[0].length()-1) + " " + x);

                char theLetter = x.split(" ")[0].charAt(x.split(" ")[0].length()-1);
                int theLength = x.split(" ").length;

                PrintWriter sublink = new PrintWriter(new FileWriter(theLetter + ".html"));
                sublink.write(x);

                links.write("<a href='" + theLetter + ".html'>" + theLetter + " (" + theLength + ")</a><br/>");
                sublink.close();
            }
        }
        links.close();
    }
}
