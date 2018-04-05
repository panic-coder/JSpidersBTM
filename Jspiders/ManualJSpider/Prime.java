import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;boolean m;
		System.out.println("Enter the number");
		n = s.nextInt();
		m = isPrime(n);
		
		if(m==true)
			System.out.println(n+" is Prime Number");
		else
			System.out.println(n+" is not Prime Number");
	}
	
	static boolean isPrime(int n)
	{
		int i,count;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}