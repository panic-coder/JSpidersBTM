import java.util.Scanner;
public class _13Divide {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 2 no.");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a+b;
		int r=0;
		s.close();
		while(c>b){
			c=c-b;
			r++;
		}
		System.out.println(r);
	}
}
