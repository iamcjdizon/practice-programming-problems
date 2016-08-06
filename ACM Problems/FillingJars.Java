import java.util.*;

public class FillingJars
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner (System.in);
        System.out.print("Enter number of jars and number of operations: ");
		String lines = s.nextLine();
		String[] strs = lines.trim().split("\\s+");
		//int[] a = new int[strs.length];
		int N=0, M=0, a=0, b=0, k=0, ans=0;
		for (int i = 0; i<strs.length; i++)
		{
			if(i==0)
				N = Integer.parseInt(strs[i]);
			else if(i==1)
				M = Integer.parseInt(strs[i]);
			else
			{
				System.out.print("ERROR!");
				System.exit(0);
			}
				
		}
		
		for(int x = 1; x<=M; x++)
		{
			System.out.print("Enter indices a and b and number of candies: ");
			String haba = s.nextLine();
			String[] pangalan = haba.trim().split("\\s+");
			for (int y = 0; y<pangalan.length; y++)
			{
				if(y==0)
					a = Integer.parseInt(pangalan[y]);
				else if(y==1)
					b = Integer.parseInt(pangalan[y]);
				else if(y==2)
					k = Integer.parseInt(pangalan[y]);
				else
				{
					System.out.print("ERROR!");
					System.exit(0);
				}
			}
			ans = ans + ((Math.abs(b-a)+1)*k);
		}
		ans = ans/N;
		System.out.print("Average candies = " + ans);
		
	}
}
