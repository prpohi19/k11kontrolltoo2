import java.util.ArrayList;
import java.util.Scanner;

public class MajorChord{

  public static void main(String[] arg){
    int type;
    ArrayList<String> notes = new ArrayList<String>();

    Scanner reader = new Scanner(System.in);
    System.out.println("Mitmest taktist lugu koosneb?");
    int measure = Integer.parseInt(reader.nextLine());
    for(int i=0;i<measure;i++){
      System.out.println("Sisestage noot " + (i+1) + ": ");
      String userNote = reader.nextLine();
      notes.add(userNote);
    }
    System.out.println("Sisesta 0 numbrite jaoks ja 1 noodinimede jaoks");
    type = Integer.parseInt(reader.nextLine());
    System.out.println("-----------------------------------------------");

    Cchord C = new Cchord("C", 60);
    Cchord Cs = new Cchord("C#", 61);
    Cchord D = new Cchord("D", 62);
    Cchord Ds = new Cchord("Eb", 63);
    Cchord E = new Cchord("E", 64);
    Cchord F = new Cchord("F", 65);
    Cchord Fs = new Cchord("F#", 66);
    Cchord G = new Cchord("G", 67);
    Cchord Gs = new Cchord("G#", 68);
    Cchord A = new Cchord("A", 69);
    Cchord Bb = new Cchord("Bb", 70);
    Cchord B = new Cchord("B", 71);
    Cchord[] m = {C, Cs, D, Ds, E, F, Fs, G, Gs, A, Bb, B};
    Ckolm Ckolm = new Ckolm("C1", 1, 2, 3);
    Fkolm Fkolm = new Fkolm("F1", 1, 2, 3);
    Gkolm Gkolm = new Gkolm("G1", 1, 2, 3);
    Cchord[] kolmArray = {Ckolm, Fkolm, Gkolm};
    Lugu lugu1 = new Lugu(notes);
    int size = notes.size();

    String HTML = "";


    if(notes.size() > 0){
      HTML += "<ul>";
      for(int i = 0; i<notes.size();i++){
        if(notes.get(i).equals("C")){
          HTML +="<li>"+Ckolm.CnotesString()+"</li>";
        }
        if(notes.get(i).equals("F")){
          HTML +="<li>"+Fkolm.FnotesString()+"</li>";
        }
        if(notes.get(i).equals("G")){
          HTML +="<li>"+Gkolm.GnotesString()+"</li>";
        }
      }
      HTML += "</ul>";
    }
    Cs.rootPitch(type, notes, size);
    }
}
