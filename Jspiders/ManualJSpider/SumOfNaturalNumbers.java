import java.util.Scanner;
public class SumOfNaturalNumbers
{
	int sum(int n)
	{
		int sum=0;
		for(int i = 1;i<=n;i++)
			sum = sum+i;
		return sum;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,add;
		System.out.println("Enter the number");
		n = s.nextInt();
		SumOfNaturalNumbers a = new SumOfNaturalNumbers();
		add = a.sum(n);
		System.out.println("Sum of natural numbers upto "+n+" is "+add);
	}
	
	
}