import java.util.Scanner;

public class Watermelon 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter weight of watermelon in Kilos: ");
        int w = s.nextInt();
        if(1 <= w &&  w<=100)
        {
            if(w%2==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.out.println("INVALID!");
    }
    
}
