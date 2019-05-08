public abstract class Chords{
  int note;

  public Chords(int note){
    this.note=note;
  }

  abstract String chordPitch(int note);
  abstract String identifyChord(Chords[] chord, String[] notes);
  abstract int Midi(String[] notes);



}
