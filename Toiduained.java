public class Toiduained{
  String nimetus;
  double valgud;
  double rasvad;
  double susivesikud; //protsent


  public Toiduained(String nimetus, double valgud, double rasvad, double susivesikud){
    this.nimetus= nimetus;
    this.valgud= valgud;
    this.rasvad= rasvad;
    this.susivesikud= susivesikud;
  }

  public double getSusivesikud(){
    return susivesikud;
  }

}
