package assignment;
import java.util.Scanner;
public class c 
{
	public static void main(String []args)
	{
		int temp;
		boolean isprime = true;
		Scanner in = new Scanner(System.in);
		System.out.println("enter number");
		// capture the input in an
		int num = in.nextInt();
		for(int i = 2; i<= num/2; i++)
		{
			temp = num%i;
			if (temp ==0)
			{
				isprime = false;
				break;
			}
		}
		// If isprime is true then
		if(isprime)
			System.out.println("odd");
		else
			System.out.println("even");
	}

}
