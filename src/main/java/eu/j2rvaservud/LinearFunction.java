package eu.j2rvaservud;

/**
 * LinearFunction
 */
public class LinearFunction implements LineInterface {

    private double kordaja;
    private double vabaliige;

    public LinearFunction(double kordaja, double vabaliige) {
        this.kordaja = kordaja;
        this.vabaliige = vabaliige;
    }

    @Override
    public double findY(double x) {
        return kordaja * x + vabaliige;
    }

    @Override
    public String toString() {
        return "y = " + kordaja + "x + " + vabaliige;
    }
    
}