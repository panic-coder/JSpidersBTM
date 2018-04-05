import java.util.Scanner;
//import java.lang.*;
public class DecimalToBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int b = isBinary(n);
		//String b = isBinary(n);
		System.out.println(b+" is  Binary for "+n);
	}
	
	static int isBinary(int n)
	{
		int b,rev=1;
		while(n!=0)
		{
			b=n%2;
			rev = rev*10+b;
			n=n/2;
		}
		return Integer.reverse(rev);
	}
	
	/*static String isBinary(int n)
	{
		String bin = "";int b;
		while(n!=0)
		{
			b=n%2;
			bin=b+bin;
			n=n/2;
		}
		return bin;
	}*/
}
	
	