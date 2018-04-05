import java.util.Scanner;
public class Power
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,m,o;
		System.out.println("Enter the number");
		n = s.nextInt();
		System.out.println("Enter the power");
		m = s.nextInt();
		o = isPower(n,m);
		System.out.println("Power is "+o);
	}
	
	static int isPower(int n,int m)
	{
		int o=1,i;
		for(i=1;i<=m;i++)
			o=o*n;
		return o;
	}
}