package eu.j2rvaservud;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * LinearFunctionTest
 */
public class LinearFunctionTest {

    // y = 3x testid
    @Test
    public void testThreeXAt2() {
        LineInterface line = new LinearFunction(3, 0);
        assertEquals(6, line.findY(2), 0.00001);
    }

    @Test
    public void testThreeXAtMinus2() {
        LineInterface line = new LinearFunction(3, 0);
        assertEquals(-6, line.findY(-2), 0.00001);
    }

    @Test
    public void testThreeXAt0() {
        LineInterface line = new LinearFunction(3, 0);
        assertEquals(0, line.findY(0), 0.00001);
    }

    // y = 3x + 2 testid
    @Test
    public void testThreeXPlusTwoAt2() {
        LineInterface line = new LinearFunction(3, 2);
        assertEquals(8, line.findY(2), 0.00001);
    }

    @Test
    public void testThreeXPlusTwoAtMinus2() {
        LineInterface line = new LinearFunction(3, 2);
        assertEquals(-4, line.findY(-2), 0.00001);
    }

    @Test
    public void testThreeXPlusTwoAt0() {
        LineInterface line = new LinearFunction(3, 2);
        assertEquals(2, line.findY(0), 0.00001);
    }
}