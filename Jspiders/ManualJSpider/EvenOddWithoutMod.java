import java.util.Scanner;
class EvenOddWithoutMod
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = sc.nextInt();
		if(n/2*2==n)
			System.out.println(n+" is EVEN");
		else
			System.out.println(n+" is ODD");
	}
}