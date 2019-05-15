import java.lang.Math;
import static java.lang.Math.PI;
import java.util.Timer;
import java.util.TimerTask;

//https://www.geeksforgeeks.org/java-util-timertask-class-java/

public class KT_Proov{
    public static void main(String[] args){
		double vonkeperiood, pikkus;
		pikkus = 3;
		vonkeperiood = Vonkeperiood.vp(pikkus);
		System.out.println(vonkeperiood);
		
		class vonkeperiood extends TimerTask {
			int a = 0,b = 0,c = 0,hammasrattas2 = 60,hammasrattas1 = 60, min = 0, tund = 0, sec = 1;
			public void run() {
				
				b ++;
				if (b == hammasrattas1){
					System.out.println("Minut");
					b = 0;
					c ++;
				}
				if (c == hammasrattas2){
					System.out.println("Tund");
					c = 0;
				}
				if (sec == 60){
					sec = 0;
					min ++;
					if (min == 60){
						min = 0;
						tund ++;
					}
				}
				sec ++;
				System.out.println (tund + ":" + min + ":" + sec);
				System.out.println ("Sekundi hammasratas on pöördunud " + 360/60*sec + " kraadi peale");
				System.out.println ("Minuti oma rattas " + 360/60*min+ " kraadi peale");
				System.out.println ("Tunni oma rattas " + 360/60 * tund + " kraadi peale");
			}
		}
		// creating an instance of timer class 
		Timer timer = new Timer();
		timer.schedule(new vonkeperiood(), 0, (int) Math.round(vonkeperiood*100));
	}
}

