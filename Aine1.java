import java.util.ArrayList;
import java.util.List;

public class Aine1 implements AineInterface{
    private String name;
    private int molecularMass;

    public Aine1(List<Ioon> Ioonid){
        int check = checkCharges(Ioonid);
        if(check == 1){
            this.name = createName(Ioonid);
            this.molecularMass = calculateMass(Ioonid);
        }else{
            this.name = "Aine pole võimalik";
            this.molecularMass = 0;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getMolecularMass() {
        return this.molecularMass;
    }

    @Override
    public int checkCharges(List<Ioon> Ioonid){
        int charges = 0;
        for(Ioon ioon : Ioonid){
            charges += ioon.getCharge();
        }
        if(charges == 0){
            return 1;
        }else{
            return  0;
        }
    }

    @Override
    public int calculateMass(List<Ioon> Ioonid){
        int mass = 0;
        for(Ioon ioon : Ioonid){
            mass += ioon.getAtomicMass();
        }

        return mass;
    }

    @Override
    public String createName(List<Ioon> Ioonid) {
        String positives = "";
        String negatives = "";
        String finalName = "";
        for(Ioon ioon : Ioonid){
            if(ioon.getCharge() >= 0){
                positives += ioon.getName();
            }else{
                negatives += ioon.getName();
            }
        }
        finalName += positives;
        finalName += negatives;
        return finalName;
    }
}
