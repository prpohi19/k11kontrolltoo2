package eu.j2rvaservud;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * LineMultipliedTest
 */
public class LineMultipliedTest {

    @Test
    public void testThreeXAt1() {
        LineInterface line = new LineMultiplied(3);
        assertEquals(3, line.findY(1), 0.00001);
    }

    @Test
    public void testThreeXAt3() {
        LineInterface line = new LineMultiplied(3);
        assertEquals(9, line.findY(3), 0.00001);
    }

    @Test
    public void testThreeXAt0() {
        LineInterface line = new LineMultiplied(3);
        assertEquals(0, line.findY(0), 0.00001);
    }

    @Test
    public void testThreeXAtMinus2() {
        LineInterface line = new LineMultiplied(3);
        assertEquals(-6, line.findY(-2), 0.00001);
    }
}