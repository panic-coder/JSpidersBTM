import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age = sc.nextInt();
		if(age>=18)
			System.out.println("\nEligible to vote");
		else
			System.out.println("\nNot Eligible to vote");
	}
}
	