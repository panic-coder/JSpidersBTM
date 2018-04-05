import java.util.ArrayList;
import java.util.Scanner;
public class NthFibonacciNumber 
{
	static int[] arr;
	static int fibo(int n)
	{
		if(arr==null)
		{
			arr=new int[n+1];
		}
		if(n==1)
		{
			return 0;
		}
		if(n==2)
		{
			return 1;
		}
		if(arr[n-1]==0)
		{
			arr[n-1]=fibo(n-1);
		}
		if(arr[n-2]==0)
		{
			arr[n-2]=fibo(n-2);
		}
		return arr[n-1]+arr[n-2];
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number:");
		int n=sc.nextInt();
		System.out.println(fibo(n));

	}

}
