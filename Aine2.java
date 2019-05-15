import java.util.*;

public class Aine2 implements AineInterface{
    private String name;
    private int molecularMass;

    public Aine2(List<Ioon> Ioonid){
        int check = checkCharges(Ioonid);
        if(check == 1){
            this.name = createName(Ioonid);
            this.molecularMass = calculateMass(Ioonid);
        }else{
            this.name = null;
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
    public int checkCharges(List<Ioon> Ioonid) {
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
    public int calculateMass(List<Ioon> Ioonid) {
        int mass = 0;
        for(Ioon ioon : Ioonid){
            mass += ioon.getAtomicMass();
        }

        return mass;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public String createName(List<Ioon> Ioonid) {
        List<String> positives = new ArrayList<String>();
        List<String> negatives = new ArrayList<String>();
        String pos = "";
        String neg = "";
        String finalName = "";
        for(Ioon ioon : Ioonid){
            if(ioon.getCharge() >= 0){
                positives.add(ioon.getName());
            }else{
                negatives.add(ioon.getName());
            }
        }

        Set<String> uniqueP = new HashSet<String>(positives);
        for (String key : uniqueP) {
            //System.out.println(key + ": " + Collections.frequency(positives, key));
            if(Collections.frequency(positives, key) > 1){
                pos += key + Collections.frequency(positives, key);
            }else{
                pos += key;
            }
        }

        Set<String> uniqueN = new HashSet<String>(negatives);
        for (String key : uniqueN) {
            //System.out.println(key + ": " + Collections.frequency(negatives, key));
            if(Collections.frequency(negatives, key) > 1){
                pos += key + Collections.frequency(negatives, key);
            }else{
                pos += key;
            }
        }

        finalName += pos;
        finalName += neg;
        return finalName;
    }
}
