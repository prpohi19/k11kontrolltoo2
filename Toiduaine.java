public class Toiduaine{
  String nimetus;
  double valgud;
  double rasvad;
  double sysiv;
  public Toiduaine(String nimetus, double valgud, double rasvad, double sysiv){
    double protsent = valgud + rasvad + sysiv;
    //this.rasvad=rasvad;
    if(protsent > 100){
      System.out.println("Toitaine: " + nimetus + " väärtused ületavad 100% !");
    } else {
      System.out.println("Toiduaine: " + nimetus + ", Valke on: "+ valgud + ", Rasvu on: "+ rasvad + ", Süsivesikuid on: "+ sysiv );
    }
  }
}

// public class Toiduaine{
//   String nimetus;
//   double valgud;
//   double rasvad;
//   double sysiv;
//   public static void main(String []args) {
//     Toiduaine kartul = new Toiduaine( "Kartul", 1.71, 0.1, 20.01 );
//     Toiduaine hapukoor = new Toiduaine( "Hapukoor", 2.8, 20, 3.6 );
//     Toiduaine vorst = new Toiduaine( "Vorst", 21, 35, 1.1 );
    // Toiduaine.protsent = Toiduaine.valgud + Toiduaine.rasvad + Toiduaine.sysiv;
    // if(Toiduaine.protsent > 100){
    //   System.out.println("Toitaine väärtus ületab 100% !");
    // }
  // }
  // String nimetus;
  // double valgud; // g/100g toitaine kohta
  // double rasvad;
  // double sysiv;
  // public Toiduaine(String nimetus, double valgud, double rasvad, double sysiv){
  //   this.nimetus=nimetus;
  //   this.valgud=valgud;
  //   this.rasvad=rasvad;
  //   this.sysiv=sysiv;
  // }
  //
  // String kysiNimi(){
  //     return nimetus;
  // }
  // double kysiValk(){
  //     return valgud;
  // }
  // double kysiRasv(){
  //     return rasvad;
  // }
  // double kysiSysiv(){
  //     return sysiv;
  // }
// }
