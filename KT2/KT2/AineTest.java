import org.junit.Test;
import static org.junit.Assert.*;
public class AineTest {
    public AineTest() {
    }
    @Test
    public void looAine(){
        Ioon ioon1 = new Ioon("Na", 23, 1);
        Ioon ioon2 = new Ioon("Cl", 35, -1);
        Aine aine1 = new Aine(ioon1, ioon2);
        System.out.println(aine1.kysiNimetus());
        assertEquals(58, aine1.kysiMolMass());
        assertEquals("NaCl", aine1.kysiNimetus());
    }
    @Test
    public void looAine2(){
        Ioon ioon1 = new Ioon("Ca", 40, 2);
        Ioon ioon2 = new Ioon("O", 16, -2);
        Aine aine1 = new Aine(ioon1, ioon2);
        System.out.println(aine1.kysiNimetus());
        assertEquals(56, aine1.kysiMolMass());
        assertEquals("CaO", aine1.kysiNimetus());
    }
    @Test
    public void looAine3(){
        Ioon ioon1 = new Ioon("Ca", 40, 2);
        Ioon ioon2 = new Ioon("Cl", 35, -1);
        Aine aine1 = new Aine(ioon1, ioon2);;
        System.out.println(aine1.kysiNimetus());
        assertEquals(0, aine1.kysiMolMass());
        assertNull(aine1.kysiNimetus());
    }
}
