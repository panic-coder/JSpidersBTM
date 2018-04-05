import java.util.Scanner;
public class NumberOfDays
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,r,rev=0;
		System.out.println("Enter the number");
		n = s.nextInt();
		int count=0;
		while(n!=0)
		{
			r = n%10;
			n = n/10;
			count++;
		}
		System.out.println(count+" days");
	}
}
		