import java.util.Scanner;
public class Fifteen
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int i; 
		for(i=1;i<=n;i++)
		{
			
			int k=i;
			for(int j=1;j<=i;j++)
			{	
				
				
					System.out.print(k+" ");
					k=k+n-j;
			}
			System.out.println();
			
		}
	}
}
		