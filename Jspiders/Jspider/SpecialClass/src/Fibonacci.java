
public class Fibonacci {

	public static void main(String[] args) {
		int n=0,n1=1,i,n3;
		System.out.println(n);
		System.out.println(n1);
		for ( i = 2; i<15; ++i)
		{
			n3=n+n1;
			System.out.println(n3);
			n=n1;
			n1=n3;
		}
		
	}

}
