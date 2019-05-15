public class Toit{
  String nimetus;
	Toidukomponent Toidukomponendid;
	public Toit(String nimetus, Toidukomponent Toidukomponendid){
		this.nimetus=nimetus;
		this.Toidukomponent=Toidukomponendid;
	}
	public String kysiNimetus(){
		return nimetus;
	}
	public double kysiKomponendid(){
		return Toidukomponendid;
	}

//Nimetus, toidukomponendid

//Toidu valkude, rasvade, süsivesikute korgus

//Loo retsepti järgi toit: nt. kartulisalat. Küsi toitaine kogused

//Rakendus näitab valitud toidu etteantud koguse jaoks vajalikud toiduained. (Automaattestid)

}
