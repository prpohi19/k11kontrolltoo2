import java.util.Scanner;
public class Toiduaineobjekt{
  public static void main(String[] arg){
    String nimetus;
    double valgud;
    double rasvad;
    double susivesikud;
    String s=null;
    String tegevus;

    Scanner input = new Scanner(System.in);

    System.out.println("Kas soovite lisada uut toiduainet?(jah/ei) ");
    String s=input.next();
    if(s== "jah"){
      System.out.println("Sisestage toiduaine nimetus: ");
      nimetus= input.next();
      System.out.println("Sisestage valkude kogus: ");
      valgud= input.nextDouble();
      System.out.println("Sisestage rasvade kogus: ");
      rasvad=input.nextDouble();
      System.out.println("Sisestage susivesikute kogus: ");
      susivesikud= input.nextDouble();
    } if(s== "ei"){
      System.out.println("Kas soovite veel midagi teha ? ");
      tegevus= input.next();
    } else{
      System.out.println("Sisestasite vale sõna");
    }
  }


}
