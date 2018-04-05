import java.util.Scanner;
public class _16Armstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		s.close();
		int r,sum=0,m=n;
		while(n>0){
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(m==sum)
			System.out.println(sum+" is Palindrome");
		else
			System.out.println(sum+" is not Palindrome");
	}
}
