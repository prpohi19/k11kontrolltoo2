import org.junit.*;
import static org.junit.Assert.*;

public class Testid{
    @Test
    public void esimene(){
        Sona sona = new Sona("pere");
        String c = "a";
        assertEquals(0, sona.taheEsinemine(c));
    }
    @Test
    public void teine(){
        Sona sona = new Sona("pere");
        String c = "p";
        assertEquals(1, sona.taheEsinemine(c));
    }
    @Test
    public void kolmas(){
        Sona sona = new Sona("pere");
        String c = "e";
        assertEquals(2, sona.taheEsinemine(c));
    }
    @Test
    public void neljas(){
        String c = "a";
        Lause lause = new Lause("Juku läks kooli aabitsa ja ranitsaga");
        assertEquals(7, lause.taheEsinemine(c));
    }
}