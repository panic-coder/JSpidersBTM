import java.util.Scanner;
public class PrimeRange
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i;boolean m;
		
		for(i=2;i<=100;i++){
		m = isPrime(i);
		
		if(m==true)
			System.out.println(i);
		//else
			//System.out.println(n+" is not Prime Number");
		}
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