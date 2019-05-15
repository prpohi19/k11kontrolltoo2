public class Ioon implements IoonInterface {
    private String name;
    private int charge;
    private int atomicMass;

    public Ioon(String name, int charge, int aM){
        this.name = name;
        this.charge = charge;
        this.atomicMass = aM;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCharge() {
        return this.charge;
    }

    @Override
    public int getAtomicMass() {
        return this.atomicMass;
    }
}
