import org.junit.*;
import static org.junit.Assert.*;
//javac -cp junit4.jar:. fileName.java
//java -cp junit4.jar:. org.junit.runner.JUnitCore fileName

public class AlamklassidTest{

  @Test
  public void first(){
    System.out.println("Testi automaatkäivitus");
  }

  Chords chord1 = new Cchord("C-akkord", 60);
  Chords chord2 = new Gchord("F-akkord", 65);
  Chords chord3 = new Fchord("G-akkord", 67);
  Chords[] m = {chord1, chord2, chord3};
  String[] notes = {"C", "F", "G"};

  @Test
  public void findKeyPitchTest1(){
    System.out.println(chord1.chordPitch(60));
  }

  @Test
  public void findKeyPitchTest2(){
    System.out.println(chord1.identifyChord(m, notes));
  }




}
