public class MajorChord{



  public static void main(String[] arg){

    String[] notes = {"C", "F", "G"};

    Chords chord1 = new Cchord("C-akkord", 60);
    Chords chord2 = new Cchord("F-akkord", 65);
    Chords chord3 = new Cchord("G-akkord", 67);
    Chords[] m = {chord1, chord2, chord3};

    //identifyChord(m, notes);
    //System.out.println(m[0]);
    //Cchord.chordPitch(60);

    System.out.println(chord1.identifyChord(m, notes));
    //System.out.println(Midi(notes));


    }
}
