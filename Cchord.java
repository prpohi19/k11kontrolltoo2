import java.util.ArrayList;

public class Cchord{
  String name;
  int note;

  public Cchord(String name, int note){
    this.name=name;
    this.note= note;
  }

  public int chordPitch(int note){
    int fundamenTone = note;
    int secondNote = note + 4;
    int thirdNote = note + 7;
    System.out.println(fundamenTone +" "+secondNote+" "+thirdNote);
    return fundamenTone + secondNote + thirdNote;
  }

  public int rootPitch(int type, ArrayList notes, int size){
    int control = 0;
    for(int i=0;i<notes.size();i++){
      if(type == 1){
        if(notes.get(i).equals("C")){
          System.out.println("C-E-G");
          control += 1;
        }
        if(notes.get(i).equals("C#")){
          System.out.println("C#-E#-G#");
          control += 2;
        }
        if(notes.get(i).equals("D")){
          System.out.println("D-F#-A");
          control += 3;
        }
        if(notes.get(i).equals("Eb")){
          System.out.println("Eb-G-Bb");
          control += 4;
        }
        if(notes.get(i).equals("E")){
          System.out.println("E-G#-H");
          control += 5;
        }
        if(notes.get(i).equals("F")){
          System.out.println("F-A-C");
          control += 7;
        }
        if(notes.get(i).equals("F#")){
          System.out.println("F#-A#-G#");
          control += 8;
        }
        if(notes.get(i).equals("G")){
          System.out.println("G-B-D");
          control += 9;
        }
        if(notes.get(i).equals("G#")){
          System.out.println("G#-B#-D#");
          control += 10;
        }
        if(notes.get(i).equals("A")){
          System.out.println("A-C#-E");
          control += 11;
        }
        if(notes.get(i).equals("Bb")){
          System.out.println("Bb-D-F");
          control += 12;
        }
        if(notes.get(i).equals("B")){
          System.out.println("B-D#-F#");
          control += 13;
        }
      }else{
        if(notes.get(i).equals("C")){
          System.out.println("60");
          control += 14;
        }
        if(notes.get(i).equals("C#")){
          System.out.println("61");
          control += 15;
        }
        if(notes.get(i).equals("D")){
          System.out.println("62");
          control += 16;
        }
        if(notes.get(i).equals("Eb")){
          System.out.println("63");
          control += 17;
        }
        if(notes.get(i).equals("E")){
          System.out.println("64");
          control += 18;
        }
        if(notes.get(i).equals("Eb")){
          System.out.println("65");
          control += 19;
        }
        if(notes.get(i).equals("F")){
          System.out.println("66");
          control += 20;
        }
        if(notes.get(i).equals("F#")){
          System.out.println("67");
          control += 21;
        }
        if(notes.get(i).equals("G")){
          System.out.println("68");
          control += 22;
        }
        if(notes.get(i).equals("G#")){
          System.out.println("69");
          control += 23;
        }
        if(notes.get(i).equals("A")){
          System.out.println("70");
          control += 24;
        }
        if(notes.get(i).equals("Bb")){
          System.out.println("71");
          control += 25;
        }
        if(notes.get(i).equals("B")){
          System.out.println("72");
          control += 26;
        }
      }
    }


    return control;
  }






}
