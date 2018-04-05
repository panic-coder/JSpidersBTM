public class PrintNumberWithoutUsingLoop 
{
	static void print(int n)
	{
		System.out.print(n);
		if(n>1)
		{
			print(n-1);
		}
	}
	static void display(int n)
	{
		if(n>1)
		{
			display(n-1);
		}
		System.out.print(n);
	}

	public static void main(String[] args) 
	{
		print(5);
		System.out.println();
		display(5);

	}
}
//GCD
//HCF
//LCM
