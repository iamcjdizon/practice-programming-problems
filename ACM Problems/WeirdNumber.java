import java.util.*;

public class WeirdNumber
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if (num>= 1 && num <=100)
        {
            if((num%2==1) || ((num<=20) && num>=6))
                System.out.println("Weird!");
            else if((num<=5 && num >= 2) || (num>20))
                System.out.println("Not Weird!");
        }
    }
    
}
