import java.util.Scanner;
class EvenOddWithoutIf
{
	public static void main(String args[])
	{ 
		Scanner sc = new Scanner(System.in);
		int n;
		String St[]={"Even","Odd"};
		System.out.println("Enter the number");
		n = sc.nextInt();
		System.out.println(n+" is "+St[n%2]);
	}
}