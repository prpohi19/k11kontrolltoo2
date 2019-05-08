import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception{
    BufferedReader lugeja = new BufferedReader(new FileReader("andmed.txt"));
    String rida = lugeja.readLine();
    int mitu = Integer.parseInt(rida);
    for(int i=0;i<mitu;i++){
      rida = lugeja.readLine();
      String [] row = rida.split(" ");
      //Car car[i] = new Car(Double.parseDouble(row[0]), Double.parseDouble(row[1]));
    }
    Car carA = new Car(0, 70);
    Car carB = new Car(10, -70);
    Car carC = new Car(5, 110);
    System.out.println("Autod kohtuvad "+carB.meeting(carA)+" kilomeetri peal.");
    System.out.println("Autod kohtuvad "+carC.meeting(carA)+" kilomeetri peal.");
  }



}


//6.1 carB
