import static java.lang.Math.*;
public class Pendulum {
	double vynkePeriod;
	double pikkus;
	int ticking;
	int rounds;
	Pendulum(double pikkus){
		vynkePeriod = 2 * PI * sqrt(pikkus/9.8);
		this.pikkus = pikkus;
		
	}
	
	public double vynkePeriod(){
		return vynkePeriod;
	}
	
	public int rounds(Gear g){
		if(ticking == rounds * g.gearTeeth() + g.gearTeeth()){ //algab uus ring kui on vyrdsed
			rounds += 1;
		}
		
		
		return rounds;
		
	}

	public String showTik(){
		return "TIK";
	}
	
	public int countTik(){
		ticking += 1;
		return ticking;
	}
}