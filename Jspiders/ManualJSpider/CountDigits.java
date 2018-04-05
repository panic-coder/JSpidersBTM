import java.util.Scanner;
class CountDigits
{
	public static void main(String args[])
	{
		CountDigits d = new CountDigits();
		Scanner s = new Scanner(System.in);
		int n,m;
		System.out.println("Enter the number");
		
		n = s.nextInt();
		
		m = d.numberOfDigits(n);
		System.out.println("No of digits in "+n+" is "+m);
	}
	
	int numberOfDigits(int x)
	{
		int count = 0;
		while(x!=0)
		{
			count++;
			x = x/10;
		}
		
		return count;
	}
}
		