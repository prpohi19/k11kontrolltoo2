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

        


        //System.out.println("Amount of 3 letter words: "+ count3);
        //System.out.println(Arrays.deepToString(checked.toArray()));
        //System.out.println(Arrays.deepToString(splitted.toArray()));
        //System.out.println(Arrays.deepToString(counterAt.toArray()));
        //System.out.println(uniques);
        //System.out.println(Arrays.deepToString(counterAt.toArray()));
        for(int i=0;i<counterAt.size();i++){
            System.out.print("Kohal ");
            System.out.print(counterAt.get(i));
            System.out.print(" "+i+" erinevat s6na");
            System.out.println("\n");
        }
        
        
        

      
           
    }
}