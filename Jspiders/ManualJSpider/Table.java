import java.util.Scanner;
public class Table
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number");
		n = s.nextInt();
		System.out.println("Table of "+n);
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+i*n);
		}
	}
}