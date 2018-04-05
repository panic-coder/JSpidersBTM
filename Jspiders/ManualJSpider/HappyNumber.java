import java.util.Scanner;
public class HappyNumber
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		boolean b = isHappy(n);
		if(b)
			System.out.println(n+" is Happy Number");
		else
			System.out.println(n+" is Not a Happy Number");
	}
	
	static boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0,r;
			while(n!=0)
			{
				r = n%10;
				sum = sum + (r*r);
				n = n/10;
			}
			n=sum;
		}
		return n==1||n==7;
	}
}