public class Toidukomponent{
	public static void main(String[] arg){
		Toiduaine vorst = new Toiduaine("vorst", 15, 25, 10); //100g
		Toiduaine sai = new Toiduaine("sai", 2, 4, 60);
		Toiduaine hapukoor = new Toiduaine("hapukoor", 44, 44, 44);
		System.out.println("Vorsti 100g rasvaprotsent on: " + vorst.kysiRasvad());
	}
}