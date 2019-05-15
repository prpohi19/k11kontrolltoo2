// Joone võrrand
// KT2_Roger

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;


interface Lineaarvorrand
{
	public double arvuta_y(double x);
}

class Lihtsam_lineaarv implements Lineaarvorrand
{
	double lineaarliikme_kordaja;

	Lihtsam_lineaarv(double lineaarliikme_kordaja) 
	{
		if ( ! (lineaarliikme_kordaja > 0.0 || lineaarliikme_kordaja < 0.0) ) // Ujukomaarvu täpsuse teema.
		{
			throw new IllegalArgumentException("Lineaarliikme kordaja ei saa olla 0.");
		}
		else
		{
			this.lineaarliikme_kordaja = lineaarliikme_kordaja;
		}		
	}

	public double arvuta_y(double x)
	{
		return this.lineaarliikme_kordaja * x ;
	}
}

class Taielik_lineaarv implements Lineaarvorrand
{
	double lineaarliikme_kordaja;
	double vabaliige;

	Taielik_lineaarv(double lineaarliikme_kordaja, double vabaliige) 
	{
		if ( ! (lineaarliikme_kordaja > 0.0 || lineaarliikme_kordaja < 0.0) ) // Ujukomaarvu täpsuse teema.
		{
			throw new IllegalArgumentException("Lineaarliikme kordaja ei saa olla 0.");
		}
		else
		{
			this.lineaarliikme_kordaja = lineaarliikme_kordaja;
			this.vabaliige = vabaliige;
		}		
	}

	public double arvuta_y(double x)
	{
		return this.lineaarliikme_kordaja * x + vabaliige ;
	}
}

public class Main
{
	public static void main(String[] args)
	{
		String sisendfaili_nimi = "sisend.txt";
		Scanner sisend;

		double a, b, x_min, x_max;
		double samm = 1.0;
		int pikkus;

		try
		{
			sisend = new Scanner(new FileReader( sisendfaili_nimi ));
			try
			{
				a = sisend.nextDouble();
				b = sisend.nextDouble();
				x_min = sisend.nextDouble();
				x_max = sisend.nextDouble();

				pikkus = ((int) ((x_max - x_min) / samm)) + 1;
				
				double [] x_id = new double [pikkus];
				double [] y_id = new double [pikkus];


				for (int i=0; i < pikkus ; i++)
				{
					x_id [i] = i * samm + x_min;
				} 

				if ( b > 0.0 || b < 0.0 ) // Ujukomaarvu täpsuse teema.
				{
					y_id = arvuta_y_jada(x_id, new Taielik_lineaarv(a, b));
				}
				else
				{
					y_id = arvuta_y_jada(x_id, new Lihtsam_lineaarv(a));					
				}

				System.out.println();

				for (int i=0; i < y_id.length; i++)
				{
					System.out.print(y_id[i] + " ");
				}
			}
			catch (Exception w)
			{
				System.out.println("Sisendfaili vormistuse v6i lugemise viga.");
				System.out.println("Kymnendmurrus tuleb komakohtade eraldamiseks " + 
					"kasutada systeemi seadetes m22ratud symbolit (nt koma v6i nt punkt.)");
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Ei leia faili " + sisendfaili_nimi);
		}
		catch (Exception u)
		{
			System.out.println("Muu sisendfaili lugemise viga.");
		}
	}

	public static double [] arvuta_y_jada(double [] x_jada, Lineaarvorrand lineaarv)
	{
		double [] y_jada = new double [x_jada.length];

		for (int i=0; i < x_jada.length; i++)
		{
			y_jada[i] = ((Lineaarvorrand)lineaarv).arvuta_y(x_jada[i]);
		}
		return y_jada;
	}
}

//	Windows 10

//	javac -cp junit4.jar; Main.java TestJunit.java
