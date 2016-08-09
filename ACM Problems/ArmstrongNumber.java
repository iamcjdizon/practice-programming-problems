import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int T = s.nextInt();
        System.out.print("Enter the three digit case numbers: ");
        int[] N = new int[T];
        for (int y = 0; y<T; y++)
            N[y] = s.nextInt();
        int ones, tens, hundreds, temp, temp2;
        for(int x=0; x<T; x++)
        {
            
            ones = N[x]%10;
            temp = N[x]/10;
            tens = temp%10;
            hundreds = temp/10;
            if(N[x] == (Math.pow(ones,3) + Math.pow(tens, 3) + Math.pow(hundreds, 3)))
                System.out.println(N[x] + " is an Armstrong Number");
            else
                System.out.println(N[x] + " is not an Armstrong Number");
        }
        
    }
    
}
