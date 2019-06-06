public class Ioon implements Ioonid{
    String nimetus;
    int aatomMass;
    int laeng;

    public Ioon(String nimetus, int aatomMass, int laeng) {
       this.nimetus = nimetus;
       this.aatomMass = aatomMass;
       this.laeng = laeng;
    }
    @Override
    public String kysiNimetus(){
        return nimetus;
    }
    @Override
    public int kysiAatomMass(){
        return aatomMass;
    }
    @Override
    public int kysiLaeng(){
        return laeng;
    }
}
