
public class Bingbong
{	
	public static void main (String[] args)
	{
		for (int x=1; x<=15;x++)
			{
				if(x%3==0) System.out.print("Bing\n");
				if(x%5==0) System.out.print("Bong\n");
				if(x%15==0) System.out.print("BingBong\n");
			}
	}
}