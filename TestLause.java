import org.junit.*;
import static org.junit.Assert.*;

public class TestLause {
    @Test
    public void TestiLoremit(){
        Lause lorem = new Lause("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        int asid = lorem.TahtedeEsinemine('a');

        System.out.println("Lorem ipsumis on " + asid + " a-tähte.");

        assertEquals(asid, 2);
    }

    @Test
    public void NeliSona(){
        Lause test = new Lause("Siin on neli sõna");
        int sonu = test.SonadeArv();
        System.out.println("Siin on neli sõna - " + sonu);

        assertEquals(sonu, 4);
    }
}
