import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.util.Scanner;

public class joonis1{
	String nimetus;
	int lahtX;
	int lahtY;
	int suudX;
	int	suudY;
	
	public void joonista(int mitu) throws Exception {
		
		String[] nimed = new String[mitu];
		int[] lahtmedX = new int[mitu];
		int[] lahtmedY = new int[mitu];
		int[] suudmedX = new int[mitu];
		int[] suudmedY = new int[mitu];
		
		Scanner s = new Scanner(System.in);
		
		BufferedImage bi = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.createGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1000, 1000);
		
		for (int i = 0; i < mitu; i++){
			if (i == 0){
				System.out.println("Nimi, lahtX, lahtY, suudX, suudY");
				String input = s.nextLine();
				input = input.replace(" ", "");
				String[] inputArr = input.split(",");

				nimetus = inputArr[0];
				lahtX = Integer.parseInt(inputArr[1]);
				lahtY = Integer.parseInt(inputArr[2]);
				suudX = Integer.parseInt(inputArr[3]);
				suudY = Integer.parseInt(inputArr[4]);
				
				nimed[i] = nimetus;
				lahtmedX[i] = lahtX;
				lahtmedY[i] = lahtY;
				suudmedX[i] = suudX;
				suudmedY[i] = suudY;

				g.setColor(Color.BLUE);
				g.drawLine(lahtX, lahtY, suudX, suudY);
				g.setColor(Color.RED);
				int keskX = (suudX+lahtX)/2;
				int keskY = (suudY+lahtY)/2;
				g.drawString(nimetus, keskX, keskY);
				
			}
			else{
				System.out.println("Nimi, lahtX, lahtY");
				String input = s.nextLine();
				input = input.replace(" ", "");
				String[] inputArr = input.split(",");

				nimetus = inputArr[0];
				lahtX = Integer.parseInt(inputArr[1]);
				lahtY = Integer.parseInt(inputArr[2]);
				
				nimed[i] = nimetus;
				lahtmedX[i] = lahtX;
				lahtmedY[i] = lahtY;

				System.out.println("Sihtjõgi, koht[0; 0.5; 1]");
				input = s.nextLine();
				input = input.replace(" ", "");
				inputArr = input.split(",");

				int lahtX2 = 0;
				int lahtY2 = 0;
				for (i = 0; i < nimed.length; i++){
					if (nimed[i].equals(inputArr[0])){
						suudX = suudmedX[i];
						suudY = suudmedY[i];
						lahtX2 = lahtmedX[i];
						lahtY2 = lahtmedY[i];
					}
				}
				g.setColor(Color.GREEN);
				if (inputArr[1].equals("0")){
					g.drawLine(lahtX, lahtY, lahtX2, lahtY2);
				}
				if (inputArr[1].equals("0.5")){
					g.drawLine(lahtX, lahtY, (suudX+lahtX2)/2, (suudY+lahtY2)/2);
				}
				if (inputArr[1].equals("1")){
					g.drawLine(lahtX, lahtY, suudX, suudY);
					//System.out.println("PUNKTIST: " + lahtX + "." + lahtY + " PUNKTI: " + suudX + "." + suudY);
				}
				g.setColor(Color.RED);
				g.drawString(nimetus, (suudX+lahtX)/2, (suudY+lahtY)/2);
			}
		}
		ImageIO.write(bi, "png", new File("jõed.png"));
		s.close();
	}
	
	public double leiaKaugus(String nimetus, int lahtX, int lahtY, int suudX, int suudY) throws Exception{
		this.nimetus = nimetus;
		this.lahtX = lahtX;
		this.lahtY = lahtY;
		this.suudX = suudX;
		this.suudY = suudY;
		
		//double kaugus = Math.sqrt(Math.pow((Math.abs(suudX-lahtX)), 2) + 
		//Math.pow((Math.abs(suudY-lahtY)), 2));
		double kaugus = Math.round(Math.hypot(Math.abs(suudX-lahtX), Math.abs(suudY-lahtY)) * 100.0) / 100.0;
		
		System.out.print(nimetus +": ");
		return kaugus;
	}
}