
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Tests {


    @Test
    public void test1(){
        Ioon VesinikPlus = new Ioon("H", 1, 1);
        assertEquals(1, VesinikPlus.getAtomicMass());
    }

    @Test
    public void test2(){
        Ioon Nitraat = new Ioon("NO3", -1, 62);
        assertEquals(-1, Nitraat.getCharge());
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void test3(){

        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Kloriid = new Ioon("Cl", -1, 35);

        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Naatrium);
        Ioonid.add(Kloriid);

        Aine1 NaCl = new Aine1(Ioonid);

        assertEquals("NaCl", NaCl.getName());
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void test4(){
        int temp = 0;
        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        temp = Naatrium.getAtomicMass() + Kloriid.getAtomicMass();
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Naatrium);
        Ioonid.add(Kloriid);
        Aine1 NaCl = new Aine1(Ioonid);

        assertEquals(temp, NaCl.getMolecularMass());
    }

    @Test
    public void test5(){
        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Hapnik = new Ioon("O", -2, 16);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Kaltsium);
        Ioonid.add(Hapnik);
        Aine2 CaO = new Aine2(Ioonid);

        assertEquals("CaO", CaO.getName());
    }

    @Test
    public void test6(){
        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Kaltsium);
        Ioonid.add(Kloriid);
        Ioonid.add(Kloriid);
        Aine2 CaCl2 = new Aine2(Ioonid);

        assertEquals("CaCl2", CaCl2.getName());
    }
}
