import java.io.*;
import java.net.*;
import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Loput2hed{

  public static void main(String [] args) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();

       String fileName = "input.txt";
       // This will reference one line at a time
       String line = null;
       try {
           // FileReader reads text files in the default encoding.
           FileReader fileReader = new FileReader(fileName);
           // Always wrap FileReader in BufferedReader.
           BufferedReader bufferedReader =  new BufferedReader(fileReader);

           List<String> words = new ArrayList<String>();
           List<String> letters = new ArrayList<String>();
           String[] word;

           while((line = bufferedReader.readLine()) != null) {
             word = line.split("\\s");//splits the string based on whitespace

             for (String w : word)
            {
              words.add(w.toLowerCase());
              //System.out.println(w + "\n");
            }
             //System.out.println("last character: " + words.substring(words.length() - 1));
             //System.out.println(line);
           }
           //TRÜKI VIIMASED TÄHED
           for(String l: words){
             String last;
             if (l.length() > 0){
               last = l.substring(l.length()-1, l.length());
               if(! last.equals(".")){
                 System.out.print(last);
                 letters.add(last);
               }
             }
             //else{System.out.println("");}
             //String last = l.substring(l.length() - 1);
             /*if(last != "."){ // <- miks ei tööta?
               System.out.println(last);
               letters.add(last);
             }*/
           }
           int counter = 0;
           System.out.println("\n");
           //ESINEMISSAGEDUS
           for(String c: letters){
             if(map.containsKey(c.charAt(0))){
               int cnt = map.get(c.charAt(0));
               map.put(c.charAt(0), map.get(c.charAt(0))+ 1);
             } else{
               map.put(c.charAt(0), 1);
               counter += 1;
             }

             /*for(String c: letters){
               if(map.containsKey(c)){
                 int cnt = map.get(c.charAt(0));
                 map.put(c.charAt(0), ++cnt);
               } else{
                 map.put(c.charAt(0), 1);
               }*/




             /*if (cnt == 1) {
      				System.out.println("Number of Occurrence of " + c.charAt(o) + " letter is:" + cnt[c.charAt(0)]);
      			}*/
           }
           //võiks printida esinemisssagedused
           for (Map.Entry entry : map.entrySet()) {
             String output = entry.getKey() + " (" + entry.getValue() + ")" + ".txt";
             if (new File(output).createNewFile())
             {
                 System.out.println("Fail " + output + " loodud!");
             }
             else
             {
                 System.out.println("Faili loomisel tekkis viga");
             }
             System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
          }
           //map.keySet().stream().forEach(el-> System.out.println(el +" ("+ cnt + ")"));

           // Always close files.
           bufferedReader.close();
       }
       catch(FileNotFoundException ex) {
           System.out.println(
               "Ei saanud faili '" + fileName + "' avada");
       }
       catch(IOException ex) {
           System.out.println(
               "Faili '"
               + fileName + "' lugemisel tekkis viga");
       }

       /*//mitme faili genereerimine
       for(int i=1 ; i<=counter ; i++){
           String fileName =  + i + ".txt";
           if (new File(filename).createNewFile())
           {
               // file created successfully
           }
           else
           {
               // error, do something appropriate
           }
       }*/





   }
}


  /*public static void main(String[] arg) throws Exception{
    BufferedReader lugeja = new BufferedReader("input.txt");
    System.out.println(lugeja.readLine());
    String rida = lugeja.readLine();

    while(rida != null){
      String[] m = rida.split(" ");
      String string = arg[0];
      System.out.println("last character: " + string.substring(string.length() - 1));

      }

    //String input = "input.txt";
    //String output = "letter.txt";
    //Viimane täht:
    }
  }

*/
/*
//mitme faili genereerimine
for(int i=1 ; i<=5 ; i++){
    String fileName = "name" + i + ".txt";
    if (new File(filename).createNewFile())
    {
        // file created successfully
    }
    else
    {
        // error, do something appropriate
    }
}

//Lisa tähestiku loop:
String output = "";

for(char alphabet = 'a'; alphabet <='z'; alphabet++ )
    {
        output += alphabet;
        System.out.println(output);
    }

    */
