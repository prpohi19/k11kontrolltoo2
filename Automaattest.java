import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
//javac -cp junit4.jar:. fileName.java
//java -cp junit4.jar:. org.junit.runner.JUnitCore fileName

public class Automaattest{

  int type = 1;
  ArrayList<String> notes = new ArrayList<String>(Arrays.asList("C#", "Eb", "B"));

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

  @Test
  public void Start(){
    System.out.println("Testi automaatkäivitus");
  }

  @Test
  public void firstTest(){
    assertEquals(191, C.chordPitch(60));
  }
  @Test
  public void secondTest(){
    assertEquals(191, Ckolm.Cnotes());
    assertEquals(206, Fkolm.Fnotes());
    assertEquals(212, Gkolm.Gnotes());
  }

  @Test
  public void thirdTest(){
    assertEquals(19, Cs.rootPitch(type,notes,size));
    type = 0;
    assertEquals(77, Cs.rootPitch(type,notes,size));
  }

}
