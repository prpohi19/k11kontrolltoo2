import java.io.*; 
import java.util.*;
public class Program {
    public static void main(String[] args)throws Exception{
        File file=new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line=br.readLine();

        while(line !=null){
            sb.append(line);
            sb.append(System.lineSeparator());
            line=br.readLine();
        }
        String everything=sb.toString();
        br.close();
        //System.out.println(everything);
        
        ArrayList<String> splitted= new ArrayList<String>(Arrays.asList(everything.split("-|\\n|\\.|\\,| ")));
        //Arrays.stream(splitted).forEach(str -> System.out.println(str));
        
        int count3=0;
        ArrayList<Integer> counterAt=new ArrayList<>();
        int uniques=0;
        int duplicates=0;
        ArrayList<String> checked=new ArrayList<String>();
        //System.out.println(splitted[3]);
        for(int i=0;i<splitted.size();i++){
            if(splitted.get(i).length()==3){
                count3++;
                if(!checked.contains(splitted.get(i).toLowerCase())){
                    checked.add(splitted.get(i).toLowerCase());
                    counterAt.add(i);
                    uniques++;            
                }   
            }
        }
        for(int i=0;i<counterAt.size();i++){
            System.out.print("Kohal ");
            System.out.print(counterAt.get(i));
            System.out.print(" "+i+" erinevat 3 tähelist s6na");
            System.out.println("\n");
        }
        //System.out.println("Amount of 3 letter words: "+ count3);
        //System.out.println(Arrays.deepToString(checked.toArray()));
        //System.out.println(Arrays.deepToString(splitted.toArray()));
        //System.out.println(Arrays.deepToString(counterAt.toArray()));
        //System.out.println(uniques);
        //System.out.println(Arrays.deepToString(counterAt.toArray()));
        System.out.println("--------------");
        grapher(2,splitted);
        grapher(3,splitted);
        grapher(4,splitted);
        grapher(5,splitted);
        grapher(6,splitted);
        grapher(7,splitted);
        grapher(8,splitted);
        grapher(9,splitted);
        grapher(10,splitted);
        //grapher(3,splitted);
    }       
        
    public static void grapher(int target, ArrayList<String> splitted){
        int count=0;
        System.out.println();
        System.out.print("LET US FIND HOW MANY ");
        System.out.print(target);
        System.out.print(" LETTER WORDS THERE ARE UP IN THIS B****");
        System.out.println();
        System.out.println("-----");
        ArrayList<String> checked=new ArrayList<String>();
        ArrayList<Integer> counterAt=new ArrayList<>();
        ArrayList<String> output=new ArrayList<String>();
        for(int i=0;i<splitted.size();i++){
            if(splitted.get(i).length()==target){
                if(!checked.contains(splitted.get(i).toLowerCase())){
                    checked.add(splitted.get(i).toLowerCase());
                    counterAt.add(i);
                    count++;             
                }   
            }
        }
        String space=" ";
        for(int i=0;i<100;i++){
            output.add(space);
        }
        for(int j=counterAt.size();j>0;j--){
            double stage1=(counterAt.get(j-1));
            double stage2=splitted.size();
            double stage3=(stage1/stage2);
            double stage4=stage3*100;
            int stage5 = (int) stage4;
            //System.out.println(stage1);
            //System.out.println(stage2);
            //System.out.println(stage3);
            //System.out.println(stage4);
            //System.out.println(stage5);
            //System.out.print(count);      
            String numberAsString = String.format("%3d", count);
            System.out.print(numberAsString);
            System.out.print("  |");
            output.add(stage5, String.valueOf(counterAt.get(j-1)));
            //System.out.println(counterAt.get(j-1));
            count--;          
            for(String object: output){
                System.out.print(object);
            }
            output.clear();
            for(int i=0;i<100;i++){
                output.add(space);
            }
            System.out.print("\n");

        }
        output.clear();
        System.out.print("     |");
        for(int n=0;n<100;n++){
            if(n==25 || n==50 || n==75 ){
                output.add("*");
            }else{
                output.add("-");
            }
        }
        for(String object: output){
            System.out.print(object);
        }

        System.out.println();
    }          
}
