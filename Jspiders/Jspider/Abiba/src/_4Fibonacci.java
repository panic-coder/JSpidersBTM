import java.util.Scanner;
public class _4Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0,b=1;
		System.out.println("Enter the range");
		int n = s.nextInt();
		s.close();
		System.out.print(a+"  "+b+"  ");
		for(int i=0;i<n-2;i++){
			int sum=0;
			sum=a+b;
			System.out.print(sum+"  ");
			int c=a+b;
			a=b;
			b=c;
		}
	}

}
