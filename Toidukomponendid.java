public class Toidukomponendid{
  double kogus;
  Toiduained toiduained;
  double rasvadeProtsent;

  public Toidukomponendid(Toiduained toiduained, double kogus){
    this.kogus=kogus;
    this.toiduained=toiduained;
    }

  public double getRasvakogus(){

    if(toiduained.susivesikud <= 100.0){
      rasvadeProtsent= toiduained.rasvad *kogus; //leiab rasva protsendi, kui koguse väärtus 1= 100g
      return rasvadeProtsent;
      }
    else {
      System.out.println("Kahjuks on protsent üle 100, ei saa teha arvutusi");
      }
      return rasvadeProtsent;
    }
  }
