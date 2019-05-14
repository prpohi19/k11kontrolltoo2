public class Fkolm extends Cchord{
  int note2;
  int note3;

  public Fkolm(String name, int note, int note2, int note3){
    super(name="F-kolm", note = 65);
    this.note2 = 69;
    this.note3 = 72;
  }

  public int Fnotes(){
    System.out.println("F(65)-A(69)-C(72)");
    return 65+69+72;
  }
  public String FnotesString(){
    return "F-A-C";
  }
}
