import java.util.Scanner;
public class SanjuWedsGeeta
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = s.nextInt();
		if(n%3 == 0 && n%5 ==0)
			System.out.println("SANJU WEDS GEETA");
		else if(n%3==0)
			System.out.println("SANJU");
		else if(n%5==0)
			System.out.println("GEETA");
	}
}