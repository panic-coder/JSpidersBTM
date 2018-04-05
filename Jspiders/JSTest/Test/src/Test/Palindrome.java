package Test;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println("enter the number");
		
		boolean gs=isPalindrome(no);
		if(gs)
		{
			System.out.println(no+"number is palindrome"+gs);
		
		}
			else
				System.out.println(no+"number is not palindrome"+gs);
		}
			static boolean isPalindrome(int x)
			{
		         int r  = reverse(x);
				return r==x;
			
			}
			
			static int reverse(int n)
			
			{
				int rev=0;
				do
					{
					int r=n%10;
				rev=rev*10+r;
				n=n/10;
			}while(n!=0);
			return rev;
			
		}

}
