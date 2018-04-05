import java.util.Scanner;
public class _2MultiplyWithout {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,m;
		System.out.println("Enter the two numbers");
		n=s.nextInt();
		m=s.nextInt();
		s.close();
		int a = multiply(m,n);
		System.out.println("Product is "+a);
	}

	public static int multiply(int m, int n) {
		int s=0;
		while(m!=0){
			s=s+n;
			m--;
		}
		return s;
	}
}
