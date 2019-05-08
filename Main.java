package Kontrolltöö2;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        File fail = new File("C:\\Users\\andri\\IntelliJIDEAProjects\\Programmeerimine\\src\\Kontrolltöö2\\tekst");
        Scanner input = new Scanner(fail);
        List<String> t2hed = new ArrayList<String>();
        List<String> sõnad = new ArrayList<String>();
        while (input.hasNext()) {
            String sõna = input.next();
            sõnad.add(sõna);
            int muutuja = sõna.length();
            char vastus;
            vastus = sõna.charAt(muutuja - 1);
            t2hed.add(String.valueOf(vastus));
            Collections.sort(t2hed);
        }
        String listString = "";

        for (String s : t2hed)
        {
            listString += s;
        }

        int len = listString.length();
        Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));

        for (int i = 0; i < len; ++i)
        {
            char charAt = listString.charAt(i);

            if (!numChars.containsKey(charAt))
            {
                numChars.put(charAt, 1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }

        System.out.println(numChars);

    }

}