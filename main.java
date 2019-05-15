public class main {

    public static void main(String[] args) {
        ions Hydrogen = new ions("H+", 1.008, 1);
        ions Nitrate = new ions("NO-3", 62.004, -1);
        ions Sodium = new ions("Na", 22.989, 1);
        ions Chlorine = new ions("Cl", 35.45, -1);
        System.out.println("ioni " + Hydrogen.iName + " mass on " + Hydrogen.ioniMass + " g·mol−1 ja laeng on " + Hydrogen.iCharge);
        System.out.println("ioni " + Nitrate.iName + " mass on " + Nitrate.ioniMass + " g·mol−1 ja laeng on " + Nitrate.iCharge);
        System.out.println("ioni " + Sodium.iName + " mass on " + Sodium.ioniMass + " g·mol−1 ja laeng on " + Sodium.iCharge);
        System.out.println("ioni " + Chlorine.iName + " mass on " + Chlorine.ioniMass + " g·mol−1 ja laeng on " + Chlorine.iCharge);
        /* vordleja = new aineMerge();
        double vastus = vordleja(Sodium, Chlorine); */

       /*System.out.println(vastus); */
        /* ions.vordle = new vordle(Sodium, Chlorine); */
        System.out.println(ions.vordle(Sodium, Chlorine));
    }
}