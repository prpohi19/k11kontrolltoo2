public class Proov1{
  public static void main(String[] arg){
 //Kartuli toiteväärtus 100 g kohta: energiat 70-80 kcal, rasvu 0,1 g, valke 2 g, süsivesikuid 16 g = 16%
 //ehk kogus 1 kartuli puhul nt on 100g

 //hapukoor 100g toodet sisaldab  valke: 2.8g, rasvu 20g, susiveisikuid 3,6%=3,6g
 //moskva täissuitsu vorst 100g sisaldab: valke 16,7g, rasvu 43,1g, süsivesikuid 0,7g=0,7%

    //andmed on 100g kohtam

    Toiduained kartul = new Toiduained("Kartul", 2, 0.1, 16);
    Toiduained hapukoor= new Toiduained("Hapukoor", 2.8, 20, 3.6);
    Toiduained vorst= new Toiduained("Vorst", 16.7, 43.1, 0.7);



    Toidukomponendid first= new Toidukomponendid(kartul, 1); //1= 100g
    Toidukomponendid second = new Toidukomponendid(hapukoor, 0.3); //0.3=30g
    Toidukomponendid third= new Toidukomponendid(vorst, 0.5); // 0.5=50g

    System.out.println("Tere tulemast rasvakoguse arvutamise programmi juurde, siin näete mõningad rasvakogused protsentides");
    System.out.println("---------------------------------------------------");
    System.out.println("Kartuli rasvakogus on " +first.getRasvakogus() + "%");
    System.out.println("Hapukoore rasvakogus on " +second.getRasvakogus() + "%");
    System.out.println("Moskva täissuitsu vorsti rasvakogus on " +third.getRasvakogus() + "%");


  }
}
