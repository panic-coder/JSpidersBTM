import java.util.Scanner;
public class Factorial
{
	int fact(int n)
	{
		int fact=1;
		for(int i = 1;i<=n;i++)
			fact = fact*i;
		return fact;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,f;
		System.out.println("Enter the number");
		n = s.nextInt();
		Factorial a = new Factorial();
		f = a.fact(n);
		System.out.println("Factorial of "+n+" is "+f);
	}
	
	
}