public class Aine implements Ained{
    public String nimetus;
    public int molMass;
    public Ioon ioon1;
    public Ioon ioon2;

    public Aine(Ioon ioon1, Ioon ioon2){
        if (ioon1.kysiLaeng() > 0 && ioon2.kysiLaeng() < 0) {
            if (ioon1.kysiLaeng() == (ioon2.kysiLaeng() * -1)) {
                this.nimetus = ioon1.kysiNimetus() + ioon2.kysiNimetus();
                this.molMass = ioon1.kysiAatomMass() + ioon2.kysiAatomMass();
                this.ioon1 = ioon1;
                this.ioon2 = ioon2;
            }

        } else if (ioon2.kysiLaeng() > 0 && ioon1.kysiLaeng() < 0) {
            if (ioon2.kysiLaeng() == (ioon1.kysiLaeng() * -1)) {
                this.nimetus = ioon2.kysiNimetus() + ioon1.kysiNimetus();
                this.molMass = ioon1.kysiAatomMass() + ioon2.kysiAatomMass();
                this.ioon1 = ioon1;
                this.ioon2 = ioon2;
            }

        }

    }
    @Override
    public String kysiNimetus(){
        return nimetus;
    }
    public int kysiMolMass(){
        return molMass;
    }
}
