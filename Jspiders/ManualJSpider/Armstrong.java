import java.util.Scanner;
public class Armstrong
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = s.nextInt();
		
		boolean rs = isArmstrong(n);
		if(rs)
			System.out.println(n+" is Armstrong");
		else 
			System.out.println(n+" is not Armstrong");
	}
	

	static boolean isArmstrong(int n)
	{
		int r,sum=0,m;
		m = n;
		int p = numberOfDigits(n);
		while(n!=0)
		{
			r = n%10;
			sum = sum+power(r,p);
			n = n/10;
		}
		return (m==sum);
	}
	
	static int power(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

	static int numberOfDigits(int n)
	{
		int c=0;
		do
		{
			c++;
			n=n/10;
		}while(n!=0);
		return c;
	}
		
}