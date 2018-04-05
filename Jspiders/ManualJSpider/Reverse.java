import java.util.Scanner;
public class Reverse
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,r,rev=0;
		System.out.println("Enter the number");
		n = s.nextInt();
		m = n;
		while(n!=0)
		{
			r = n%10;
			rev = rev*10+r;
			n = n/10;
		}
		System.out.println("Reverse = "+rev);
	}
}
		