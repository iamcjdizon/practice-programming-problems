import java.util.*;

public class ArctanSeries
{	
	public static void main (String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a number for x: ");
		double x = s.nextDouble();
		System.out.print("Enter number of k: ");
		int k = s.nextInt();
		double arctan = 0;
		int ctr = 1;
		for (int y=1; y<=k; y=y+2)
		{
			if (ctr % 2 == 1)
				arctan = arctan + Math.pow(x,y)/y;
		
			if (ctr % 2 == 0)
				arctan = arctan - Math.pow(x,y)/y;
			
			ctr++;
		}
		System.out.print("arctan (" + x + ") = "+ arctan);
	}
}