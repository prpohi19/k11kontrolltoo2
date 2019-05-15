import java.lang.Math;
import static java.lang.Math.PI;


public class Vonkeperiood{
	public static double vp(double pikkus){
		return 2 * PI * Math.sqrt(pikkus/9.8);
	}
}