public class Cchord extends Chords{
  String name;

  public Cchord(String name, int note){
    super(note);
    this.name=name;
  }

  public String chordPitch(int note){
    int fundamenTone = note;
    int secondNote = note + 4;
    int thirdNote = note + 7;
    //System.out.println(fundamenTone +" "+secondNote+" "+thirdNote);
    return fundamenTone + " " + secondNote +" "+ thirdNote;
  }

  public String identifyChord(Chords[] chord, String[] notes){
    String vastus = "";
    int i = 0;
    for(Chords c:chord){

      //System.out.println(c);
        System.out.println(notes[i]);

        if(notes[i].charAt(0) == 'C'){
          vastus+= "C-duur " + c.chordPitch(60) + "\n";
        }
        if(notes[i].charAt(0) == 'F'){
          vastus+= "F-duur " + c.chordPitch(65) + "\n";
        }
        if(notes[i].charAt(0) == 'G'){
          vastus+= "G-duur " + c.chordPitch(67) + "\n";
        }

        i++;

      }
    return vastus;
  }

  public int Midi(String[] notes){
    for(int i = 0; i<notes.length;i++){
      if(notes[i].charAt(0) == 'C'){
        return 60;
      }
      if(notes[i].charAt(0) == 'C' && notes[i].charAt(1) == '#'){
        return 61;
      }
      if(notes[i].charAt(0) == 'D'){
        return 62;
      }
      if(notes[i].charAt(0) == 'E' && notes[i].charAt(1) == 'b'){
        return 63;
      }
      if(notes[i].charAt(0) == 'F'){
        return 64;
      }
      if(notes[i].charAt(0) == 'F' && notes[i].charAt(1) == '#'){
        return 65;
      }
      if(notes[i].charAt(0) == 'G'){
        return 66;
      }
      if(notes[i].charAt(0) == 'G' && notes[i].charAt(1) == '#'){
        return 67;
      }
      if(notes[i].charAt(0) == 'A'){
        return 68;
      }
      if(notes[i].charAt(0) == 'B'){
        return 69;
      }
      if(notes[i].charAt(0) == 'H'){
        return 70;
      }
      if(notes[i].charAt(0) == 'C'){
        return 71;
      }

    }
    return 0;
  }


}
