public class Ckolm extends Cchord{
  int note2;
  int note3;

  public Ckolm(String name, int note, int note2, int note3){
    super(name="C-kolm", note = 60);
    this.note2 = 64;
    this.note3 = 67;
  }

  public int Cnotes(){
    System.out.println("C(60)-E(64)-G(67)");
    return 60+64+67;
  }
  public String CnotesString(){
    return "C-E-G";
  }
}
