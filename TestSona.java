import org.junit.*;
import static org.junit.Assert.*;

public class TestSona {
    @Test
    public void TestiPere(){
        Sona pere = new Sona("pere");
        int asid = pere.TahtedeEsinemine('a');
        int psid = pere.TahtedeEsinemine('p');
        int esid = pere.TahtedeEsinemine('e');

        System.out.println("Sõnas \"pere\" on a-tähti: "+ asid + ", p-tähti: " + psid + ", e-tähti: " + esid);

        assertEquals(asid, 0);
        assertEquals(psid, 1);
        assertEquals(esid, 2);
    }
}
