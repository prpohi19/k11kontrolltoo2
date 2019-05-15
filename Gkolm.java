public class Gkolm extends Cchord{
  int note2;
  int note3;

  public Gkolm(String name, int note, int note2, int note3){
    super(name="G-kolm", note = 67);
    this.note2 = 71;
    this.note3 = 74;
  }

  public int Gnotes(){
    System.out.println("G(67)-B(71)-D(74)");
    return 67+71+74;
  }
  public String GnotesString(){
    return "G-B-D";
  }
}
