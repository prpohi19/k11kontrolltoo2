public class Toidukomponent extends Toiduaine{
  static double kogus; //grammides
  String nimetus;
  double rasvad;
  //Loo näidiskomponendid: nt. 100g kartuleid, 30g hapukoort, 50g vorsti
  public Toidukomponent(String nimetus, double kogus, double valgud, double rasvad, double sysiv){
    super(nimetus, valgud, rasvad, sysiv);
    this.nimetus=nimetus;
    this.kogus=kogus;
    this.rasvad=rasvad;
    // Toidukomponent k1 = new Toidukomponent (nimetus, 100);
    // Toidukomponent h1 = new Toidukomponent (nimetus, 30);
    // Toidukomponent v1 = new Toidukomponent (nimetus, 50);
    System.out.println("Komponendi " + nimetus + " rasvasisaldus on: " + rasvasisaldus());
  }
  //Käsklus selle sees leiduva rasvasisalduse leidmiseks
  public double rasvasisaldus() {
    return rasvad * kogus * 1.0 / 100;
  }

}
