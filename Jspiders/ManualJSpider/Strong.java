import java.util.Scanner;
public class Strong
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = s.nextInt();
		for(int i =1;i<=n;i++)
		{
			boolean rs = isStrong(i);
			if(rs)
				System.out.println(i+" is Strong");
		}
	}
	
	static boolean isStrong(int n)
	{
		int r,sum=0,m;
		m = n;
		while(n!=0)
		{
			r = n%10;
			sum = sum+fact(r);
			n = n/10;
		}
		/*if(m==sum)
			return true;
		
		else 
			return false;*/
		return (m==sum);
	}
	
	static int fact(int r)
	{
		int fact=1,i;
		for(i=1;i<=r;i++)
			fact=fact*i;
		return fact;
	}
}
	 

			