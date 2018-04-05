import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int i,n,sum;
		System.out.println("Enter the size");
		n = s.nextInt();
		
		for(i=1;i<=n;i++){
		sum = factorial(i);
		System.out.println(i+"! = "+sum);
		}
	
	}
	
	public static int factorial(int n)
	{
		int sum=1;
		for(int i=n;i>0;i--){
			sum = sum*i;
		}
		
		return sum;
	}
}