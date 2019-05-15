import java.util.*;
public class ions implements ionsInterface {
    public String iName;
    public double ioniMass;
    public double iCharge;

    public ions (String iName, double ioniMass, double iCharge){
        this.iName = iName;
        this.ioniMass = ioniMass;
        this.iCharge = iCharge;
    }

    /* public double vordle(ions.iCharge){
        int vastus = 0;
        if(ions.iCharge == ions.iCharge){
            System.out.println("võrdsed");
            vastus = 1;
        } else {
            System.out.println("ei ole võrdsed");
            vastus = 666;
        }
        return vastus;
    } */
}