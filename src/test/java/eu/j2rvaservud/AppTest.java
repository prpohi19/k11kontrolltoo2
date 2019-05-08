package eu.j2rvaservud;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    // FindAllYs with LinearFunction y = 2x + 5
    @Test
    public void testFindAllYWithLinearFunction() {
        LineInterface line = new LinearFunction(2, 5);
        assertArrayEquals(new double[] { 5, 9, 0 }, App.findAllY(new double[] { 0, 2, -2.5 }, line), 0.0001);
    }

    // FindAllYs with LineMultiplied y = 4x
    @Test
    public void testFindAllYWithLineMultiplied() {
        LineInterface line = new LineMultiplied(4);
        assertArrayEquals(new double[] { 0, 8, -10 }, App.findAllY(new double[] { 0, 2, -2.5 }, line), 0.0001);
    }

    @Test
    public void testFindAllYWithEmptyXs() {
        LineInterface line = new LineMultiplied(4);
        assertArrayEquals(new double[] {}, App.findAllY(new double[] {}, line), 0.0001);
    }

    @Test
    public void testGetLineFromFile() throws IOException {
        assertArrayEquals(new double[] {-9, -4, 1, 6, 11, 16, 21, 26}, App.getLineFromFile("joon_test.txt"), 0.0001);
    }
}
