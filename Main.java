import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("ained.txt"));

        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        Ioon Hapnik = new Ioon("O", -2, 16);
        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Lämmastik = new Ioon("N", -3, 14);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Kaltsium);
        Ioonid.add(Kloriid);
        Ioonid.add(Hapnik);
        Ioonid.add(Naatrium);
        Ioonid.add(Lämmastik);
        BufferedWriter writer = new BufferedWriter(new FileWriter("ained.txt"));

        while(running) {
            List<Ioon> KasutajaIoonid = new ArrayList<>();
            System.out.print("Kasutatavad ioonid on: ");
            for(Ioon ioon : Ioonid){
                System.out.print(ioon.getName() + " ");
            }
            System.out.println("");
            System.out.println("Mitemest ioonidest soovite ainet koostada: ");
            int n = input.nextInt();
            input.nextLine();
            String forFile = "";
            for(int i = 0; i < n; i++) {
                boolean correct = false;
                while(!correct) {
                    System.out.println("Sisestage ioon: ");
                    String temp = input.nextLine();
                    int ok = check(temp, Ioonid);
                    if(ok > 0){
                        correct = true;
                        forFile += temp + " ";
                    }else{
                        System.out.println("Ioon ei eksisteeri!");
                    }
                }
            }
            System.out.println(forFile);
            writer.append(forFile);
            writer.newLine();
            //writer.append("\n");
            System.out.println("Kas soovid sisestada veel ühe aine? y/n");
            String temp = input.nextLine();

            if(temp.equals("n")){
                running = false;
            }

        }

        writer.close();
        String line = reader.readLine();
        while (line != null){
            List<Ioon> ained = new ArrayList<>();
            String[] molec = line.split(" ");
            for(int i = 0; i < molec.length; i++){
                if(molec[i].equals("Ca")){
                    ained.add(Kaltsium);
                }else if(molec[i].equals("Cl")){
                    ained.add(Kloriid);
                }else if(molec[i].equals("O")){
                    ained.add(Hapnik);
                }else if(molec[i].equals("Na")){
                    ained.add(Naatrium);
                }else if(molec[i].equals("N")){
                    ained.add(Lämmastik);
                }
            }
            Aine2 Aine = new Aine2(ained);

            System.out.print("Ioonid: ");
            for(int i = 0; i < molec.length; i++){
                System.out.print(molec[i] + " ");
            }
            System.out.println("");
            if(Aine.getName() != null){
                System.out.println("Aine mis loodi: " + Aine.getName());
            }else{
                System.out.println("Ainet pole võimalik luua");
            }
            line = reader.readLine();
        }

    }

    public static int check(String input, List<Ioon> Ioonid){
        int temp = 0;
        for(Ioon ioon : Ioonid){
            if(input.equals(ioon.getName())){
                temp +=1;
            }
        }

        return temp;
    }
}
