package eu.j2rvaservud;

/**
 * LineMultiplied
 */
public class LineMultiplied implements LineInterface {

    private double kordaja;

    public LineMultiplied(double kordaja) {
        this.kordaja = kordaja;
    }

    @Override
    public double findY(double x) {
        return kordaja * x;
    }

    @Override
    public String toString() {
        return "y = " + kordaja + "x";
    }
    
}