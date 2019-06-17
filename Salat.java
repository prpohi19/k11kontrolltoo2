import java.util.*;
public class Salat{
    double toidukogus;
    double rasvakogus;
    public Salat(String nimetus, double valk, double rasv, double sysivesik){
        if(valk + rasv + sysivesik > 100){
            System.out.println("veateade");
        }else{
            System.out.println(nimetus + ": " + valk + "% valke, " + rasv + "% rasvu, " + sysivesik + "% sysivesikuid");
        }
    }
    public void Toidukomp(double kogus, double rasv){
        toidukogus = kogus;
        rasvakogus = kogus * rasv / 100;
    }
    public static void main(String args[]){
        Salat kartul = new Salat("kartul", 1.7, 0.1, 20);
        Salat hapukoor = new Salat("hapukoor", 0.9, 9.6, 2.4);
        Salat vorst = new Salat("vorst", 13, 19, 3);
        kartul.Toidukomp(100, 0.1);
        hapukoor.Toidukomp(30, 9.6);
        vorst.Toidukomp(50, 19);
        System.out.println("\n");
        System.out.println(kartul.toidukogus + " grammis kartulis on " + kartul.rasvakogus + " grammi rasva");
        System.out.println(hapukoor.toidukogus + " grammis hapukoores on " + hapukoor.rasvakogus + " grammi rasva");
        System.out.println(vorst.toidukogus + " grammis vorstis on " + vorst.rasvakogus + " grammi rasva");

        /*Scanner Uus = new Scanner(System.in);
        System.out.println("Sisesta nimetus, valkude, rasvade ja süsivesikute protsent");
        String name = Uus.nextLine();
        double valk = Uus.nextDouble();
        double rasv = Uus.nextDouble();
        double sysiv = Uus.nextDouble();
        Uus.close();
        Salat sisestus = new Salat(name, valk, rasv, sysiv);*/
    }
}

/*
OUTPUT
Salat
kartul: 1.7% valke, 0.1% rasvu, 20.0% sysivesikuid
hapukoor: 0.9% valke, 9.6% rasvu, 2.4% sysivesikuid
vorst: 13.0% valke, 19.0% rasvu, 3.0% sysivesikuid


100.0 grammis kartulis on 0.1 grammi rasva
30.0 grammis hapukoores on 2.88 grammi rasva
50.0 grammis vorstis on 9.5 grammi rasva
*/
