import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int s = sc.nextInt();
		fib(s);

		
	}
	
	
	static void fib(int m)
	{
		int n1=0,n2=1,n3,p=1,i,sum=1;
		System.out.print(n1+"\t");
		System.out.print(n2+"\t");
		for (i=2;i<m;i++)
		{
			
			n3=n1+n2;
			System.out.print(n3+"\t");
				//p++;
			sum=sum+n3;
													
			n1=n2;
			n2=n3;
			
			
		}
		System.out.println();
		System.out.println(sum);
	}

}
