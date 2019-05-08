import static java.lang.Math.*;
public class Main {
	public static void main(String [] args) throws InterruptedException
	{
		Pendulum p1 = new Pendulum(5.0);
		double period = 1000 * p1.vynkePeriod(); // ms to s
		boolean status = true;
		while(status == true){
		Thread.sleep((int) round(period));
		Gear g1 = new Gear(3);
		System.out.println(p1.showTik());
		System.out.println(p1.rounds(g1) + " rounds");
		System.out.println("Ticks: " + p1.countTik());
		}
	}
}