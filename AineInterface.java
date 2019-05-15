import java.util.List;

public interface AineInterface {
    public String getName();
    public int getMolecularMass();
    public int checkCharges(List<Ioon> Ioonid);
    public int calculateMass(List<Ioon> Ioonid);
    public String createName(List<Ioon> Ioonid);
}
