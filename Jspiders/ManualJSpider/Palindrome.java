import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = s.nextInt();
		
		boolean rs = isPalindrome(n);
		if(rs)
			System.out.println(n+" is Palindrome");
		else 
			System.out.println(n+" is not Palindorme");
	}
	
	static boolean isPalindrome(int n)
	{
		int r,sum=0,m;
		m = n;
		while(n!=0)
		{
			r = n%10;
			sum = sum*10+r;
			n = n/10;
		}
		if(m==sum)
			return true;
		
		else 
			return false;
	}
}
			