//Kert Liinat
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class main{




  public static void main(String[] args) throws Exception{
    File fail = new File("tekstifail.txt");
    Scanner input = new Scanner(fail);
    int lugeja = 0;
    int teineLugeja = 0;

    List<String> sõnad = new ArrayList<String>();
    List<String> kolmesedSõnad = new ArrayList<String>();

    while(input.hasNext()){
      String sõna = input.next();
      //System.out.println(sõna);
      lugeja = lugeja + 1;
      sõnad.add(sõna);
      if(sõna.length() == 3){
        teineLugeja = teineLugeja + 1;
        //kolmesedSõnad.add(sõna);
        //if(kolmesedSõnad.size() % 17  == 0){
          //System.out.println("Sõnade arv kus täitus 17 kolmest"+sõnad.size());
        }
      }
        //System.out.println("Sõnade arv: "+ lugeja);
        System.out.println("Esimene sõna: "+ sõnad.get(0));
        //System.out.println("Esimene kolmene sõna: "+ kolmesedSõnad.get(0));
        System.out.println("Kolmetähelisi sõnu on: "+ teineLugeja+" tükki");
        int kümnendikKolmestest = teineLugeja/10;
        int kümnendik = lugeja/10;

        for(int i = 0; i < 10; i++){
          //System.out.println(kümnendik);
          //System.out.print();
          int asimidaprintida = lugeja-(kümnendik*i);
          System.out.println(asimidaprintida+"|");
          for(int k = 0; k < asimidaprintida; k++){
            if(sõnad.get(k).length() == 3 ){
              //teineLugeja++;
              kolmesedSõnad.add(sõnad.get(k));

            }
          }
          //System.out.println(teineLugeja-(kümnendikKolmestest*i));




        }
          System.out.print("     ");
          System.out.println("_  _  _  _  _  _  _  _  _  _ ");
          System.out.print("     ");
          for(int j = 1; j < 11; j++){
            System.out.print(kümnendikKolmestest*j+",");
          }
          System.out.println();
          System.out.println();



    }
  }
