public class Salat{
  public static void main(String[] arg){
    /*
    Toiduaine kartul = new Toiduaine( "Kartul", 1.71, 0.1, 20.01 );
    Toiduaine hapukoor = new Toiduaine( "Hapukoor", 2.8, 20, 3.6 );
    Toiduaine vorst = new Toiduaine( "Vorst", 21, 35, 1.1 );
    */
    Toidukomponent k1 = new Toidukomponent ("Kartul", 100, 1.71, 0.1, 20.01);
    Toidukomponent h1 = new Toidukomponent ("Hapukoor", 30, 2.8, 20, 3.6);
    Toidukomponent v1 = new Toidukomponent ("Vorst", 50, 21, 35, 1.1);

    //System.out.println("Komponendi " + k1.nimetus + " rasvasisaldus on: " + k1.rasvasisaldus());
  }
}
