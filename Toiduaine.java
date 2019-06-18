public class Toiduaine{
	String nimetus;
	double valgud;
	double rasvad;
	double sysivesikud;
	
	public Toiduaine(String nimetus, double valgud, double rasvad, double sysivesikud){
    this.nimetus=nimetus;
    this.valgud=valgud;
    this.rasvad=rasvad;
    this.sysivesikud=sysivesikud;

    if(valgud+rasvad+sysivesikud>100){System.out.println("Koostis on vale:"+nimetus);}
    }
	
	public String kysiNimetus(){
		return nimetus;
	}
	public double kysiValgud(){
	return valgud;
	}
	public double kysiRasvad(){
		return rasvad;
	}
	public double kysiSysivesikud(){
		return sysivesikud;
	}
}
	
