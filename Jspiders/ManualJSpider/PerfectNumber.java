import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i,n,m,sum;
		System.out.println("Enter the number");
		n = s.nextInt();
		m=n;
		PerfectNumber p = new PerfectNumber();
		sum = p.isPerfect(n);
		
		if(m==sum)
			System.out.println(m+" is a Perfect Number");
		else
			System.out.println(m+" is not a Perfect Number");
	}
	
	int isPerfect(int n)
	{
		int i,sum =0;
		for( i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum = sum + i;
		}
		/*i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum = sum + i;
			i++;
		}*/
		
		return sum;
	}
}