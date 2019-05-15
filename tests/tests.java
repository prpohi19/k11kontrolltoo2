import org.junit.*;
import static org.junit.Assert.*;

public class tests {
    @Test
	public void proovitest(){
        System.out.println("Testi automaatkäivitus");
    }

    @Test
    public void test1(){
        ions Hydrogen = new ions("H+", 1.008, 1);
        System.out.println("ioni " + Hydrogen.iName + " mass on " + Hydrogen.ioniMass + " g·mol−1 ja laeng on " + Hydrogen.iCharge);   
    }

    @Test
    public void test2(){
        ions Nitrate = new ions("NO-3", 62.004, -1);
        System.out.println("ioni " + Nitrate.iName + " mass on " + Nitrate.ionimMass + " g·mol−1 ja laeng on " + Nitrate.iCharge);    
    }
}