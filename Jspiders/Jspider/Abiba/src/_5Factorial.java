import java.util.Scanner;
public class _5Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int a=1;
		s.close();
		for(int i=n;i>=1;i--){
			a=a*i;
		}
		System.out.println("Factorial "+a);
	}
}
