import java.util.*;

public class Difficult
{	
	public static void main (String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a number:");
		int N = s.nextInt();
		System.out.print("Enter String: ");
		String[] stringInput = new String[N];
		for (int x = 0; x<N; x++)
		{
			stringInput[x] = s.next();
		}
		
		System.out.print("Enter number of queries: ");
		int Q = s.nextInt();
		int[] searchStart = new int [Q];
		int[] searchEnd = new int[Q];
		String[] stringSearch = new String[Q];

		for(int y = 0; y<=Q-1; y++)
		{
			System.out.print("Enter your search Start[" + (y+1) + "]: ");
			searchStart[y]=s.nextInt();
			System.out.print("Enter your search End[" + (y+1) + "]: ");
			searchEnd[y]=s.nextInt();
			System.out.print("Enter your string to be searched[" + (y+1) + "]: ");
			stringSearch[y] = s.next();
		}
		
		int[] output = new int[Q];
		int temp;
		for(int z=0; z<Q; z++)
		{
			while(searchStart[z]<=searchEnd[z])
			{
				if(stringInput[searchStart[z]-1] == stringSearch[z])
				{
					output[z]=1;
					break;
				}
					
				else
				{
					output[z]=0;
					searchStart[z]++;
				}
					
			}
			System.out.println(output[z]);
		}
		
	}
}