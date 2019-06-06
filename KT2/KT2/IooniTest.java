import org.junit.Test;
import static org.junit.Assert.*;
public class IooniTest {
    public IooniTest() {
    }
    @Test
    public void loomine(){
        Ioon ioon1 = new Ioon("H+", 1, 1);
        Ioon ioon2 = new Ioon ("NO3-", 3, -1);

        assertEquals(1, ioon1.kysiLaeng());
        assertEquals(3, ioon2.kysiAatomMass());
    }

}
